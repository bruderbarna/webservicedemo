package com.soa.service;

import javax.xml.ws.Endpoint;

public class DemoWebServerPublisher {

    public static void main(String[] args) {
        System.out.println("Beginning to publish DemoWebServerImpl");

        DemoWebServer serviceToPublish = new DemoWebServerImpl();
        Endpoint.publish("http://127.0.0.1:8000/demoservice", serviceToPublish);

        System.out.println("Done publishing");
    }
}
