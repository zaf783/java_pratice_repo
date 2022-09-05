package Day_1;

public class Student {
	
	int roll_no=57;
	int age=27;
	
	public void display()
	{
		System.out.println("Welcome to all");
	}
	
	public void display_2()
	{
		System.out.println("Automation is very easy");
	}
	
	

		public static void main(String[] args) {
			
			Student obj_ref=new Student();
			System.out.println("Roll no is "+ obj_ref.roll_no);
			System.out.println("Age no is "+ obj_ref.age);
			obj_ref.display();
			obj_ref.display_2();
			
			
			
			
			
			
			
		}
}
