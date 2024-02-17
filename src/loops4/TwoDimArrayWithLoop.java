package loops4;

public class TwoDimArrayWithLoop {
	 
	 
    public static void main(String[] args) {
 
         // TODO Auto-generated method stub
 
 
         String empinfo[][]=new String[2][2];
 
        
 
           empinfo[0][0]="aditya";
 
           empinfo[0][1]="27";
 
           empinfo[1][0]="Mike";
 
           empinfo[1][1]="30";
 
 
         for(int i=0;i<=1;i++)
 
           {
 
                for(int j=0;j<=1;j++)
 
                {
 
                     System.out.println(empinfo[i][j]);
 
                }
           }
    }
}
