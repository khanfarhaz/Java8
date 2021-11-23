package functionalinterface;

public class Example1 {
	@FunctionalInterface
	interface MyFunctionalInterface {

	    public int addMethod(int a, int b);
	}
	public class Example1 { {

	   public static void main(String args[]) { 
	    	MyFunctionalInterface sum = (a, b) -> a + b;
	        System.out.println("Result: "+sum.addMethod(12, 100));
	    }
	}


