package ejercicio9.ejercicio10;
import java.util.*;

public class HighestPriorityScheduler implements Strategy{
	
	public JobDescription next(List<JobDescription> jobs) {
        return jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                    .orElse(null);
               

    }

}
