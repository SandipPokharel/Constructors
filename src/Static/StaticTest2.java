package Static;

public class StaticTest2 {
	static int id = 0;
	
	StaticTest2(){
		id++;
		
		System.out.println(id);
	}
	
	
	public static void main (String args[]) {
		StaticTest2 st1= new StaticTest2();
		StaticTest2 st2 = new StaticTest2();
		StaticTest2 st3= new StaticTest2();
		
	}
}
