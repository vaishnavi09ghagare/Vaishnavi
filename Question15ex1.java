import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			else if(j==1)||(j==n))
			{
				System.out.print("*");
			}
			else if(j==i)
			{
				System.out.print("*");
			}
			else if(j==(n-i+1))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}
