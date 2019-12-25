package Oops_Concept;

public class InterfaceConceptTest implements InterfaceConcept{

	public static void main(String[] args) {
		
		InterfaceConceptTest IT=new InterfaceConceptTest();
		IT.test1();
		IT.test2();
		IT.test3();
		System.out.println(IT.num);

	}

	@Override
	public void test1() {
		System.out.println(" test1 of InterfaceConceptTest clas");
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println(" test2 of InterfaceConceptTest clas");
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println(" test3 of InterfaceConceptTest clas");
	}
	

}
