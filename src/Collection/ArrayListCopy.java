package Collection;

import java.util.ArrayList;

public class ArrayListCopy {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Abinash");
		al.add("Jena");
		al.add(123009);
		al.add(null);
		System.out.println(al);
		al.remove(null);
		System.out.println(al);
		al.add( 1, 2);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		
		
		

	}

}
