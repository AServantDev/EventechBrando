package eventechPackage;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Connection;
import eventechPackage.*;

import eventechPackage.Evenement;


@WebServlet("/CreateEvent")
public class CreateEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public CreateEvent() {
        
   
    		     // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    
		throws ServletException, IOException {
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		HttpSession session = request.getSession();
		 Evenement event = new Evenement();
		
		String nom = request.getParameter("nom");
	    String lieu = request.getParameter("lieu");
	    
	  //date
	  		String dateEvenement = request.getParameter("date");
	  		Date castJavaDateEvenement;
	  		
			
	  		
	    
	    
	    String desc = request.getParameter("description");
	    String theme = request.getParameter("theme");
	    String place= request.getParameter("placeMax");
	    String heure = request.getParameter("heure");
	    String image = request.getParameter("imageEvent");
	    String rapDesc = request.getParameter("descriptionBreve");
		int id = (int) session.getAttribute("idCo");
	    
	    try {

	    	castJavaDateEvenement = new SimpleDateFormat("yyyy-MM-dd").parse(dateEvenement);
			java.sql.Date castSqlDateEvenement= new java.sql.Date(castJavaDateEvenement.getTime());
			event.setDateEvenement(castSqlDateEvenement);
	    	
	        SimpleDateFormat format = new SimpleDateFormat("HH:mm"); // 12 hour format

	        
	        
	        
	        
	        
	        java.util.Date d1 =(java.util.Date)format.parse(heure);

	        
	        
	        java.sql.Time ppstime = new java.sql.Time(d1.getTime());
	        
	        event.setHeure(ppstime);

	    } catch(Exception e) {
	    	System.out.println("wat");
	    	e.printStackTrace();
	    }
	   
	    int places = Integer.parseInt(place);
	    
	    
	    event.setNom(nom);
	    event.setLieu(lieu);
	    
	    event.setDescription(desc);
	    event.setTheme(theme);
	    event.setPlaceMax(places);
	    event.setImg(image);
	    event.setId_organisateur(id);
	    event.setDescriptionBreve(rapDesc);
	   
	   
	    
	    
	    
	    
	    
	 
	    EventController registerEvent = new EventController();
	    
	    //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
	    String eventRegistered = registerEvent.registerEvent(event, session);
	    
	    if(eventRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
	    {
	    request.getRequestDispatcher("/Home.jsp").forward(request,  response);
	    
	    }
	    else   //On Failure, display a meaningful message to the User.
	    {
	    request.setAttribute("errMessage", eventRegistered);
	    request.getRequestDispatcher("/register.jsp").forward(request,  response);
	    
	    }
	    }
	    
	    
	}

