package methodRef;

@FunctionalInterface 
interface MyInterface{  
    Hello display(String say);  
}  
class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}  
public class Example3 {  
    public static void main(String[] args) { 
        MyInterface ref = Hello::new;  
        ref.display("Hello World!");  
    }  
}