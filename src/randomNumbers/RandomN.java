package randomNumbers;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomN {

	public static int[] get500RandomInt() {
		//SET
		Set<Integer>mySet = new LinkedHashSet<Integer>();
		 // create instance of Random class 
        Random rand = new Random(); 
        Scanner userInput = new Scanner (System.in);
           
        	  while(mySet.size() !=500) {
        		 int x= rand.nextInt(1000); 
        		 	mySet.add(x);
        	}
        	for(Integer x : mySet) {
        		System.out.println(x);
        	} 
        	Object [] myObjArray = mySet.toArray();
        	
        	int[] MyIntArray = new int[500];
        	
        	for(int i = 0; i<500; i++) {
        	MyIntArray[i] = (int) myObjArray[i];
        	
      
        
	}
        	return MyIntArray;
        	  
        	
	}

}

