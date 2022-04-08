package day3;

public class Student extends User{
	
	private int studentNumber;
	private String className;
	
	
	public Student() {
		super();
		
	}
	public Student(int id, String name, String lastName, String nationalIdentity, int studentNumber, String className) {
		super(id, name, lastName, nationalIdentity);
		this.studentNumber = studentNumber;
		this.className = className;
		System.out.println("Student yapıcı fonksiyonu çalıştı");
		
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	

}
