import metier.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestProduct {
    @Test
    public void test(){
      double a=5;
      double b=8;
      double expected=40;
      Product p=new Product();
      double res=p.multiplication(a,b);
      assertEquals(expected,res,0.001);
    }
}
