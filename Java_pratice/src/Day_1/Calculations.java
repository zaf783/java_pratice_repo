package Day_1;

public class Calculations {
	
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int multiply(int x, int y)
	{
		int w=x*y;
		return w;
	}
	
	public int sub(int f, int g)
	{
		int r=f-g;
		return r;
	}
	
	public void  divide(int u , int h)
	{
		float z=u/h;
		System.out.println("The Answer is " + z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculations obj=new Calculations();
		int res1=obj.sum(10, 2);
		int res2=obj.sum(res1,2);
		int res3= obj.multiply(res2, 2);
		int res4=obj.sub(res3, 2);
		obj.divide(res4, 2);
		
		
		Calculations obj_1=new Calculations();
		int res_1=obj_1.multiply(10, 2);
		int res_2=obj_1.sub(res_1,2);
		int res_3= obj_1.sum(res_2, 2);
		int res_4=obj_1.sub(res_3, 2);
		obj_1.divide(res_4, 2);
		
		
	}

}
