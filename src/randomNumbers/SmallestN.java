package randomNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestN {
	 public static void main(String[] args) {

    int numbers [] = {32, 100, -3, 99, 0 };
    
    int largest = numbers[0];
    int smallest = numbers[0];{
     
    for(int i = 1;  i<numbers.length; i++) {
         if(numbers[i]>largest) {
           largest = numbers[i];
         }
         else if(numbers[i]<smallest) {
           smallest = numbers[i];
         }
  }
   System.out.println("List of array is: " + Arrays.toString(numbers));
   System.out.println("Largest numbers is : " +largest);
   System.out.println("Smallest number is : " +smallest);
}
    Scanner userInput= new Scanner(System.in);
	 System.out.println("Give me the smallest number");
	 int data = userInput.nextInt();
	 System.out.println("Smallest number is : " +smallest);
}

}

	
	


