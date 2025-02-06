package newly2;

import newly.InharitenceWithoutMain;

public class InharitenceMain
{
	public static void main(String[] args)
	{
		// This is for m1
		InharitenceWithoutMain main = new InharitenceWithoutMain();
		main.m1();
		
		// This is for m2
		System.out.println(main.m2());;
		
		// This is for m3
		main.m3("This is m3 from InharitenceWithoutMain Class");
		
		// This is for m4
		String var = main.m4("This is m4 from InharitenceWithoutMain Class");
		System.out.println(var);
		
	}
}
