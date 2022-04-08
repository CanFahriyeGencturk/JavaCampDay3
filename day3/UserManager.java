package day3;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getName() +" "+user.getLastName()+" veritabanına eklendi.");
		
	}
	
	public void updateUser(User user, int testId) {
		if(user.getId() == testId) {
			System.out.println(user.getName()+" "+user.getLastName()+" kişisi güncellendi");
		}else {
			System.out.println(user.getName()+" "+user.getLastName()+" kişisi güncellenmedi");
		}
		
	}
	public void  usersList(User[] users) {
		int total = 0;
		for(User user:users) {
			System.out.println(user.getNationalIdentity()+" "+user.getName()+" "+user.getLastName());
			total = total+1;
		}
		System.out.println("Mevcut kişi sayısı: "+total);	}
	
}
