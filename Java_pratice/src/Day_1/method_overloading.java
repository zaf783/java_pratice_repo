package Day_1;

public class method_overloading {
	
	//Condition for static poly/Static Ploy/Method Overloading
	//1.) Method same should be same 
	//2.) Method input paramters should be different 
	//3.) Method output can be same or it cannot be same 
	//4.) the purpose of the method should be different or it can be same 
	//5.) Static ploy can take place only within the class
	
	
	public void  arth(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("The result is"+ c);
	}
	
	public void  arth(int a,int b,int c)
	{
		int d;
		d=a+b+c;
		System.out.println("The result is"+ d);
	}
	
	public int arth(int a)
	{
		int z=a+1;
		return z;
	}
	
	public float arth(int z,float b)
	{
		float q;
		q=z+b;
		return q;
	}
	
	public static void main(String args[])
	{
		method_overloading obj=new method_overloading();
		obj.arth(2, 2);
		obj.arth(2,4, 5);
		int sum_1=obj.arth(5);
		System.out.println(sum_1);
		float ans=obj.arth(sum_1, 2.5F);
		System.out.println(ans);
		
		
	}

}
