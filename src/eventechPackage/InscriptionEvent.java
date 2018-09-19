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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ParticipationModel participant = new ParticipationModel();
		
		
		HttpSession session = request.getSession();
		int idUser = (int) session.getAttribute("idCo");
		String idEvent = request.getParameter("idEvent");
		int id = Integer.parseInt(idEvent);
		
		participant.setOurIDevent(id);
		participant.setOurIDuser(idUser);
		System.out.println("ok");
		
		UserController participantUser = new UserController();
		
		String userParticipant = participantUser.participerEvent(session, participant);
		
		if (userParticipant.equals("SUCCESS")) // On success, you can display a message to user on Home page
		{
			
			request.getRequestDispatcher("/accueil.jsp").forward(request, response);
			

		} else // On Failure, display a meaningful message to the User.
		{
			
			request.getRequestDispatcher("/register.jsp").forward(request, response);

		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
