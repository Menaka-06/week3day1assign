package week3.day1class;

public class StudentsInfo {
	public void getStudInfo(int id)
	{
		System.out.println("the student id is "+id);

	}
	public void getStudInfo(int id, String name) {
		System.out.println("the student id is "+id +"  and the name is "+name);

	}
public void getStudInfo(String email, long phnum) {
	
	System.out.println("the student name is "+email +"  and the phone is "+phnum);
}
public static void main(String[] args) {
	StudentsInfo detofstud = new StudentsInfo();
	detofstud.getStudInfo(18);
	detofstud.getStudInfo(18, "menaka");
	detofstud.getStudInfo("abc@gmail.com", 12432);
	
	
	
}

}
