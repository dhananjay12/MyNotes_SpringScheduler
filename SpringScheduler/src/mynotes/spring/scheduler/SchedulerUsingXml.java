package mynotes.spring.scheduler;

import java.util.Date;

public class SchedulerUsingXml {
	
	public void runThisTask(){
		System.out.println("runThisTask at "+new Date(System.currentTimeMillis()));
	}

}
