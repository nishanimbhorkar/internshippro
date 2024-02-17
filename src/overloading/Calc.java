package overloading;

public class Calc {

	public void addnumber(int a,int b) {
		
		System.out.println(a+b);
	}
	
	public void addnumbers(int a, short b) {
		
		System.out.println(a+b);
	}
	
	public void addnumbers(int a, int b ,int c) {
		
		System.out.println(a+b+c);
	}
	
	
}
