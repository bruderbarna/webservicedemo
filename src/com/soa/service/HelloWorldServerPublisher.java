package com.soa.service;

import javax.xml.ws.Endpoint;

public class HelloWorldServerPublisher {

    public static void main(String[] args) {
        System.out.println("Beginning to publish HelloWorldServerImpl now");
        HelloWorldServer serviceToPublish = new HelloWorldServerImpl();
        Endpoint.publish("http://127.0.0.1:8000/helloworld", serviceToPublish);
        System.out.println("Done publishing");
    }
}
