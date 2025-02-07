package bokkaloPractice;

class A
{
	String str;
	
	String show()
	{
		return "Umesh";
		
	}
}

class B extends A
{
	int b=200;
	
	void display()
	{
		System.out.println(b);
	}
}



public class InhariDemo {

	public static void main(String[] args) 
	{
		A aa = new A();
		System.out.println(aa.show());
		
		
		B bb = new B();
		bb.display();
		System.out.println(bb.show());
	}

}
