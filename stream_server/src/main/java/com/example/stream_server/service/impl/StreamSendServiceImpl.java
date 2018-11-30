package com.example.stream_server.service.impl;

import com.example.api_common.streamservice.MessageChannelInfo;
import com.example.stream_server.service.StreamSendService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(StreamSendService.class) // 可以理解为是一个消息的发送管道的定义
public class StreamSendServiceImpl {
    private static Logger logger = LoggerFactory.getLogger(StreamSendServiceImpl.class);

    @StreamListener(MessageChannelInfo.CALL_BACK_INPUT)
    public void receive(Message<String> message) {
        System.out.println("收到得返回信息"+message);
    }
}
