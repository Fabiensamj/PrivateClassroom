package fr.utbm.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.utbm.core.entity.Course;
import fr.utbm.core.service.CourseService;

/**
 * Servlet implementation class IndexServlet
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	CourseService cs;
   
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.cs = new CourseService();
        List<Course> listCourse = this.cs.getAllCourse();
        
        String name = "test";
        request.setAttribute("list", listCourse);
        request.setAttribute("name", name);
        response.setContentType("text/html;charset=UTF-8");
        this.getServletContext().getRequestDispatcher( "index.jsp" ).forward( request, response );
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}