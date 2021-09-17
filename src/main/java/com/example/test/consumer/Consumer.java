package com.example.test.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

	static int count=0;
	@RabbitListener(queues="${jsa.rabbitmq.queue}")
    public void recievedMessage(String msg) throws InterruptedException {
        logger.info("count : {} Recieved Message: {}" ,count++, msg);
    }
	
}
