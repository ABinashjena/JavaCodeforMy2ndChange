package programing;

public class PrimeNumber {
	public void PrimeNumber()
	{
	for(int i=1;i<15;i++)
	{
		boolean prime = true;
	
	for(int ans=2;ans<i;ans++)
	{
		prime=false;
	}
	if(prime)
	{
		System.out.println(i+ "  its aprime Number");
	}
	}
}
}