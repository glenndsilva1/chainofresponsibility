package com.servlet.cor;

import com.servlet.RequestType;

public class Request {
	private RequestType type;

	public Request(RequestType type) {
		this.type = type;
	}

	public RequestType getType() {
		return type;
	}

	public static void main(String[] args) {
		// Create the chain of handlers
		Agent handlerA = new ConcreteAgentA();
		Agent handlerB = new ConcreteAgentB();
		// Create requests
        handlerA.setNextHandle(handlerB);

		Request request1 = new Request(RequestType.TYPE_A);
		Request request2 = new Request(RequestType.TYPE_B);
		// Send requests to the chain
		handlerA.handle(request1);
		handlerA.handle(request2);
	}
}
