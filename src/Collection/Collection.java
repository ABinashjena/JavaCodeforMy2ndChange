package Collection;

public interface Collection {

	public boolean add(Object o);
	public boolean addAll(Collection c);
	public boolean remove(Object o);
	public boolean removeAll(Collection c);
	public boolean retainAll(Collection c);
	public void clear();
	public boolean contains(Object o);
	public boolean containsAll(Collection c);
	public boolean isEmpty();
	public int size();
	//public Iterator iterator();
	public Object[] toArray( );
	
	
	
	
	
}
