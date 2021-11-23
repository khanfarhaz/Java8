package foreachmethod;

import java.util.List;
import java.util.ArrayList;
public class Example {
   public static void main(String[] args) {
      List<String> names = new ArrayList<String>();
      names.add("farhaz");
      names.add("khan");
      names.add("atos");
      names.add("syntel");
      names.add("dell");
      names.stream() 
     .filter(f->f.startsWith("M")) 
     .forEach(System.out::println); 
   }
}