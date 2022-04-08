package day3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setCourseName("Java");
		instructor.setNationalIdentity("1234456");
		
		UserManager userManager = new UserManager();
		userManager.addUser(instructor);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor);
		
		
		Student student = new Student();
		student.setId(1);
		student.setName("Can Fahriye");
		student.setLastName("Genctürk");
		student.setNationalIdentity("12345");
		student.setClassName("11A");
		userManager.addUser(student);
		
	}

}
