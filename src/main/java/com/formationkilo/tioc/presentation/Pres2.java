package com.formationkilo.tioc.presentation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.nio.file.Path;

public class Pres2 {
    public static void main(String[] args) {

        ApplicationContext  ctx=
                new ClassPathXmlApplicationContext("config.xml");


    }
}
