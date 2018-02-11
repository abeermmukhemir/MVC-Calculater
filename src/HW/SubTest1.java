package HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubTest1 {

	@Test
	public void test() {
		Model m=new Model();
		View v=new View();
		Controller c=new Controller(v,m);
		m.setN1("7.5");
		m.setN2("4.0");

		
		m.sub();
		double res=m.getResult();
		assertTrue(res==3.5);
	}

}
