package eventechPackage;


import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		System.out.println("Servlet cagnotte");


		/*
		 * Récupération de l'ID de l'utilisateur
		 */
		HttpSession session = request.getSession();
		int idUser= (int) session.getAttribute("idCo"); 
		System.out.println(idUser);



		

		/*
		 * Récupération de l'ID de l'event
		 */
		String id = request.getParameter("idEvent");
		System.out.println(id);
		
		int idE = Integer.parseInt(id);
		
		
		





		/*
		 * Récupération des données saisies, envoyées en tant que paramètres de
		 * la requête GET générée à la validation du formulaire
		 */
	    String sMontant = request.getParameter("montant");
		int montant = Integer.parseInt(sMontant);
		String typeUser = request.getParameter( "typeUser" );
		String nom = request.getParameter( "nom" );
		String prenomCollecte = request.getParameter( "prenom" );
		String entreprise = request.getParameter( "entreprise" );
		String email = request.getParameter( "email" );
		String dateNaissance = request.getParameter( "naissance" );
		String rue = request.getParameter( "rue" );
		String codePostal= request.getParameter( "codePostal" );
		String ville = request.getParameter( "ville" ); 
		String pays = request.getParameter( "pays" );
		
		
		//setters attributs sessions
		
		session.setAttribute("montant", montant);
		session.setAttribute("prenomCollecte", prenomCollecte);
		
		

		/*
		 * Création du bean contact et initialisation avec les données récupérées
		 */

		collecte collecte = new collecte();



		collecte.setIdEvent(idE);
		collecte.setIdUser(idUser);
		collecte.setMontant( montant );
		collecte.setTypeUser( typeUser );
		collecte.setNom( nom );
		collecte.setPrenom( prenomCollecte );
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
			String pwd = "root";
			//SimplonMYSQL34 password mathilde

			Connection con = (Connection) DriverManager.getConnection(url, user, pwd);
			
			//info events
			String sql0 = "SELECT * FROM evenement WHERE id_event ='" + idE + "'";
			Statement st = con.createStatement();
			
			
			ResultSet result = (ResultSet) st.executeQuery(sql0);
			while (result.next()) {
				System.out.println("BalayageEventCollecte");

				// Récupération des infos de l'event (nom) grace au select et à la boucle while
				// avec le result
				System.out.println(result.getString("nom"));
				session.setAttribute("nomEvent", result.getString("nom"));
				
				}
			// fin info events
			
			
			
			
			
			
			
			
			//info Users SELECT prenom FROM users JOIN evenement ON id_user = id_organisateur WHERE id_user = 1;
			
		/*	String sql3 = "SELECT users.prenom FROM users JOIN evenement ON id_user = id_organisateur WHERE id_user ='" + idOrganisateur + "'";
			
			Statement st2 = con.createStatement();
			ResultSet result2 = (ResultSet) st2.executeQuery(sql3);
			while (result2.next()) {
				System.out.println("BalayageEventCollecteORGANISATEUR");
				session.setAttribute("nomOrganisateur", result.getString("prenom"));
				} */
			
			//fin Info Users
			
			//Update table evenement
			
			PreparedStatement pst = null ;
			String sql2 = "UPDATE evenement SET montant_cagnotte = montant_cagnotte + '" + collecte.getMontant() +"'" + "WHERE id_event ='"
					+ idE + "'";
			
			
			pst = con.prepareStatement(sql2);

			int o = pst.executeUpdate();
			if (o != 0) {
				System.out.println("Update cagnotte Evenement");
			} else {
				System.out.println("nothing");
			}
			// fin update table evenement
			
			PreparedStatement ps = con.prepareStatement("insert into Eventech.collecte values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

			ps.setInt(1, idUser);
			ps.setInt(2, idE);
			ps.setInt(3,montant);
			ps.setString(4,typeUser);
			ps.setString(5,nom);
			ps.setString(6,prenomCollecte);
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
