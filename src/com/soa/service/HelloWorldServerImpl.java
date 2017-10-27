package com.soa.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soa.service.HelloWorldServer")
public class HelloWorldServerImpl implements HelloWorldServer {
    public String sayHello(String name) {
        return "Hello, World! I'm " + name;
    }
}
