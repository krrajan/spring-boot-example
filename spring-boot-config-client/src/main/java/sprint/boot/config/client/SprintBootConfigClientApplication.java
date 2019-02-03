package sprint.boot.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RefreshScope
@RestController
public class SprintBootConfigClientApplication {

	@Value("${welcome.message: Hello India!!!!!!!!!!!!!}")
	private String message;
	public static void main(String[] args) {
		SpringApplication.run(SprintBootConfigClientApplication.class, args);
	}

	@RequestMapping("/hello")
	public String getMessage() {
		return message;
	}
}

