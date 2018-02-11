package HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest3 {

	@Test
	public void test() {
		Model m=new Model();
		View v=new View();
		Controller c=new Controller(v,m);
		
	m.setN1("abeer");
	m.setN2("razan");
		
	assertNotNull(m.getErrorMsg());	
	}

}
