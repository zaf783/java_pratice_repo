package Day_1;

public class Child_class extends Parent {
	
	public Child_class()
	{	
		this(1,2,3);
		System.out.println("child default constructor");
	}
	
	public Child_class(int a)
	{	
		super(2,2);
		System.out.println("child 1 parameterized constructor");
	}
	
	public Child_class(int a, int b)
	{	
		this();
		System.out.println("child  2 parameterized constructor");
	}
	
	public Child_class(int a, int b,int c)
	{	
		this(1);
		System.out.println("child 3 parameterized constructor");
	}
	

	public static void main(String[] args) {
		Child_class obj_ref=new Child_class(2,2);

	}

}
