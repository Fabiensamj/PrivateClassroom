import fr.utbm.core.controller.ShowClientController;
import fr.utbm.core.controller.ShowCourseController;
import fr.utbm.core.controller.ShowCourseSessionController;
import fr.utbm.core.controller.ShowLocationController;
import fr.utbm.core.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		
		/*ShowCourseController sc = new ShowCourseController();
		sc.showAllCourse();
		HibernateUtil.shutdown();*/
		/*ShowClientController sc = new ShowClientController();
		sc.showAllClient();
		HibernateUtil.shutdown();*/
		ShowCourseSessionController sc = new ShowCourseSessionController();
		sc.showAllCourseSession();
		HibernateUtil.shutdown();
		/*ShowLocationController sc = new ShowLocationController();
		sc.showAllLocation();
		HibernateUtil.shutdown();*/

	}

}
