package newly2;

public class OverloadingConcept 
{
	int a=100, b=200;
	
	void m1()
	{
		System.out.println(a+b);
	}
	
	void m1(int x, int y)
	{
		System.out.println(x+y);
	}
	
	void m1(double x, String y)
	{
		System.out.println(x+y);
	}
	
	void m1(String y, double x)
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) 
	{
		OverloadingConcept oc = new OverloadingConcept();
		oc.m1(10.2, " String Name");
	}
}
