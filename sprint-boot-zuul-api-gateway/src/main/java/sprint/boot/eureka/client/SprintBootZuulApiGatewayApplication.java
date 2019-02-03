package sprint.boot.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//@EnableZuulServer
//@EnableDiscoveryClient
@EnableZuulProxy
public class SprintBootZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootZuulApiGatewayApplication.class, args);
	}

}

