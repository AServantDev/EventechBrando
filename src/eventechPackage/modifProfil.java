package eventechPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class modifProfil
 */
@WebServlet("/modifProfil")
public class modifProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifProfil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		
		
		
		
		int id = (int) session.getAttribute("idCo");
		
		User user = new User();
		user.setId_user(id);
		user.setEmail(request.getParameter("mail"));
		user.setNom(request.getParameter("nom"));
		user.setPrenom(request.getParameter("prenom"));
		user.setPassword(request.getParameter("pass"));
		int age = Integer.parseInt(request.getParameter("age"));
		user.setAge(age);
		
		
		UserController userModif = new UserController();
		
		String modif = userModif.modifUser(user, session);
		
		if (modif.equals("SUCCESS")) // On success, you can display a message to user on Home page
		{

			request.getRequestDispatcher("/modifProfil.jsp").forward(request, response);

		} else // On Failure, display a meaningful message to the User.
		{

			request.getRequestDispatcher("/register.jsp").forward(request, response);

		}
		
	}

}
