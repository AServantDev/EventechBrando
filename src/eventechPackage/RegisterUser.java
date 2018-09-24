package eventechPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;




import com.mysql.jdbc.Connection;

import eventechPackage.User;
import eventechPackage.UserController;




@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 63564L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterUser() {
		
		// TODO Auto-generated constructor stub
	}

	/**
	  
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		User user = new User();
		

		String prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");
		String mail = request.getParameter("mail");
		String password = request.getParameter("password");
		
		
		
		user.setPrenom(prenom);
		user.setEmail(mail);
		user.setPassword(password);
		user.setNom(nom);

		UserController createUser = new UserController();

		String userRegistered = createUser.registerUser(user);

		if (userRegistered.equals("SUCCESS")) // On success, you can display a message to user on Home page
		{
			request.getRequestDispatcher("/accueil.jsp").forward(request, response);

		} 
		else // On Failure, display a meaningful message to the User.
		{
			request.setAttribute("errMessage", userRegistered);
			request.getRequestDispatcher("/register.jsp").forward(request, response);

		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

}
