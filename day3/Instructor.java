package day3;

public class Instructor extends User{
	
	private String courseName;
	private String instructorNumber;
	
	public Instructor() {
		super();
	}
	
	public Instructor(int id,String nationalIdentity, String name, String lastName, String courseName, String instructorNumber) {
		super(id, name, lastName, nationalIdentity);
		this.courseName = courseName;
		this.instructorNumber = instructorNumber;
		
		System.out.println("Intsructorın yapıcı fonksiyonu çalıştı");
	}

	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructorNumber() {
		return instructorNumber;
	}
	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

}
