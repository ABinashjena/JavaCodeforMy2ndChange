package Oops_Concept;

public class SupperclassforAbstraction  extends Abstraction{

	public static void main(String[] args) {
		
		Abstraction s=new SupperclassforAbstraction();
		s.Test1();
		s.test2();
		SupperclassforAbstraction s1=new SupperclassforAbstraction();
		s1.Test1();
		s1.test2();

	}

	
	
	


	@Override
	public void Test1() {
		System.out.println("Test1 method of SupperclassforAbstraction class");
		
	}
	@Override
	public void test2()
	{
		System.out.println(" Test 2 method of SupperclassforAbstraction");
	}
	

}
