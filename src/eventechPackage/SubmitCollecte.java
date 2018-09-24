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
 * Servlet implementation class SubmitCollecte
 */
@WebServlet("/SubmitCollecte")
public class SubmitCollecte extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SubmitCollecte() {
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

		String montant = request.getParameter( "montant" );
		String typeUser = request.getParameter( "typeUser" );
		String nom = request.getParameter( "nom" );
		String prenom = request.getParameter( "prenom" );
		String entreprise = request.getParameter( "entreprise" );
		String email = request.getParameter( "email" );
		String dateNaissance = request.getParameter( "dateNaissance" );
		String rue = request.getParameter( "rue" );
		String codePostal= request.getParameter( "codePostal" );
		String ville = request.getParameter( "ville" ); 
		String pays = request.getParameter( "pays" );


		/*
		 * Création du bean contact et initialisation avec les données récupérées
		 */

		collecte collecte = new collecte();

		collecte.setMontant( montant );
		collecte.setTypeUser( typeUser );
		collecte.setNom( nom );
		collecte.setPrenom( prenom );
		collecte.setEntreprise( entreprise );
		collecte.setEmail( email );
		collecte.setDateNaissance( dateNaissance );
		collecte.setRue( rue );
		collecte.setCodePostal( codePostal );
		collecte.setVille( ville );
		collecte.setPays( pays );

		try {

			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/Eventech";
			String user = "root";
			String pwd = "SimplonMYSQL34";

			Connection con = (Connection) DriverManager.getConnection(url, user, pwd);

			PreparedStatement ps = con.prepareStatement("insert into Eventech.collecte values(?,?,?,?,?,?,?,?,?,?,?)");

			ps.setString(1,montant);
			ps.setString(2,typeUser);
			ps.setString(3,nom);
			ps.setString(4,prenom);
			ps.setString(5,entreprise);
			ps.setString(6,email);
			ps.setString(7,dateNaissance);
			ps.setString(8,rue);
			ps.setString(9,codePostal);
			ps.setString(10,ville);
			ps.setString(11,pays);

			int s = ps.executeUpdate();

			if (s > 0) {
				this.getServletContext().getRequestDispatcher( "/merciCollecte.jsp" ).forward(request, response );
			} else {
				System.out.print("Votre requête est incomplète. Merci de réitérer.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("Votre requête est incomplète. Merci de réitérer."); 
		}

	}

}
