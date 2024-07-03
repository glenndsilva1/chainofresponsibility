package com.servlet.cor;

import com.servlet.RequestType;

//ConcreteHandlerB
public class ConcreteAgentB implements Agent {
 private Agent nextHandle;

 public void setNextHandle(Agent nextHandle) {
     this.nextHandle = nextHandle;
 }

 public void handle(Request request) {
     if (request.getType().equals(RequestType.TYPE_B)) {
         // Handle the request here
         System.out.println("ConcreteHandlerB is handling the request.");
     } else if (nextHandle != null) {
         nextHandle.handle(request);
     }
 }
}

