package com.formationkilo.tioc.business;

import com.formationkilo.tioc.dao.IDao;

public class BusinessImpl implements IBusiness{
    private IDao dao=null;
   /* public BusinessImpl(IDao dao){
        this.dao=dao;
    }*/
    /**
     * @return double
     */
    @Override
    public double calculation() {
        double d= dao.getData();
        double res=d*23;
        return res;
    }

    //DI BY SETTER
    public void setDao(IDao dao) {
        this.dao = dao;
        System.out.println("DI dao via setter... ");
    }

    public void init(){
        System.out.println("BusinessImpl Instanciation... ");
    }
}
