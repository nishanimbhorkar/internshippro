package encapsulation;

public class HSBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralBank cl=new CentralBank();
		
	//	System.out.println(cl.intrate);
	//	cl.intrate =6;
		
	//	System.out.println(cl.intrate);
		
		cl.getIntrate();
		
		cl.setIntrate(6, 2323);
		
		cl.getIntrate();
	}

}
