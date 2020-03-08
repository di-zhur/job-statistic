package fantastic.job.statistic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class JobStatisticApplication implements ApplicationRunner {

    private final JobLoader jobLoader;

    @Autowired
    public JobStatisticApplication(JobLoader jobLoader) {
        this.jobLoader = jobLoader;
    }

    public static void main(String[] args) {
		SpringApplication.run(JobStatisticApplication.class, args);
	}

    @Override
    public void run(ApplicationArguments args) {
        jobLoader.load();
    }

}
