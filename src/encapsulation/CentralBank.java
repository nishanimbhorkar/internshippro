package encapsulation;

public class CentralBank {

	
	private  int intrate=5;
	  
	  public void deposit() {
		  
		  System.out.println("Customer can depoite");
	  }
	  
	  public void withdraw() {
		  
		  System.out.println("Customer can withdraw");
	  }
      
	  public void getIntrate() {
		  
		  System.out.println(intrate);
	  }
	  
	  public void setIntrate(int newIntrate,int Passcode) {
		  
		  if(Passcode==2323) {
			  
			  intrate=newIntrate;
			  
			  
		  }
	  }
	  
}
