package com.example.stream_server.receiver;

import com.example.stream_server.client.StreamClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;
/**创建消费者*/
@Component
@EnableBinding( value = StreamClient.class)
public class StreamReceiver {
    private Logger logger = LoggerFactory.getLogger(StreamReceiver.class);

    @StreamListener(StreamClient.INPUT)
    public void receive(String message) {
        logger.info("StreamReceiver: {}", message);
    }

}