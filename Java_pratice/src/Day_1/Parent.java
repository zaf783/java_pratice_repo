package Day_1;

public class Parent {	
	
	public Parent()
	{	
		this(1);
		System.out.println("Parent default constructor");
	}
	
	public Parent(int a)
	{	
		this(1,2,3);
		System.out.println("parent 1 parameterized constructor");
	}
	
	public Parent(int a, int b)
	{	this();
		System.out.println("parent 2 parameterized constructor");
	}
	
	public Parent(int a, int b,int c)
	{
		System.out.println("parent 3 parameterized constructor");
	}
}
