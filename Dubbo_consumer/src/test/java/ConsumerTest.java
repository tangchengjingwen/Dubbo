import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itmayiedu.service.UserService;

public class ConsumerTest {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		applicationContext.start();
		UserService userService = (UserService) applicationContext.getBean("userService");
		String name = userService.getUserId(2);
		System.out.println("消费端从生产者获取到 name： " + name);
		System.in.read();
	}
}
