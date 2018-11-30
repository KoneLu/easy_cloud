package com.example.stream_server.controller;
import com.example.stream_server.service.StreamSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class StreamSendController {

    @Autowired
    StreamSendService streamSendService;

    /**测试管道通信*/
    @GetMapping("send")
    public void send() {
        streamSendService.output().send(MessageBuilder.withPayload("Hello World..."+ UUID.randomUUID().toString()).build());
        System.out.println("Hello World..."+ UUID.randomUUID().toString());
    }

}