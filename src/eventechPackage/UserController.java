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
			
			

			String sql = "SELECT mot_de_passe, email, prenom, id_user FROM users WHERE email='" + session.getAttribute("mailCo")
					+ "'";

			result = (ResultSet) st.executeQuery(sql);

			createLog.setPwd("");

			while (result.next()) {
				
				createLog.setOk(true);
				createLog.setPwd(result.getString("mot_de_passe"));
				createLog.setName(result.getString("prenom"));
				createLog.setIdCo(result.getInt("id_user"));
				

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
				System.out.println("yes!");
				test = "SUCCESS";

			} else {

				session.setAttribute("isConnected", false);
				session.setAttribute("connect", notLogged);
				System.out.println("no!");
				test = "miss";
			}

		}
		return test;

		

	}

	
	public String participerEvent(HttpSession session, ParticipationModel participant) {

		int ourIdUser = participant.getOurIDuser();
		


		int ourIdEvent = participant.getOurIDevent();

		
		

		PreparedStatement pst = null ;

		Connection con = null;


		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();

			String sql = "INSERT INTO participants(id_event,id_user) VALUES(?,?)";

			pst = con.prepareStatement(sql);

			pst.setInt(1, ourIdEvent);
			pst.setInt(2, ourIdUser);

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
}

// On failure, send a message from here.
 // On failure, send a message from here.
