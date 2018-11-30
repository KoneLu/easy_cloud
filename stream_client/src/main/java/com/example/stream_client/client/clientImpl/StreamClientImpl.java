package com.example.stream_client.client.clientImpl;

import com.example.api_common.streamservice.MessageChannelInfo;
import com.example.stream_client.client.StreamClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(StreamClient.class)
public class StreamClientImpl {
    @StreamListener(MessageChannelInfo.MESSAGE_INPUT)
    @SendTo(MessageChannelInfo.CALL_BACK_OUTPUT)
    public String receive(Message<String> message) {
        System.out.println("接收到MQ消息:" + message);
        return "client B 收到";
    }
}
