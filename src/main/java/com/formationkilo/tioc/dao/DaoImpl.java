package com.formationkilo.tioc.dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
          DB connexion
         */
        double data=98;
        return data;
    }

  public void init(){
        System.out.println("DaoImpl Initialisation... ");
  }

    public DaoImpl() {
        System.out.println("Instanciation of DaoImpl ");
    }
}
