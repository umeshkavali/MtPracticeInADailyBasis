package collectionsDemo;

import java.util.ArrayList;

public class ArayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("Umesh");
		al.add(100);
		al.add(10.2);
		al.add('A');
		
		System.out.println("Before adding...");
		
		System.out.println(al.size());
		System.out.println(al);
		
		al.add(2, "Java");
		System.out.println("After Adding...");
		System.out.println(al.size());
		System.out.println(al);
//		Object var = al.get(2);
//		System.out.println(var);
//		
//		al.remove(2);
//		System.out.println(al);
//		
//		al.clear();
//		System.out.println(al);
		
		
//		for(Object l:al)
//		{
//			System.out.println(l);
//		}
		
//		for(int i=0;i<=al.size()-1;i++)
//		{
//			System.out.println(al.get(i));
//		}
		
	}
}
