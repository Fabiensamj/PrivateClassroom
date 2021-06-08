package fr.utbm.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.service.CourseSessionService;

/**
 * Servlet implementation class ListSessionServlet
 */
public class ListSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	CourseSessionService css;
   
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.css = new CourseSessionService();
        List<CourseSession> listCourseSession = this.css.getAllCourseSession();
        
        String name = "test";
        request.setAttribute("list", listCourseSession);
        request.setAttribute("name", name);
        response.setContentType("text/html;charset=UTF-8");
        this.getServletContext().getRequestDispatcher( "/WEB-INF/jsp/list.jsp" ).forward( request, response );
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
