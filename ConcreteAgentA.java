package com.servlet.cor;

import com.servlet.RequestType;

//ConcreteHandlerA
public class ConcreteAgentA implements Agent {
	private Agent nextHandle;

	public void setNextHandle(Agent nextHandle) {
		this.nextHandle = nextHandle;
	}

	public void handle(Request request) {
		if (request.getType().equals(RequestType.TYPE_A)) {
			// Handle the request here
			System.out.println("ConcreteHandlerA is handling the request.");
		} else if (nextHandle != null) {
			// Pass the request to the next handler
			nextHandle.handle(request);
		}
	}
}
