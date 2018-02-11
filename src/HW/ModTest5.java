package HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModTest5 {

	@Test
	public void test() {
		Model m=new Model();
		View v=new View();
		Controller c=new Controller(v,m);
		
		m.setN1("16");
		m.setN2("2.5");
		
		m.mod();
		String msg=m.getErrorMsg();
		assertNotNull(msg);
	}

}
