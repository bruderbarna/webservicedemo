package com.soa.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soa.service.DemoWebServer")
public class DemoWebServerImpl implements DemoWebServer {
    public String sayHello(String name) {
        return "Hello, " + name + "!\r\n";
    }
}
