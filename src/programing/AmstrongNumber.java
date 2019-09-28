package programing;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int copy=num;
		int reminder;
		int temp=0;
		
		while(num>0)
		{
			
			reminder=num%10;
			temp=temp+(reminder*reminder*reminder);
			num=num/10;
		}
		if(copy==temp)
		{
			System.out.println(copy+ "  ita s amstromg Number");
		}
	}

}
