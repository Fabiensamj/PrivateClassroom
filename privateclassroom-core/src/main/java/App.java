import fr.utbm.core.controller.ShowClientController;
import fr.utbm.core.controller.ShowCourseController;
import fr.utbm.core.controller.ShowCourseSessionController;
import fr.utbm.core.controller.ShowLocationController;
import fr.utbm.core.util.HibernateUtil;
import java.sql.Time;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class App {

	public static void main(String[] args) {
		
		/*ShowCourseController sc = new ShowCourseController();
		sc.showCourseByName("Objet");
		HibernateUtil.shutdown();*/
		/*ShowClientController sc = new ShowClientController();
		sc.showAllClient();
		HibernateUtil.shutdown();*/
		ShowCourseSessionController sc = new ShowCourseSessionController();
		Date date = null;
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    String date1 = "2021-04-05"; 

	    try {
	        date = simpleDateFormat.parse(date1);
	      } catch (ParseException e) {
	        e.printStackTrace();
	      }
	    
		sc.showCourseSessionByDate(date);
		HibernateUtil.shutdown();
		/*ShowLocationController sc = new ShowLocationController();
		sc.showAllLocation();
		HibernateUtil.shutdown();*/

	}

}
