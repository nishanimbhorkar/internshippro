package controlstatement;

public class IfElseIf {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b){
			
			System.out.println("a is greater than b");
		}
		
		else if (b>c) {
			
			System.out.println("b is greater than c");
		}
		
		else if(a>c) {
			System.out.println("a is grater than c");
		}

		else
		{
			System.out.println("a is less than b and c");
		}
	}

}
