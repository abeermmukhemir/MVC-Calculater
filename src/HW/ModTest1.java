package HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModTest1 {

	@Test
	public void test() {
		Model m=new Model();
		View v=new View();
		Controller c=new Controller(v,m);
		m.setN1("3");
		m.setN2("2");

		
		m.mod();
		double res=m.getResult();
		assertTrue(res==1);
	}

}
