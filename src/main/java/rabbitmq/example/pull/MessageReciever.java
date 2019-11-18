package rabbitmq.example.pull;
import java.util.concurrent.CountDownLatch;

import model.Product;
public class MessageReciever {
	private CountDownLatch countDownLatch = new CountDownLatch(1);

	public void receiveMsg(Product product)
	{
		System.out.println("product object is Received: " + product);
		countDownLatch.countDown();
	}

	public CountDownLatch getCountDownLatch()
	{
		return countDownLatch;
	}
}
