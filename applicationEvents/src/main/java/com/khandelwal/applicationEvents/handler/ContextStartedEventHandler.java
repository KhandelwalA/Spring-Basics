package com.khandelwal.applicationEvents.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStartedEventHandler implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
		System.out.println("Inside onApplicationEvent method when ContextStarted");
		
	}

}