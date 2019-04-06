package com.lirj;

import com.lirj.server.HelloObjectServer;
import com.lirj.server.HelloServer;

import javax.xml.ws.Endpoint;

public class ServerPublish {

    public static void main(String[] args) {
        ServerPublish.publishObjectServer();
    }

    public static void publishHelloServer() {
        Endpoint.publish("http://localhost:8080/HelloServer", new HelloServer());
    }

    public static void publishObjectServer() {
        Endpoint.publish("http://localhost:8080/HelloObjectServer", new HelloObjectServer());
    }
}
