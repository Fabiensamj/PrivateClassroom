import java.util.List;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;

import fr.utbm.core.controller.ShowCourseController;
import fr.utbm.core.entity.Course;
import fr.utbm.core.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		
		ShowCourseController sc = new ShowCourseController();
		sc.showAllCourse();
		
		/*ShowClientController sc = new ShowClientController();
		sc.showAllClient();
		HibernateUtil.shutdown();
		ShowCourseSessionController sc = new ShowCourseSessionController();
		sc.showAllCourseSession();
		HibernateUtil.shutdown();*/
		/*ShowLocationController sc = new ShowLocationController();
		sc.showAllLocation();
		HibernateUtil.shutdown();*/
		//initialize hazelcast client
		ClientConfig cc = new ClientConfig();
        cc.getGroupConfig().setName("MyCluster").setPassword("MyCluster");
        cc.getNetworkConfig().addAddress("localhost");
	      HazelcastInstance hzClient = HazelcastClient.newHazelcastClient(cc);
	      //read from map
	      List<Course> list = hzClient.getList("listcourse");
	      System.out.println(list.get(1).toString());
	      System.out.println("Member of cluster: " + list.size());
	      // perform shutdown
	      hzClient.getLifecycleService().shutdown();
	      HibernateUtil.shutdown();
		
	}

}
