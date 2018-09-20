package eventechPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InscriptionPageServlet
 */
@WebServlet("/InscriptionEvent")
public class InscriptionEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InscriptionEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// Instanciation du model pour la fonctionnalité
		ParticipationModel participant = new ParticipationModel();

		// récupération de la session ( pour l'id utilisateur ), dont l'attribut est
		// stoquée dans une variable
		HttpSession session = request.getSession();
		int idUser = (int) session.getAttribute("idCo");

		// récupération de l'idEvent via un Parameter de la requête.
		String idEvent = request.getParameter("idEvent");
		int id = Integer.parseInt(idEvent);

		// récupération du mail utilisateur dans la bdd ( where id_user = ? )
		String email = (String) session.getAttribute("mailCo");

		// mise à jour des attributs du model de la fonctionnalité
		participant.setOurIDevent(id);
		participant.setOurIDuser(idUser);
		participant.setEmailUser(email);

		System.out.println("ok");

		// Instanciation du controlleur pour récupérer la method de la fonctionnalité
		UserController participantUser = new UserController();

		/*
		 * Comme la method return un String, on déclare une nouvelle variable String
		 * initialié à l'instance du controlleur.laMethod
		 */
		String userParticipant = participantUser.participerEvent(session, participant);

		// Vérification de la method
		if (userParticipant.equals("SUCCESS")) // On success, you can display a message to user on Home page
		{

			request.getRequestDispatcher("/accueil.jsp").forward(request, response);

		} else // On Failure, display a meaningful message to the User.
		{

			request.getRequestDispatcher("/register.jsp").forward(request, response);

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Instanciation du model pour la fonctionnalité
		ParticipationModel participant = new ParticipationModel();

		// récupération de la session ( pour l'id utilisateur ), dont l'attribut est
		// stoquée dans une variable
		HttpSession session = request.getSession();
		int idUser = (int) session.getAttribute("idCo");

		// récupération de l'idEvent via un Parameter de la requête.
		String idEvent = request.getParameter("idEvent");
		int id = Integer.parseInt(idEvent);

		// récupération du mail utilisateur dans la bdd ( where id_user = ? )
		String email = (String) session.getAttribute("mailCo");

		// mise à jour des attributs du model de la fonctionnalité
		participant.setOurIDevent(id);
		participant.setOurIDuser(idUser);
		participant.setEmailUser(email);

		System.out.println("ok");

		// Instanciation du controlleur pour récupérer la method de la fonctionnalité
		UserController participantUser = new UserController();

		/*
		 * Comme la method return un String, on déclare une nouvelle variable String
		 * initialié à l'instance du controlleur.laMethod
		 */
		String userParticipant = participantUser.participerEvent(session, participant);

		// Vérification de la method
		if (userParticipant.equals("SUCCESS")) // On success, you can display a message to user on Home page
		{

			request.getRequestDispatcher("/accueil.jsp").forward(request, response);

		} else // On Failure, display a meaningful message to the User.
		{

			request.getRequestDispatcher("/register.jsp").forward(request, response);

		}

	}

}
