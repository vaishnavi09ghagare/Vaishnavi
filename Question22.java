import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range of number");
		int rows = scanner.nextInt();
		scanner.close();
  
			int a=-1;
			int n=1;
			for(int i=0;i<10;i++)
			{
				a=a+2;
				n+=1;
				if(n%2==0)
				{
					System.out.print(a);
				}
				else
				{
					System.out.print(a);
				}
			}
			System.out.println();
		}
			
}


