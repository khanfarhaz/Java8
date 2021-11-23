package streamAPI;

import java.util.ArrayList;
import java.util.List;
public class Example{ 
   public static void main(String[] args) {    
	List<String> names = new ArrayList<String>();
	names.add("Atos");
	names.add("syntel");
	names.add("java");
	names.add("spring");
		
		long count = names.stream().filter(str->str.length()<6).count();
	System.out.println(+count+" strings with length less than 6");

   }  
}