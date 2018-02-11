package HW;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class View extends JFrame{

	JTextField tn1,tn2,tres ,tsqrt;
	JButton [] calculteb;
	JPanel p;
	
	public View(){
		setSize(600,200);
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p=new JPanel();
		
		tn1=new JTextField(10);
		tn2=new JTextField(10);
		tres=new JTextField(10);
		tsqrt=new JTextField(10);
		
		JPanel p1=new JPanel();
		p1.add(new JLabel("first number"));
		p1.add(tn1);
		p1.add(new JLabel("second number"));
		p1.add(tn2);
		p1.add(new JLabel("result "));
		p1.add(tres);
		
		add(p1,BorderLayout.NORTH);
		
		JPanel p2=new JPanel();
		calculteb=new JButton[6];
		for(int i=0;i<6;i++){
			calculteb[i]=new JButton();
			p2.add(calculteb[i]);
			
		}
		calculteb[0].setText("Addition");
		calculteb[1].setText("Subtraction");
		calculteb[2].setText("Multiplication");
		calculteb[3].setText("Division");
		calculteb[4].setText("Moduls");
		calculteb[5].setText("Square Root");
		
		add(p2, BorderLayout.CENTER);
		
		JPanel p3=new JPanel();
		p3.add(new JLabel("number"));
		p3.add(tsqrt);
		p3.add(calculteb[5]);
		
		add(p3,BorderLayout.SOUTH);
		
	}
	
	
	public String getN1(){
		return  tn1.getText();
	}
	
	public String getN2(){
		return  tn2.getText();
	}
	
	public String getNumber(){
		return  tsqrt.getText();
	}
	
	public void setResult(double res){
		tres.setText(res+"");
	}
	
	public void displayError(String emsg){
		JOptionPane.showMessageDialog(null, emsg);
	}
	
	public void addListner(ActionListener listener){
		for(int i=0;i<6;i++){
			calculteb[i].addActionListener(listener);
			
		}
	}
}

