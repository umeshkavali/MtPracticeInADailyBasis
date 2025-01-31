package practiceUdemySessions;

public class JavaMethodsAndConstructorsMain 
{

	public static void main(String[] args) 
	{
		JavaMethodsAndConstructors jmac = new JavaMethodsAndConstructors();
		jmac.m1();
		// Approch 1
		/*
		String var1 = jmac.m2();
		System.out.println(var1);
		
		*/
		//Approch 2
		System.out.println(jmac.m2());
		
		jmac.m3(" JavaMethodsAndConstructors Class");
		
		// Approch1
		/*
		String var2 = jmac.m4(" JavaMethodsAndConstructors Class");
		System.out.println(var2);
		
		*/
		
		//Approch 2
		System.out.println(jmac.m4(" JavaMethodsAndConstructors Class"));
		
	}

}
