package com.example.stream_client.client;

import com.example.api_common.streamservice.MessageChannelInfo;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Service;


public interface StreamClient {

    @Input(MessageChannelInfo.MESSAGE_INPUT)
    MessageChannel input();
}
