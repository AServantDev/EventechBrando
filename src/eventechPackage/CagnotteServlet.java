package eventechPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CagnotteServlet
 */
@WebServlet("/CagnotteServlet")
public class CagnotteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CagnotteServlet() {
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

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ParticipationCagnotteModel cagnotte = new ParticipationCagnotteModel();

		// Id utilisateur
		HttpSession session = request.getSession();
		int idUser = (int) session.getAttribute("idCo");
		
		// idEvent
		String id = request.getParameter("idEvent");
		int idEvent = (int) Integer.parseInt(id);

		

		
		
		//Valeurs du don
		String stringDon = request.getParameter("champsDon");
		System.out.println(stringDon);
		int don = (int) Integer.parseInt(stringDon);
		System.out.println(don);

		String email = (String) session.getAttribute("mailCo");
		String nom = (String) session.getAttribute("prenom");

		cagnotte.setNomUser(nom);
		cagnotte.setIdEvent(idEvent);
		cagnotte.setIdUser(idUser);
		cagnotte.setValeurDon(don);
		cagnotte.setMailUser(email);

		UserController featureCagnotte = new UserController();

		String cagnotteWorked = featureCagnotte.participationCagnotte(session, cagnotte);

		if (cagnotteWorked.equals("SUCCESS")) // On success, you can display a message to user on Home page
		{

			request.getRequestDispatcher("/remerciement.jsp").forward(request, response);

		} else // On Failure, display a meaningful message to the User.
		{

			request.getRequestDispatcher("/register.jsp").forward(request, response);

		}

	}

}
