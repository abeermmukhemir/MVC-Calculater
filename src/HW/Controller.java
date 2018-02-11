package HW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	View calcview;
	Model calcmodel;
	
	public Controller(View v,Model m){
		calcview=v;
		calcmodel=m;
		
		Handler h=new Handler();
	for(int i=0;i<6;i++){
		calcview.calculteb[i].addActionListener(h);
		
	}
	//calcview.addListner(()h);
	}
	
	 public class Handler implements ActionListener{ 
		 
		 @Override
		 public void actionPerformed(ActionEvent event){
			 String num1,num2;
			 
				 num1=(calcview.getN1());
				 num2=(calcview.getN2());
				 calcmodel.setN1(num1);
				 calcmodel.setN2(num2);
				if(event.getSource()==calcview.calculteb[0])
					calcmodel.add();
				else if(event.getSource()==calcview.calculteb[1])
					calcmodel.sub();
				else if(event.getSource()==calcview.calculteb[2])
					calcmodel.mul();
				else if(event.getSource()==calcview.calculteb[3])
					calcmodel.div();
				else if(event.getSource()==calcview.calculteb[4])
					calcmodel.mod();
				else if(event.getSource()==calcview.calculteb[5]) {
					
					num1=calcview.getNumber();
					 calcmodel.setN1(num1);
					calcmodel.sqrt();}
				
				if(calcmodel.getErrorMsg()!=null)
						 calcview.displayError(calcmodel.getErrorMsg());
				else
						calcview.setResult(calcmodel.getResult());
		
			
				
				 
			 }
	 }
	 
	 
}
