package eventechPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConnectUser
 */
@WebServlet("/ConnectUser")
public class ConnectUser extends HttpServlet {
	private static final long serialVersionUID = 58965L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnectUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mail = request.getParameter("mailCo");
		String password = request.getParameter("passwordCo");
		if (mail == null)
			mail = "";
		if (password == null)
			password = "";

		HttpSession session = request.getSession(true);
		session.setAttribute("mailCo", mail);
		session.setAttribute("passwordCo", password);
		

		UserController connectUser = new UserController();

		String connectRegistered = connectUser.connectUser(session);

		if (connectRegistered.equals("SUCCESS")) // On success, you can display a message to user on Home page
		{
			request.getRequestDispatcher("/Home.jsp").forward(request, response);
			

		} else // On Failure, display a meaningful message to the User.
		{
			request.setAttribute("errMessage", connectRegistered);
			request.getRequestDispatcher("/connection.jsp").forward(request, response);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String mail = request.getParameter("mailCo");
		String password = request.getParameter("passwordCo");

		HttpSession session = request.getSession(true);
		session.setAttribute("mailCo", mail);
		session.setAttribute("passwordCo", password);
		

		UserController connectUser = new UserController();

		String connectRegistered = connectUser.connectUser(session);

		if (connectRegistered.equals("SUCCESS")) // On success, you can display a message to user on Home page
		{
			request.getRequestDispatcher("/Home.jsp").forward(request, response);
			

		} else // On Failure, display a meaningful message to the User.
		{
			request.setAttribute("errMessage", connectRegistered);
			request.getRequestDispatcher("/register.jsp").forward(request, response);

		}
	}
}
