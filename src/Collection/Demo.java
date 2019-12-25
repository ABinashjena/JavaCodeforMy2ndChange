package Collection;

public class Demo {

	public static void main(String[] args) {
		//reverse a String
		String s="Abinash jena";
		String[] word = s.split(" ");
		for(int i=0;i<word.length;i++)
		{
		
		
		StringBuffer sb=new StringBuffer(word[i]);
		System.out.print(sb.reverse()+" ");
		
		
		}
		
		
		
	}

}
