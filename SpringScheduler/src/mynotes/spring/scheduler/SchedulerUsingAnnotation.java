package mynotes.spring.scheduler;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class SchedulerUsingAnnotation {
	
	@Scheduled(cron="${cron.expression}")
	public void runThisTask(){
		System.out.println("runThisTask at "+new Date(System.currentTimeMillis()));
	}

}
