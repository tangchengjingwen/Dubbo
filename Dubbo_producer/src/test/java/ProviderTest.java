import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("provider.xml");
		applicationContext.start();
		System.out.println("服务发布成功 29015");
		System.in.read();
	}
}
