package eventechPackage;

import java.sql.PreparedStatement;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.*;
import java.sql.*;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.*;

public class EventController {

	public String registerEvent(Evenement event, HttpSession session) {

		String nom = event.getNom();
		String lieu = event.getLieu();
		Date date = event.getDateEvenement();
		String desc = event.getDescription();
		String theme = event.getTheme();
		int place = event.getPlaceMax();
		Time heure = event.getHeure();
		String image = event.getImg();
		int id = event.getId_organisateur();
		String rapDesc = event.getDescriptionBreve();
		int placeRestante = (event.getPlaceRestante());

		Connection con = null;
		PreparedStatement preparedStatement = null;


		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();

			String query = "insert into evenement(nom,lieu,date_evenement,description,theme,place_max,heure_debut,img,id_organisateur, description_rapide,place_restante,nb_participant) values (?,?,?,?,?,?,?,?,?,?,?,?)";

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
			preparedStatement.setInt(9, id);
			preparedStatement.setString(10, rapDesc);
			preparedStatement.setInt(11, placeRestante);
			preparedStatement.setInt(12,  0);
			

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

	
	public String displayEvent(Evenement event) {
		
		String test = "";
		
		
		int idEvent = event.getId_event();

		Connection con = null;
		Statement st = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = (Connection) CreateConnection.createConnection();  
			
			String sql = "SELECT * FROM evenement WHERE id_event = '" + idEvent +"'";
			st = (Statement) con.createStatement();
			
			ResultSet result = (ResultSet) st.executeQuery(sql);
			
			
			while (result.next()) {
				

				event.setNom(result.getString("nom"));
				event.setDateEvenement(result.getDate("date_evenement"));
				event.setLieu(result.getString("lieu"));
				event.setDescription(result.getString("description"));
				event.setTheme(result.getString("theme"));
				event.setHeure(result.getTime("heure_debut"));
				event.setPlaceMax(result.getInt("place_max"));
				event.setImg(result.getString("img"));
				event.setId_organisateur(result.getInt("id_organisateur"));
				event.setPlaceRestante(result.getInt("place_restante"));
				event.setNbParticipant(result.getInt("nb_participant"));
				
			
				
				test = "SUCCESS";
				System.out.println("ok");
				System.out.println(event.getNom());
				System.out.println(result.getInt("place_restante"));
				System.out.println(event.getPlaceRestante());
				
			}
			
			return test;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;
		
		
		
				
	}


	public ArrayList<Evenement> displayEventByTheme(ArrayList<Evenement> eventByTheme, Evenement event, Evenement eventTheme) {
		
		String theme = event.getTheme();
		
		System.out.println(theme);
		Connection con = null;
		
		
		

		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			con = CreateConnection.createConnection();
			
			String sqlRequete = "SELECT * FROM evenement WHERE theme='"+theme+"'";

			Statement st = (Statement) con.createStatement();
			ResultSet result = (ResultSet) st.executeQuery(sqlRequete);

			while (result.next()) {
				eventTheme = new Evenement();

				eventTheme.setId_event(result.getInt("id_event"));
				System.out.println(result.getInt("id_event"));
				eventTheme.setNom(result.getString("nom"));
				eventTheme.setLieu(result.getString("lieu"));
				eventTheme.setDateEvenement(result.getDate("date_evenement"));
				eventTheme.setPlaceMax(result.getInt("place_max"));
				eventTheme.setDescription(result.getString("description"));
				eventTheme.setDescriptionBreve(result.getString("description_rapide"));
				eventTheme.setTheme(result.getString("theme"));
				
				
				
				eventByTheme.add(eventTheme);

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eventByTheme;
	}
}
