package eventechPackage;



import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		 * Récupération de l'ID de l'utilisateur
		 */
		HttpSession session = request.getSession();
		int idUser= (int) session.getAttribute("idCo"); 


		/*
		 * Récupération de l'ID de l'event
		 */

		String id= request.getParameter("idEvent");
		int idEvent=(int) Integer.parseInt(id); 

		/*
		 * Récupération des données saisies, envoyées en tant que paramètres de
		 * la requête GET générée à la validation du formulaire
		 */

		
		//date
		String dateNaissance = request.getParameter("naissance");
		Date castJavaDateEvenement;
		

		String sMontant = request.getParameter( "montant" );
		int montant = Integer.parseInt(sMontant);
		String typeUser = request.getParameter( "typeUser" );
		String nom = request.getParameter( "nom" );
		String prenom = request.getParameter( "prenom" );
		String entreprise = request.getParameter( "entreprise" );
		String email = request.getParameter( "email" );
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

			PreparedStatement ps = con.prepareStatement("insert into Eventech.collecte values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

			
			castJavaDateEvenement = new SimpleDateFormat("yyyy-MM-dd").parse(dateNaissance);
			java.sql.Date castSqlDateEvenement= new java.sql.Date(castJavaDateEvenement.getTime());
			collecte.setDateNaissance(castSqlDateEvenement);
	    	
			
			
			ps.setInt(1,idUser);
			ps.setInt(2, 1);
			ps.setInt(3,montant);
			ps.setString(4,typeUser);
			ps.setString(5,nom);
			ps.setString(6,prenom);
			ps.setString(7,entreprise);
			ps.setString(8,email);
			ps.setString(9,dateNaissance);
			ps.setString(10,rue);
			ps.setString(11,codePostal);
			ps.setString(12,ville);
			ps.setString(13,pays);

			int s = ps.executeUpdate();

			if (s > 0) {
				this.getServletContext().getRequestDispatcher("/payment.jsp").forward(request, response );
			} else {
				System.out.print("Votre requête est incomplète. Merci de réitérer.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("Votre requête est incomplète. Merci de réitérer."); 
		}
	}
}
