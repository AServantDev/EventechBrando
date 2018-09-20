package eventechPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class profiType
 */
@WebServlet("/profilType")
public class profilType extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public profilType() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		User user = new User();
		
		int id = (int) session.getAttribute("idCo");
		
		user.setId_user(id);
		
		UserController profile = new UserController();
		
		String displayProfile = profile.showProfile(user);
		request.setAttribute("user", user);
		
		if(displayProfile.equals("SUCCESS")) {
			
			request.getRequestDispatcher("/profilType.jsp").forward(request, response);
			
		}else {
			
			request.setAttribute("errMessage", "non");
			request.getRequestDispatcher("/accueil.jsp").forward(request, response);
		}
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
