package programing;

public class ReverseEachWordofaString {

	public static void main(String[] args) {
		
		String s="Abinash Jena";
		String temp;
		String[] Keyword = s.split(" ");
		for(int i=0;i<Keyword.length;i++)
		{
			temp=Keyword[i];
			StringBuffer sb=new StringBuffer(temp);
					System.out.print(sb.reverse()+" ");
		}
		
		

	}

}
