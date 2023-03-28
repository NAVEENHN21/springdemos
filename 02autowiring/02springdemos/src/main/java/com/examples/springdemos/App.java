package com.examples.springdemos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        
        
//       demo2();
       
//       demo3();
       
       demo4();
       
    }

	private static void demo4() {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\springdemos\\springconfig4.xml");

        EmployeeDAO dao=(EmployeeDAO) ctx.getBean("empdao");
        System.out.println(dao);
	}

	private static void demo3() {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\springdemos\\springconfig.xml");

        Computer c1=(Computer) ctx.getBean("homecomputer");
        System.out.println(c1);
        
        Computer o1=(Computer) ctx.getBean("officecomputer");
        System.out.println(o1);
        
        
	}

	private static void demo2() {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\springdemos\\springconfig.xml");
 
		Car c1=(Car) ctx.getBean("Car");
	        System.out.print(c1.hashCode());
	        
	        Car c2=(Car) ctx.getBean("Car");
	        System.out.print(c2.hashCode());
	        
	        Object b1=ctx.getBean("bank");
	        System.out.print(b1.hashCode());
	        
	        Object b2=ctx.getBean("bank");
	        System.out.print(b2.hashCode());
	}
}
