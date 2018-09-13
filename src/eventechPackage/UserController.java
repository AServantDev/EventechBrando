package eventechPackage;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.Date;

import javax.servlet.http.HttpSession;

import eventechPackage.RegisterUser;
import eventechPackage.ConnectUser;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
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

			String sql = "insert into users(nom, prenom, email, mot_de_passe) values (?,?,?,?)";

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
		Statement st2 = null;
		Statement st3 = null;
		String test = "";

		ResultSet result = null;
		ResultSet result2 = null;
		ResultSet result3 = null;

		Login createLog = new Login();

		String logged = "<p>Bienvenue ";
		String notLogged = "<a href=\"connection.jsp\">Connectez vous</a>";
		session.setAttribute("connect", notLogged);
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();
			
			st = con.createStatement();
			st2 = con.createStatement();
			st3 = con.createStatement();

			String sql = "SELECT mot_de_passe, email FROM users WHERE email='" + session.getAttribute("mailCo")
					+ "'";

			result = (ResultSet) st.executeQuery(sql);

			createLog.setPwd("");

			while (result.next()) {
				
				createLog.setOk(true);
				createLog.setPwd(result.getString("mot_de_passe"));

			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (createLog.getOk() == true) {
			if ((createLog.getPwd()).equals(session.getAttribute("passwordCo"))) {
				System.out.println("ok");
				session.setAttribute("isConnected", true);
				session.setAttribute("connect", logged);
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

} // On failure, send a message from here.
