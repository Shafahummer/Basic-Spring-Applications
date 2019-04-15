package com.Spring_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	MyClass my=context.getBean(MyClass.class);
    	my.show();
    	
    }
}
