package Static;

public class StaticTest {
	int id;
	String name;
	static String college = "Northeastern University";
	
	StaticTest(int i, String n){
	id = i;
	name= n;	

}
	
	void display() {System.out.println(id+" "+name+" "+" "+college);}
	

	public static void main (String args[]) {
		StaticTest st1 = new StaticTest(120,"Sandip");
		StaticTest st2 = new StaticTest(123, "Rajesh");
		st1.display();
		st2.display();
	}
	}
	

	