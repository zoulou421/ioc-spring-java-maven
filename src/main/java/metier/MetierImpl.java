package metier;


import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier{
    @Autowired
    private IDao dao=null;

    @Override
    public double calculation() {
        double d= dao.getData();
        double res=d*23;
        return res;
    }

    public void init(){
        System.out.println("MetierImpl Initialisation ");
    }
}
