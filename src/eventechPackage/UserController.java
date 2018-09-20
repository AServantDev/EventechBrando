package eventechPackage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.Date;

import javax.servlet.http.HttpSession;

import eventechPackage.RegisterUser;
import eventechPackage.ConnectUser;
import com.mysql.jdbc.Connection;

import eventechPackage.Login;

public class UserController {

	public String registerUser(User user) {

		String prenom = user.getPrenom();
		String nom = user.getNom();
		String mail = user.getEmail();
		String password = user.getPassword();

		Connection con = null;
		PreparedStatement preparedStatement = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();

			String sql = "INSERT INTO users(nom, prenom, email, mot_de_passe) VALUES (?,?,?,?)";

			preparedStatement = con.prepareStatement(sql); // Making use of prepared statements here to insert bunch
															// of data

			preparedStatement.setString(1, nom);
			preparedStatement.setString(2, prenom);
			preparedStatement.setString(3, mail);
			preparedStatement.setString(4, password);

			int J = preparedStatement.executeUpdate();

			if (J != 0) { // Just to ensure data has been inserted into the database
				return "SUCCESS";
			} else {
				System.out.println("Please fill your information correctly...");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();

		}

		return "Oops.. Something went wrong there..!";
	}

	public String connectUser(HttpSession session) {

		Connection con = null;
		Statement st = null;

		String test = "";

		ResultSet result = null;

		Login createLog = new Login();

		String logged = "<p>Bienvenue ";
		String notLogged = "<a href=\"connection.jsp\">Connectez vous</a>";

		session.setAttribute("connect", notLogged);

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();

			st = con.createStatement();

			String sql = "SELECT * FROM users WHERE email='" + session.getAttribute("mailCo") + "'";

			result = (ResultSet) st.executeQuery(sql);

			createLog.setPwd("");

			while (result.next()) {

				createLog.setOk(true);
				createLog.setPwd(result.getString("mot_de_passe"));
				createLog.setName(result.getString("prenom"));
				createLog.setIdCo(result.getInt("id_user"));
				createLog.setAge(result.getInt("age"));
				createLog.setFamilyName(result.getString("nom"));
				System.out.println(result.getString("nom"));

			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (createLog.getOk() == true) {
			if ((createLog.getPwd()).equals(session.getAttribute("passwordCo"))) {
				System.out.println("ok");
				session.setAttribute("prenom", createLog.getName());
				session.setAttribute("isConnected", true);
				session.setAttribute("connect", logged);
				session.setAttribute("idCo", createLog.getIdCo());
				session.setAttribute("Fnom", createLog.getFamilyName());
				session.setAttribute("age", createLog.getAge());
				session.setAttribute("password", createLog.getPwd());
				System.out.println("yes!");
				test = "SUCCESS";

			} else {

				session.setAttribute("isConnected", false);
				session.setAttribute("connect", notLogged);
				System.out.println("no!");
				test = "miss";

			}

		}
		System.out.println("okokokok");
		System.out.println(test);
		return test;

	}

	public String participerEvent(HttpSession session, ParticipationModel participant) {



		Evenement event = new Evenement();

		// variables pour stocker les attributs du model
		int ourIdUser = participant.getOurIDuser();
		int ourIdEvent = participant.getOurIDevent();
		String mailUser = participant.getEmailUser();

		Statement st = null;

		PreparedStatement pst = null;

		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();

			// Requete pour récupérer les infos propre à IdEvent
			String sql0 = "SELECT * FROM evenement WHERE id_event ='" + ourIdEvent + "'";
			String sql1 = "INSERT INTO participants(id_event,id_user,email_user,nom_event) VALUES(?,?,?,?)";
			String sql2 = "UPDATE evenement SET nb_participant = nb_participant + 1, place_restante=place_restante-1 WHERE id_event ='" + ourIdEvent
					+ "'";

			st = con.createStatement();

			ResultSet result = (ResultSet) st.executeQuery(sql0);
			while (result.next()) {
				System.out.println("okkkkkk");

				// Récupération des infos de l'event (nom) grace au select et à la boucle while
				// avec le result
				participant.setNomEvent(result.getString("nom"));
				System.out.println(result.getString("nom"));
				event.setPlaceMax(result.getInt("place_max"));
				event.setNbParticipant(result.getInt("nb_participant"));
				event.setPlaceRestante(result.getInt("place_restante"));

			}

			// Variable pour y stocker le nom de l'event en l'occurence
			String eventName = participant.getNomEvent();

			// Participants

			pst = con.prepareStatement(sql2);

			int o = pst.executeUpdate();
			if (o != 0) {
				System.out.println("InscriptionParticipant worked");
			} else {
				System.out.println("nothing");
			}

			// Deuxième requete sql, une insertion ( PreparedStatement )
			pst = con.prepareStatement(sql1);

			pst.setInt(1, ourIdEvent);
			pst.setInt(2, ourIdUser);
			pst.setString(3, mailUser);
			pst.setString(4, eventName);

			int J = pst.executeUpdate();

			if (J != 0) { // Just to ensure data has been inserted into the database
				return "SUCCESS";
			} else {
				System.out.println("Please fill your information correctly...");
			}

		}

		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();

		}

		return "Oops.. Something went wrong there..!";
	}

	public String showProfile(User user) {

		int id = user.getId_user();

		Connection con = null;
		Statement st = null;
		String test = "";

		try {

			System.out.println("okbite");
			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();

			String sql0 = "SELECT * FROM users WHERE id_user ='" + id + "'";

			st = con.createStatement();

			ResultSet result = (ResultSet) st.executeQuery(sql0);

			while (result.next()) {

				user.setAge(result.getInt("age"));
				user.setNom(result.getString("nom"));
				user.setPrenom(result.getString("prenom"));
				user.setEmail(result.getString("email"));
				user.setPassword(result.getString("mot_de_passe"));
				test = "SUCCESS";
				System.out.println("okbite2");
				return test;

			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return test;

	}

}

// On failure, send a message from here.
// On failure, send a message from here.
