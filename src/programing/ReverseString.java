package programing;

public class ReverseString {

	public static void main(String[] args) {
		String s="Abinash";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
       System.out.print("--------------------------------");
       StringBuffer sb=new StringBuffer(s);
       System.out.println(sb.reverse());
	}

}
