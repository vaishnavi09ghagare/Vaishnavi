import java.util.Scanner;

public class Question20ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int number;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern");
		int rows = scanner.nextInt();
        System.out.println("Printing the pattern!!");
        int number;
        int size = number / 2 + 1;
        
        for(int i = 1; i<= number; i++)
        {
        	for(int j = 1; j <=number; j++)
        	{
        		if(i <=size && j==1)
        		{
        			System.out.print("*");
        		}
        		else if(i == size || j== size)
        		{
        			System.out.print("*");
        		}
        		else if(i == 1 && j > number/2)
        		{
        			System.out.print("*");
        		}
        		else if(i > number/2 && j== number)
        		{
        			System.out.print("*");
        		}
        		else if(i == number && j <= number/2)
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        }
	}

}
