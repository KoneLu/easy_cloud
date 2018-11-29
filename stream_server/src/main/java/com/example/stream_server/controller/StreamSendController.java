package com.example.stream_server.controller;

import com.example.stream_server.client.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreamSendController {

    @Autowired
    StreamClient streamClient;

    @GetMapping("send")
    public void send() {
        streamClient.output().send(MessageBuilder.withPayload("Hello World...").build());
    }

}
