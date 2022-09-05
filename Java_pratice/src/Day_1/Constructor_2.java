package Day_1;

public class Constructor_2 {
	
	public void method_1()
	{	
		
		System.out.println("This is a default Method");
	}
	
	public void method_2(int a)
	{
		
		System.out.println("This is a one parameterized Method");
	}
	
	public void method_3(int a,int b)
	{
		
		System.out.println("This is a Two parameterized Method");
	}
	
	public void method_4(int a,int b, int c)
	{
		System.out.println("This is a Three parameterized Method");
	}
	
	public void method_5(int a,int b, int c, int d)
	{	
		this.method_4(1, 2, 3);
		this.method_1();
		this.method_2(1);
		this.method_3(2, 4);
		System.out.println("This is a Four parameterized Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_2 obj= new Constructor_2();
		obj.method_5(1, 2, 3, 4);
		

	}

}
