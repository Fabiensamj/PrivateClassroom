import org.hibernate.Hibernate;

import fr.utbm.core.controller.ShowCourseController;
import fr.utbm.core.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		
		ShowCourseController sc = new ShowCourseController();
		sc.showAllLocation();
		HibernateUtil.shutdown();

	}

}
