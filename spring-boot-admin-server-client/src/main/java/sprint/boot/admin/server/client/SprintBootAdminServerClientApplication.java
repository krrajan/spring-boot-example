package sprint.boot.admin.server.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SprintBootAdminServerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootAdminServerClientApplication.class, args);
	}
	
	@RequestMapping("/admin-client")
	public String getMessage() {
		return "Hello India!!!!!!!!!!!!!!!!!";
	}

}

