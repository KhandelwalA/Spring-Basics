package com.khandelwal.applicationEvents;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext ("applicationEvent.xml");
        configurableApplicationContext.start();
        configurableApplicationContext.stop();
        configurableApplicationContext.close();
    }
}
