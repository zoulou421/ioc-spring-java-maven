package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /*
          DB connexion
         */
        return 98;
    }

  public void init(){
        System.out.println("DaoImpl Initialisation... ");
  }

}
