package week3.day1class;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		Automation objauto = new Automation();
		objauto.java();
		objauto.python();
		objauto.ruby();
		objauto.selenium();
	}

	public void selenium() {
		System.out.println("it is selenium");
		
	}

	public void java() {
		System.out.println("it is java");
		
	}

	@Override
	public void ruby() {
		super.ruby();
	}	

}
