package com.example.stream_server.service;

import com.example.api_common.streamservice.MessageChannelInfo;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamSendService {

    @Output(MessageChannelInfo.MESSAGE_OUTPUT)
    MessageChannel output();

    @Input(MessageChannelInfo.CALL_BACK_INPUT)
    SubscribableChannel input();
}
