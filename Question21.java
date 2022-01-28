import java.util.Scanner;

public class Question21 {
	
		public static void main(String[] args) {
			  Scanner cs=new Scanner(System.in); 
			  int n,i=1,se=1;
			     System.out.println("Enter the range of number :");
			     n=cs.nextInt();
			    
			     while(i<=n)
			     {
			         if(i%2==0)
			         {
			           System.out.print(se+" ");
			         }
			         else
			         {
			          System.out.print(1*se+" ");
			         }
			      se+=3;
			      i++;
			     }
			      cs.close();
			 }
		}

	


