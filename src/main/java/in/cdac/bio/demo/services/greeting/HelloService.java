package in.cdac.bio.demo.services.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

	@GetMapping("/greeting")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello, " + name;
	}

}
