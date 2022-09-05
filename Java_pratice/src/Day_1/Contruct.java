package Day_1;

public class Contruct {
	
	public Contruct()
	{	
		this(1,2,3);
		System.out.println("This is a default constructor");
	}
	
	public Contruct(int a)
	{
		this();
		System.out.println("This is a one parameterized constructor");
	}
	
	public Contruct(int a,int b)
	{
		this(1);
		System.out.println("This is a Two parameterized constructor");
	}
	
	public Contruct(int a,int b, int c)
	{
		System.out.println("This is a Three parameterized constructor");
	}
	
	public Contruct(int a,int b, int c, int d)
	{
		this(1,2);
		System.out.println("This is a Four parameterized constructor");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contruct obj=new Contruct(1,2,3,4);

	}

}
