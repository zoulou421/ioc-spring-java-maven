package com.formationkilo.tioc.presentation;

import com.formationkilo.tioc.business.IBusiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pres3 {
    public static void main(String[] args) {
        ApplicationContext ctx= new AnnotationConfigApplicationContext("com.formationkilo.tioc.dao","com.formationkilo.tioc.business");
        IBusiness bus=  ctx.getBean(IBusiness.class);
        System.out.println("You put pack complete: "+bus.calculation());
    }
}
