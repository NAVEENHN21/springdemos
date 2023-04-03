package com.examples.springcoreapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Employee e1=(Employee) ctx.getBean("em1");
        System.out.println(e1);
        
        Employee e2=(Employee) ctx.getBean("em2");
        System.out.println(e2);
    }
}
