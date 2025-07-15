package cosimocrupi.L2;

import cosimocrupi.L2.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class L2Application {

	public static void main(String[] args) {
		SpringApplication.run(L2Application.class, args);
		AnnotationConfigApplicationContext cxt= new AnnotationConfigApplicationContext(L2Application.class);
		Menu m = (Menu) cxt.getBean("Menù");
		m.stampaMenu();
	}
}
