public class MainInside 
{
	public static void main(String[]args)
	{
	   Test obj1 = new Test();
	   Test obj2 = new Test();
	   Test obj3 = new Test();
	   obj1.addCouter();
System.out.println("Counter milik obj1 = "+ obj1.getCounter());
System.out.println("Counter milik obj2 = "+ obj2.getCounter());
System.out.println("Counter milik obj3 = "+ obj3.getCounter());
  }
}