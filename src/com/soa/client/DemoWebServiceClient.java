package com.soa.client;

import com.soa.client.servicefromwsimport.DemoWebServer;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class DemoWebServiceClient {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://127.0.0.1:8000/demoservice?wsdl");
            QName qname = new QName("http://service.soa.com/","DemoWebServerImplService");

            Service service = Service.create(url, qname);
            System.out.println("Using service " + service.getServiceName());

            DemoWebServer server = service.getPort(DemoWebServer.class);

            System.out.println("Example call of sayHello operation with argument \"Barna\":");
            System.out.println(server.sayHello("Barna"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
