package collectorsclass;

import java.util.stream.Collectors;  
import java.util.List;  
import java.util.ArrayList; 
class Student{  
   int id;   
   String name;   
   int age;
   public Student(int id, String name, int age) {  
      this.id = id;   
      this.name = name; 
      this.age = age;  
   } 
}  
public class Example1 {  
   public static void main(String[] args) {  
      List<Student> studentlist = new ArrayList<Student>();  
        
      studentlist.add(new Student(11,"farhaz",22));   
      studentlist.add(new Student(22,"khan",18));   
      studentlist.add(new Student(33,"atos",22));   
      studentlist.add(new Student(44,"dell",23));   
      studentlist.add(new Student(55,"syntel",18)); 
      Double avgAge = studentlist.stream()   
          .collect(Collectors.averagingInt(s->s.age));  
      System.out.println("Average Age of Students is: "+avgAge);
   }  
}