package Day_1;

public class Child_method extends Par_method {
		
	
	public void child_mehtod1()
	{	
		this.child_mehtod_3(2, 2);
		System.out.println("Child default method");
	}
	
	public void child_mehtod_2(int a)
	{
		this.child_mehtod_4(1,2,3);
		System.out.println("child 1 parameterzied method");
	}
	
	public void child_mehtod_3(int a,int b)
	{	
		super.mehtod1();
		super.mehtod_4(2, 5, 6);
		super.mehtod_2(20);
		super.mehtod_3(3, 4);
		System.out.println("child 2 parameterized method");
	}
	
	public void child_mehtod_4(int a,int b,int c)
	{	
		this.child_mehtod1();
		System.out.println("child 3 parameterized method");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child_method obj_ref=new Child_method();
		obj_ref.child_mehtod_2(1);
	}

}
