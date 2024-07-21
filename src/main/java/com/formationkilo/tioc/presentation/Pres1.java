package com.formationkilo.tioc.presentation;

import com.formationkilo.tioc.business.BusinessImpl;
import com.formationkilo.tioc.dao.DaoImpl;
import com.formationkilo.tioc.dao.IDao;

public class Pres1 {
    public static void main(String [] v){

        /**
         * DI PPAR STATIC INSTANCIATION
         */
        DaoImpl dao=new DaoImpl();
        BusinessImpl business=new BusinessImpl();
        business.setDao(dao);
        System.out.println(business.calculation());

    }
}
