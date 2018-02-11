package HW;

public class MainClass {

	public static void main(String[] args){
		
		
		
		View v=new View();
		Model m=new Model();
		Controller c=new Controller(v,m);
		
		
		v.setVisible(true);
	}
}
