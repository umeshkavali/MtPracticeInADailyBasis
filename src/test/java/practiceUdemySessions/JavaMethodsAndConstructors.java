package practiceUdemySessions;

public class JavaMethodsAndConstructors 
{
	// No Parameters No Return Values
	
	void m1()
	{
		System.out.println("This is m1 from JavaMethodsAndConstructors Class ");
	}	
	
	// No Parameters Takes Return Values
	
	String m2()
	{
		return("This is m2 from JavaMethodsAndConstructors Class");
	}
	
	// Takes Parameters No return Values
	
	void m3(String name1)
	{
		System.out.println("This is m3 from"+name1);
	}
	
	
	// Takes Parameters Takes Return Values
	String m4(String name2)
	{
		return("This is m4 from"+name2);
	}
}
