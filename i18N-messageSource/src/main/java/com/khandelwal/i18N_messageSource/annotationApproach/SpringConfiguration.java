package com.khandelwal.i18N_messageSource.annotationApproach;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class SpringConfiguration {

	@Bean
	public MessageSource messageSource () {
		ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
		reloadableResourceBundleMessageSource.setBasename("messages/labels");
		return reloadableResourceBundleMessageSource;
	}
}
