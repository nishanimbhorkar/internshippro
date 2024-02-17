package loops4;

public class TwoDimWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String empinfo[][]=new String[2][2];
		 
		  empinfo[0][0]="Nisha";
		  empinfo[0][1]="27";
		  empinfo[1][0]="Shweta";
		  empinfo[1][1]="30";
		
		  int i=0;
		
		  while(i<=1) {
			
			  int j=0;
			  
			  while (j<=1) {
				  
				
				  
				  System.out.println(empinfo[i][j]);
				 
				  
				  j++;
				  
			  }
			  i++;
			  
		  }
		
		
		

	}

}
