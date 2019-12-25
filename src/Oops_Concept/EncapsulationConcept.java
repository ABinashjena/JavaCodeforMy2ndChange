package Oops_Concept;

public class EncapsulationConcept {
	
	
	// Encapsulation is hiding data member
	
	public static void main(String[]  args) {
		EncapsulationConcept e=new EncapsulationConcept();
		e.setId(10);
		e.setName("Abinash");
		e.setNumber(123009);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getNumber());
		
		
	}
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	private int number;
	private String Name;
	

}
