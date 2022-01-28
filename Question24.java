import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 200,
		firstTerm = 0, 
		secondTerm = 1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range of number");
		int rows = scanner.nextInt();
        System.out.println("Printing the Series!!");
	    
	    while (firstTerm <= n) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	}

}
}