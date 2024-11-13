package ejercicio9.ejercicio10;
import java.util.*;

public class LIFOScheduler implements Strategy{
	
	public JobDescription next(List<JobDescription> jobs) {
        return jobs.get(jobs.size()-1);
                
    }

}
