package com.formationkilo.tioc.presentation;


import com.formationkilo.tioc.business.IBusiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.nio.file.Path;

public class Pres2 {
    public static void main(String[] args) {

        ApplicationContext  ctx=
                new ClassPathXmlApplicationContext("config.xml");
       // IBusiness business= (IBusiness) ctx.getBean("b");
        IBusiness business= ctx.getBean(IBusiness.class);
        System.out.println("RES CONSTRUCTOR XML "+business.calculation());



    }
}
