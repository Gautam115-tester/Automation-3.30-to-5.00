package oopsConcept;
public class Student {
String name;
int age;
int Id;
	public Student(String name,int age,int id) {
		this.name = name;
		this.age = age;
		this.Id = id;
	}
	public void StudentDetail() {
		System.out.println("Name of the student is "+name);
		System.out.println("Age of "+name+" is "+age);
		System.out.println("Id of "+name+" is "+Id);
	}
	public static void main(String[] args) {
		Student s1 = new Student("Ajay", 19, 1);
		s1.StudentDetail();
		s1.StudentDetail();
		Student s2 = new Student("vijay", 20, 2);
		s2.StudentDetail();
		
	}

}
