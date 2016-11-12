package com.khandelwal.applicationEvents.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStoppedEventHandler implements ApplicationListener<ContextStoppedEvent> {

	public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
		System.out.println("Inside onApplicationEvent method when ContextStopped");
		
	}

}
