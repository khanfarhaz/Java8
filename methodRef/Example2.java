package methodRef;

import java.util.Arrays;
public class Example2 {  

   public static void main(String[] args) {  
	String[] stringArray = { "A", "B", "C", "D", "E", "F", "G"};
	Arrays.sort(stringArray, String::compareToIgnoreCase);
	for(String str: stringArray){
		System.out.println(str);
	}
   }  
}