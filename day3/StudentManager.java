package day3;

public class StudentManager extends UserManager{
	@Override
	public void addUser(User user) {
		System.out.println(user.getName() +" "+user.getLastName()+" veritabanına eklendi.");
		
	}
	public void updateClassOfStundent(Student student, String newClassCode) {
		if(student.getClassName() != newClassCode) {
			student.setClassName(newClassCode);
		} else {
			System.out.println("Sınıf değişikliği yapılmadı");
		}
		
	}

}
