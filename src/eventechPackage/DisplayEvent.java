package eventechPackage;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayEvent
 */
@WebServlet("/DisplayEvent")
public class DisplayEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayEvent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String theme = request.getParameter("Theme");
		Evenement event = new Evenement();
		event.setTheme(theme);		
		
		EventController displayTheme = new EventController();
		Evenement eventByTheme = new Evenement();
		
		ArrayList<Evenement> eventTheme = new ArrayList<Evenement>();
		displayTheme.displayEventByTheme(request, eventTheme, event, eventByTheme);
		request.setAttribute("eventList", eventTheme);
		
		
		request.getRequestDispatcher("/hubEventTheme.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
