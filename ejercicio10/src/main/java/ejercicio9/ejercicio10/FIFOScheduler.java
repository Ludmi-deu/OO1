package ejercicio9.ejercicio10;
import java.util.*;

public class FIFOScheduler implements Strategy{
	
	public JobDescription next(List<JobDescription> jobs) {
		
         return jobs.get(0);
              

    }

}
