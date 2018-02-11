package HW;

public class Model {

	private double n1,n2;
	Double result;
	private String errormsg;
	
	public Model(){
		
		//this.n1=0.0;
		//this.n2=0.0;
	//	this.result=0.0;
	}
	
	public void setN1(String n1){
		
		try{
			this.n1=Double.parseDouble(n1);
		}
		catch(Exception e){
			errormsg="you have entered wrong format for the numbers , please try again ";
			
		}
	}
	public void setN2(String n2){
		
		try{
			this.n2=Double.parseDouble(n2);
		}
		catch(Exception e){
			errormsg="you have entered wrong format for the numbers , please try again ";
		}
	}
	
	
	public double getN1( ){
return n1;
}
	public double getN2( ){
return n2;
}
	public double getResult( ){
return result;
}
	
	public String getErrorMsg( ){
		return errormsg;
}
	
	public void add(){
		try{
			result=n1+n2;
		}
		catch(Exception e){
			errormsg="you have entered wrong format for the numbers , please try again ";
			
		}
	}
	
	public void sub(){
		try{
			result=n1-n2;
		}
		catch(Exception e){
			errormsg="you have entered wrong format for the numbers , please try again ";
			
		}
	}
		public void mul(){
			try{
				result=n1*n2;
			}
			catch(Exception e){
				errormsg="you have entered wrong format for the numbers , please try again ";
			}
		}
		
		public void div(){
			try{
				
			if(n2==0){
				errormsg="the second number should not equal zero";
			}
			else result=n1/n2;
			}
			catch(Exception e){
				errormsg="you have entered wrong format for the numbers , please try again ";
			}
		}
		
		public void mod(){
			try{
				
			if(n2==0.0){
				errormsg="the second number should not equal zero";
			}
			else if((n1-(int)n1)!=0.0){
				errormsg="you have entered wrong format for the numbers , please try again ";
				}
			else if((n2-(int)n2)!=0.0){
				errormsg="you have entered wrong format for the numbers , please try again ";
				}
			else result=n1%n2;
			}
			catch(Exception e){
				errormsg=e.getMessage().toString();
			//	errormsg="you have entered wrong format for the numbers , please try again ";
			}
		}
		
		public void sqrt(){
			try{
				
			if(n1<0.0){
				errormsg="the number should be posetive ";
			}
			else result=Math.sqrt(n1);
			}
			catch(Exception e){
				errormsg="you have entered wrong format for the numbers , please try again ";
			}
		}
	
}
