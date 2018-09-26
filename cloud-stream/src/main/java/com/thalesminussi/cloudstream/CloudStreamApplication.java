package com.thalesminussi.cloudstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Payload;

import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
@EnableBinding(Sink.class)
public class CloudStreamApplication {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        SpringApplication.run(CloudStreamApplication.class, args);
    }

    @StreamListener(value = Sink.INPUT, condition = "headers['type']=='request'")
    public void handle(@Payload RequestInfo requestInfo) {
        System.out.println("Request Info: " + requestInfo + ". Count: " + atomicInteger.incrementAndGet());
    }

    public static class RequestInfo {
        private String city;
        private String country;

        public String getCity() {
            return city;
        }

        public String getCountry() {
            return country;
        }

        @Override
        public String toString() {
            return "RequestInfo{" +
                    "city='" + city + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }

}
