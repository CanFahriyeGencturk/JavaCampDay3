package day3;

public class InstructorManager extends UserManager {
	@Override
	public void addUser(User user) {
		System.out.println(user.getName() +" "+user.getLastName()+" veritabanına eklendi.");
		
	}
	public void updateClass(Instructor instructor, String newClassName) {
		if(!newClassName.isEmpty()) {
			instructor.setCourseName(newClassName);
		}else {
			System.out.println("Güncellenecek ders adını boş girdiniz!");
		}
		
	}

}
