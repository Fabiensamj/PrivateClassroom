package fr.utbm.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.utbm.core.entity.Location;
import fr.utbm.core.service.LocationService;

/**
 * Servlet implementation class ListServlet
 */
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	LocationService ls;
   
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.ls = new LocationService();
        List<Location> listFilm = this.ls.getAllLocation();
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Tous les lieux</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tous les lieux</h1>");
            out.println("<ul>");
            for(Location f : listFilm){
                out.println("<li>" + f.getCity() +" - "+f.getId() +"<li>");
            }
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        }
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}