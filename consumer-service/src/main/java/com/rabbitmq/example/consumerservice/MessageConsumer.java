package com.rabbitmq.example.consumerservice;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class MessageConsumer {

    @StreamListener(Sink.INPUT)
    public void log(Transaction msg){
        System.out.println("Message contains orderid as "+msg.toString());
    }
}
