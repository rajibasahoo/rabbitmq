package rabbitmq.example.pull;

import java.util.concurrent.TimeUnit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageConsumerApp {

	final static String queueName = "message_queue";
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RabbitMQConfig.class);
		MessageReciever receiver = (MessageReciever) ctx.getBean("receiver");
		receiver.getCountDownLatch().await(200000, TimeUnit.SECONDS);

	}

}
