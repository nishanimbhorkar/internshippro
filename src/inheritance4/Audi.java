package inheritance4;

public class Audi extends Car{
	
	String logo="four rings";
	String engine="6 speed engine";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Audi a1=new Audi();
		
		
		System.out.println(a1.engine);
		System.out.println(a1.logo);
	
	    System.out.println(a1.Wheels);
		System.out.println(a1.doors);
}
}
