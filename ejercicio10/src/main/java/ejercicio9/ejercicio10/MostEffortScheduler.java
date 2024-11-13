package ejercicio9.ejercicio10;
import java.util.*;

public class MostEffortScheduler implements Strategy{
	
	public JobDescription next(List<JobDescription> jobs) {
        return jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                    .orElse(null);
                
    }

}
