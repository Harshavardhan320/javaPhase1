package school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	

	public static void main(String args[]) {
		
		
		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("config.xml");
		
		Display dis = (Display)applicationContext.getBean("display");
		
		dis.main();
		
	}
}
