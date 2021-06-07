import java.util.Map;
import java.util.Queue;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastMain {
	public static void main(String[] args) {
		HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
	    
	   
		 Map<String, String> vehicleOwners = hazelcastInstance.getMap("vehicleOwnerMap");
		 vehicleOwners.put("john", "Honda");
	    //hazelcastInstance.shutdown();
	}
}