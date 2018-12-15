package example.profiles;

import example.profiles.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Value("${custom.env}")
	private String env;

	@Autowired
	private AuthorityService authorityService;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-------------------------------------------");
		System.out.println(env);
		System.out.println(authorityService.hasRole("anything"));
		System.out.println("-------------------------------------------");
	}
}
