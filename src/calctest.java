import static org.junit.Assert.*;

import org.junit.Test.*;

public class calctest {

	//@SuppressWarnings("deprecation")
	//@Test
	public void test() {
		Modle c=new Modle();
		c.add(3.0, 4.0);//test number1 for addition
		double result=c.getresult();
		assertEquals(7,result);
		c.mult(3.0, 4.0);//test number2 for multiplication
		double res=c.getresult();
		assertEquals(12,res);
		c.division(4, 0);//test number3 for division
		double resl=c.getresult();
		assertEquals(Double.NaN,resl);
		c.subtract(4, 0);
		double sub=c.getresult();
		assertEquals(4,resl);
	}

}
