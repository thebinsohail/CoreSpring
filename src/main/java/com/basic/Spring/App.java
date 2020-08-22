package com.basic.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Configuration Loaded!");
        
        Sim sim=(Sim)context.getBean("Sim",Sim.class);
        sim.calling();
        sim.data();
        
    }
}
