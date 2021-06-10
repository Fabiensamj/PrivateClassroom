package fr.utbm.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.service.CourseSessionService;

/**
 * Servlet implementation class ListFilter
 */
@WebServlet(name="ListFilter",urlPatterns= {"/listFilter"})
public class ListFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   CourseSessionService css;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        	//List<Course> cours = this.cs.getCourseByName((String)request.getAttribute("keyword"));
            List<CourseSession> listCourseFilter = this.css.getCourseSessionByCode((String)request.getAttribute("keyword"));
           
            request.setAttribute("list", listCourseFilter);
        
		 response.setContentType("text/html;charset=UTF-8");
	        this.getServletContext().getRequestDispatcher( "/WEB-INF/jsp/listFilter.jsp" ).forward( request, response );
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
