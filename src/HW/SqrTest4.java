package HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class SqrTest4 {

	@Test
	public void test() {
		Model m=new Model();
		View v=new View();
		Controller c=new Controller(v,m);
		m.setN1("-4.0");
		m.sqrt();
		assertNotNull(m.getErrorMsg());	
	}

}
