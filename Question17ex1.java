import java.util.Scanner;

public class Question17ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern");
		int rows = scanner.nextInt();
        System.out.println("Printing the pattern!!");
        
        for(int i=5;i>=1;i--)
        {
        	for(int j=5;j>=1;j--)
        	{
        		if(j>=i)
        		{
        			System.out.print(j);
        		}
        		else
        		{
        			System.out.print(i);
        		}
        	}
        	for(int k=2;k<=5;k++)
        	{
        		if(k<=i)
        		{
        			System.out.print(i);
        		}
        		else
        		{
        			System.out.print(k);
        		}
        	}
        	System.out.println();
        }
        for(int i=2;i<=5;i++)
        {
        	for(int j=2;i<=5;i++)
        	{
        		if(j>=i)
        		{
        			System.out.print(j);
        		}
        		else
        		{
        			System.out.print(i);
        		}
        	}
        }
	}
}
