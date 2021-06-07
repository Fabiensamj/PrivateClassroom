package fr.utbm.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;

import fr.utbm.core.controller.ShowCourseController;
import fr.utbm.core.entity.Course;
import fr.utbm.core.service.CourseService;

/**
 * Servlet implementation class ListServlet
 */
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	CourseService cs;
   
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		ShowCourseController sc = new ShowCourseController();
		sc.showAllCourse();
		//partie Hazelcast
		ClientConfig cc = new ClientConfig();
        cc.getGroupConfig().setName("MyCluster").setPassword("MyCluster");
        cc.getNetworkConfig().addAddress("localhost");
	    HazelcastInstance hzClient = HazelcastClient.newHazelcastClient(cc);
	    //read from list
	    List<Course> listCourse = hzClient.getList("listcourse");
	    
        request.setAttribute("list", listCourse);
        
        response.setContentType("text/html;charset=UTF-8");
        this.getServletContext().getRequestDispatcher( "/WEB-INF/jsp/list.jsp" ).forward( request, response );
     // perform shutdown
	      hzClient.getLifecycleService().shutdown();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}