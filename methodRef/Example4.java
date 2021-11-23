package methodRef;
@FunctionalInterface 
interface MyInterface{  
    void display();  
}  
public class Example4
{  
    public void myMethod(){  
	System.out.println("FK");  
    }  
    public static void main(String[] args) {  
	Example4 obj = new Example4();   
	
	MyInterface ref = obj::myMethod;  
	
	ref.display();  
    }  
}