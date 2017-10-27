package com.soa.client;

import com.soa.service.HelloWorldServerImpl;
import com.soa.service.HelloWorldServer;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class HelloServiceClient {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://127.0.0.1:8000/helloworld?wsdl");
            QName qname = new QName("http://service.soa.com/","HelloWorldServerImplService");

            Service service = Service.create(url, qname);

            HelloWorldServer server = service.getPort(HelloWorldServer.class);
            String name = "Barna";
            System.out.println(server.sayHello(name));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
