package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		
		l.add(1);
		l.add(20);
		l.add(100);
		System.out.println(l.contains(1));
        l.remove(l.size()-2);
        System.out.println(l);
        l.retainAll(l);
        System.out.println(l);
        System.out.println(l.containsAll(l));
        Iterator it = l.iterator();
        System.out.println(it.next());
        Object[] obj = l.toArray();
        System.out.println(obj.length);
        
		
	}

}
