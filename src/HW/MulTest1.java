package HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest1 {

	@Test
	public void test() {
		Model m=new Model();
		View v=new View();
		Controller c=new Controller(v,m);
		m.setN1("4.0");
		m.setN2("4.0");

		
		m.mul();
		double res=m.getResult();
		assertTrue(res==16.0);
	}

}
