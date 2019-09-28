package programing;

public class PalendromNumber {

	public static void main(String[] args) {
		
		int num=121;
		int copy=num;
		int reminder;
		int temp=0;
		while(num>0)
		{
			
			reminder=num%10;
			temp=(temp*10)+(reminder);
			num=num/10;
		}
		if(copy==temp)
		{
			System.out.println(copy+ " it's a Palendrom Number");
		}
		else
		{
			System.out.println(copy+ " it's not a Palendrom Number");
		}

	}

}
