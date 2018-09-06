package eventechPackage;

import java.sql.PreparedStatement;
import java.util.Date;
import java.util.*;
import java.sql.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.*;

public class RegisterEvent {

	public String registerEvent(Evenement event) {

		String nom = event.getNom();
		String lieu = event.getLieu();
		Date date = event.getDateEvenement();
		String desc = event.getDescription();
		String theme = event.getTheme();
		int place = event.getPlaceMax();
		Time heure = event.getHeure();
		String image = event.getImg();

		Connection con = null;
		PreparedStatement preparedStatement = null;


		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();

			String query = "insert into evenement(nom,lieu,date_evenement,description,theme,place_max,heure_debut,img) values (?,?,?,?,?,?,?,?)";

			preparedStatement = con.prepareStatement(query); // Making use of prepared statements here to insert bunch
																// of data

			preparedStatement.setString(1, nom);
			preparedStatement.setString(2, lieu);
			preparedStatement.setDate(3, (java.sql.Date) date);
			preparedStatement.setString(4, desc);
			preparedStatement.setString(5, theme);
			preparedStatement.setInt(6, place);
			preparedStatement.setTime(7, heure);
			preparedStatement.setString(8, image);
			

			int i = preparedStatement.executeUpdate();

			if (i != 0) { // Just to ensure data has been inserted into the database
				return "SUCCESS";
			}else {
				System.out.println("Something went wrong...");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			
		}

		return "Oops.. Something went wrong there..!"; // On failure, send a message from here.
	}

}
