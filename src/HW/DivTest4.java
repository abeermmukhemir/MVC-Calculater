package HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivTest4 {

	@Test
	public void test() {
		Model m=new Model();
		View v=new View();
		Controller c=new Controller(v,m);
		
		m.setN1("16.0");
		m.setN2("0");
		
		m.div();
		String msg=m.getErrorMsg();
		assertNotNull(msg);
	}

}
