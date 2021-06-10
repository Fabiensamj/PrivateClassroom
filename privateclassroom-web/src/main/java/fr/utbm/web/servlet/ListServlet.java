package fr.utbm.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.service.CourseService;
import fr.utbm.core.service.CourseSessionService;
import fr.utbm.core.service.LocationService;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet(name="ListServlet",urlPatterns= {"/listServlet"})
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	CourseSessionService css;
	LocationService ls;
	CourseService cs;
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.css = new CourseSessionService();
        List<CourseSession> listCourseSession = this.css.getAllCourseSession();
        //List<Location> listLocation = this.ls.getAllLocation();
        

        request.setAttribute("list", listCourseSession);
        //request.setAttribute("location", listLocation);
        
        
        response.setContentType("text/html;charset=UTF-8");
        this.getServletContext().getRequestDispatcher( "/WEB-INF/jsp/list.jsp" ).forward( request, response );
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	

}