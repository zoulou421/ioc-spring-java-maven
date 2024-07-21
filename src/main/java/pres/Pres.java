package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pres {
    public static void main(String[] args) {
        ApplicationContext ctx=
                new AnnotationConfigApplicationContext("dao","metier");
        //IMetier metier=ctx.getBean(IMetier.class);
        IMetier metier= (IMetier) ctx.getBean("metier");
        System.out.println("Repo and service: "+metier.calculation());
    }
}
