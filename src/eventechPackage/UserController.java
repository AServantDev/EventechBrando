package eventechPackage;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import eventechPackage.RegisterUser;

import com.mysql.jdbc.Connection;

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
} // On failure, send a message from here.
