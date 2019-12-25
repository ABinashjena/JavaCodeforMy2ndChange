package Oops_Concept;

public class ChildClass extends ParentClass{
	
	/*>> if we having method of same name and same arguments in child class but properties of that method is different 
	 * that method is called method over Overriding.
	 * >> we can achieve method over Overriding only in IS_A relation ship,
	 * >> Overriding happens only in run time
	 * >> We can't overriding a static method.
	 * >> we can't overriding final and private method.
	 * >> Return type is matter in overriding of respective methods 
	 * >> Method Argument should be same while doing method overriding
	 */
	
	public static void main(String[] args) {
		ParentClass p=new ChildClass();
		p.Test1();
		p.Test2();
		ChildClass c=new ChildClass();
		c.Test1();

	}
	@Override
	public void Test1()
	{
		System.out.println("Child class method");
	}
	
	
	

}
