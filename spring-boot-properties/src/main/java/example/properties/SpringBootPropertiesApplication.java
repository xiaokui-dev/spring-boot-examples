package example.properties;

import example.properties.config.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xiaokui.springbootproperties.config.*;

@SpringBootApplication
public class SpringBootPropertiesApplication implements CommandLineRunner {

	@Autowired
	private DataStructureConfig dataStructureConfig;

	@Value("${app.description}")
	private String description;

	@Autowired
	private EmailValueConfig emailValueConfig;

	@Autowired
	private EmailConfig emailConfig;

	@Autowired
	private AppConfig appConfig;

	@Autowired
	private LayoutConfig layoutConfig;

	@Autowired
	private AppWithJSR303Config appWithJSR303Config;

	@Autowired
	private RandomSeedConfig randomSeedConfig;

	@Autowired
	private JdbcConfig jdbcConfig;

	@Autowired
	private CommandLineConfig commandLineConfig;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPropertiesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-------------------------------------------");
		System.out.println(emailValueConfig);
		System.out.println(emailConfig);
		System.out.println(appConfig);
		System.out.println(layoutConfig);
		System.out.println(appWithJSR303Config);
		System.out.println(randomSeedConfig);
		System.out.println(jdbcConfig);
		System.out.println(description);
		System.out.println(dataStructureConfig);
		System.out.println(commandLineConfig);

		System.out.println("-------------------------------------------");
	}

}
