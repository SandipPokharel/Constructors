package Static;

public class StaticTest3 {
	int id;
	String name;
	static String college = "MBBS";
	
	StaticTest3(int i, String n){
	id= i;
	name= n;
	}
		
static void change(){
college = "Northeastern University";
}

void display() {
	System.out.println(id+" "+name+" "+college);
}
public static void main (String args[]) {
	
	StaticTest3.change();
	StaticTest3 st1 = new StaticTest3(11,"Sandip");
	StaticTest3 st2 = new StaticTest3(2, "Vishal");
	StaticTest3 st3 = new StaticTest3(3, "Sagar");
	
	st1.display();
	st2.display();
	st3.display();
		
	
}
			

}
