package mt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shaojia on 2017/7/11.
 */
@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class App {

    @RequestMapping("/index")
    public String index() {
        System.out.println("hello index");
        return "index";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

}
