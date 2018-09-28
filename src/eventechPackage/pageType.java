package eventechPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class pageType
 */
@WebServlet("/pageType")
public class pageType extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public pageType() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("idEvent");
		System.out.println(id);
		int idE = Integer.parseInt(id);
		Evenement event = new Evenement();
		event.setId_event(idE);

		EventController afficheEvent = new EventController();
		

		// The core Logic of the Registration application is present here. We are going
		// to insert user data in to the database.
		String eventRegistered = afficheEvent.displayEvent(event);
		
		
		request.setAttribute("event", event);
		
		
		
		
		
		

		System.out.println(idE);
		
		if (eventRegistered.equals("SUCCESS")) // On success, you can display a message to user on Home page
		{
			request.getRequestDispatcher("/pageType.jsp").forward(request, response);

		} else // On Failure, display a meaningful message to the User.
		{
			request.setAttribute("errMessage", eventRegistered);
			request.getRequestDispatcher("/register.jsp").forward(request, response);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
