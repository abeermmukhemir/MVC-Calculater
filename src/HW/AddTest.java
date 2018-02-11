package HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
	Model m=new Model();
	View v=new View();
	Controller c=new Controller(v,m);
	m.setN1("3.5");
	m.setN2("4.0");

	
	m.add();
	double res=m.getResult();
	assertTrue(res==7.5);
	
	
	
	}

}
