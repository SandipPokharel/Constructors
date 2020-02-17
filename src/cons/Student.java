package cons;

public class Student {

	private int id;
	private String name;
	private int age;
	
	Student(int i , String n){
	
	id = i;
	name = n;
	}
	
	Student(){}
		
	void display() {
		System.out.println(id+" " +name);
	
	}
		
	public static void main(String[] args) {
	
		Student s1 = new Student(123, "Rajesh");
		Student s2 = new Student();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.display();
		s2.display();
		
	}

}
