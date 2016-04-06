import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/")
	String nome(){
		return "Hello Word";
	}
	
	@RequestMapping("/id")
	String id(){
		return "The id is 123";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}
	
}
