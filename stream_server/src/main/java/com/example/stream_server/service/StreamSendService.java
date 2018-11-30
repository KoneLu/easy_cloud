package com.example.stream_server.service;

import com.example.api_common.streamservice.MessageChannelInfo;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface StreamSendService {

    @Output(MessageChannelInfo.MESSAGE_OUTPUT)
    MessageChannel output();
}
