package com.servlet.cor;

public interface Agent {
	void handle(Request request);
	void setNextHandle(Agent agent);
}
