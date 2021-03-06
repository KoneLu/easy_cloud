package com.example.stream_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;


/**注册中心*/
@EnableDiscoveryClient
/**
 * BUS 刷新
 * http://localhost:8762/actuator/bus-refresh
 * 必须是以POST方式请求，无返回值
 * */
@RefreshScope
@SpringBootApplication
public class StreamServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamServerApplication.class,args);
    }
}
