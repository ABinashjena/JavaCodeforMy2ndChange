package Oops_Concept;

public class MethodOverloading {
	
	
	
	/*
	 * >> In a  class if you have the methods of same name but signature of the methods are different 
	 *    that method we called as method overloading .
	 * >> method overloading is used for increase the readability of the program
	 * >> method overloading we can do only in within the class
	 * >> Static method can be overloaded .
	 * >> we can overload the main method 
	 * >> method overloading is done in compile time 
	 * >> method over loading is faster than over riddling because of compile time 
	 * >> private and final methods can be overloaded but they cannot be overridden
	 */

	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		MethodOverloading.Test1();
		System.out.println(MethodOverloading.Test1(10));
		m.Test1("Abinash");
		m.test2();
		m.test2(10);
		m.test3();
		m.test3(10);
	}
	
	
	
	public static void Test1()
	{
		System.out.println("Test 1 Method");
	}
	public static int Test1(int a)
	{
		//System.out.println("Test 2 Method");
		return 10;
	}
	public void Test1(String a)
	{
		System.out.println("Test 3 Method");
	}
	private void test2()
	{
		System.out.println("private method1");
	}
	private void test2(int a)
	{
		System.out.println("private method2");
	}
	
	
	public final void test3()
	{
		System.out.println(" final Method 1");
	}
	public final void test3(int a)
	{
		System.out.println(" final Method 2");
	}
	
	
	
	
	
	
	
	
	
	

}
