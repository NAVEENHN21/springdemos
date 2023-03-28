package com.examples.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\AutoWiring\\springconfig.xml");
    	
    	Employee emp=(Employee) ctx.getBean("emp");
    	System.out.println(emp);
    }
}
