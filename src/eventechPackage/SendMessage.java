package eventechPackage;
import java.io.IOException;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class SendMessage
 */
@WebServlet("/SendMessage")
public class SendMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public SendMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * Récupération des données saisies, envoyées en tant que paramètres de
		 * la requête GET générée à la validation du formulaire
		 */

		String typeUser = request.getParameter( "typeUser" );
		String nom = request.getParameter( "nom" );
		String prenom = request.getParameter( "prenom" );
		String entreprise = request.getParameter( "entreprise" );
		String email = request.getParameter( "email" );
		String message = request.getParameter( "message" );

		/*
		 * Création du bean contact et initialisation avec les données récupérées
		 */
		contact contact = new contact();

		contact.setTypeUser( typeUser );
		contact.setNom( nom );
		contact.setPrenom( prenom );
		contact.setEntreprise( entreprise );
		contact.setEmail( email );
		contact.setMessage( message );

		try {

			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/Eventech";
			String user = "root";
			String pwd = "SimplonMYSQL34";
		
			Connection con = (Connection) DriverManager.getConnection(url, user, pwd);

			PreparedStatement ps = con.prepareStatement("insert into Eventech.contact values(?,?,?,?,?,?)");

			ps.setString(1,typeUser);
			ps.setString(2,nom);
			ps.setString(3,prenom);
			ps.setString(4,entreprise);
			ps.setString(5,email);
			ps.setString(6,message);

			int s = ps.executeUpdate();

			if (s > 0) {
				this.getServletContext().getRequestDispatcher( "/messageEnvoye.jsp" ).forward(request, response );
			} else {
				System.out.print("Votre requête est incomplète. Merci de réitérer.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("Votre requête est incomplète. Merci de réitérer."); 
		}
		}
	}
