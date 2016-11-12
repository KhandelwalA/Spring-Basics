package com.khandelwal.propertyPlaceHolder.annotationApproach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value("${first.name}")
	private String firstName;
	
	@Value("${last.name}")
	private String lastName;
	
	@Value("${account.no}")
	
	private int accountNo;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAccountNo() {
		return accountNo;
	}

}
