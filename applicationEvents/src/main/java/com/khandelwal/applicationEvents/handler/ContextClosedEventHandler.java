package com.khandelwal.applicationEvents.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextClosedEventHandler implements ApplicationListener<ContextClosedEvent> {

	public void onApplicationEvent(ContextClosedEvent arg0) {
		System.out.println("Inside onApplicationEvent method when ContextClosed");
		
	}

}
