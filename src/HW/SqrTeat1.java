package HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class SqrTeat1 {

	@Test
	public void test() {
		Model m=new Model();
		View v=new View();
		Controller c=new Controller(v,m);
		m.setN1("4.0");

		
		m.sqrt();
		double res=m.getResult();
		assertTrue(res==2.0);
	}

}
