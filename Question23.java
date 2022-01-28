import java.util.Scanner;
public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        Scanner sc = new Scanner(System.in); 
	        int iterator, current_number = 1, n; 
	         
	        System.out.print("Enter N :"); 
	        n = sc.nextInt(); 
	         
			System.out.println();	 
		 
	        for( iterator = 0; iterator<n; iterator++){ 
	            System.out.print(iterator+current_number); 
	            current_number = iterator + current_number; 
	        } 
	    } 

	}


