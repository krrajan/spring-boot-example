package sprint.boot.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@RestController
public class SpringBootSwagger2ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwagger2ExampleApplication.class, args);
	}

	
	 @RequestMapping(value = "/products", method = RequestMethod.GET)
	   public List<String> getProducts() {
	      List<String> productsList = new ArrayList<>();
	      productsList.add("Honey");
	      productsList.add("Almond");
	      return productsList;
	   }
	   @RequestMapping(value = "/products", method = RequestMethod.POST)
	   public String createProduct() {
	      return "Product is saved successfully";
	   }
	   
	   @Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("sprint.boot.swagger")).build();
	   }
}

