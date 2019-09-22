import kotlukasz.dao.UserDao;
import kotlukasz.models.User;

public class Main {

	public static void main(String[] args) {

		User user = new User("ALA", "Ala@ala.pl", "123");

		UserDao userDao = new UserDao();

//		userDao.create(user);
//		User user1 = userDao.read(1);

		userDao.findAll();
		for (User temp : userDao.findAll()) {
			System.out.println(temp.toString());
		}
	}

}
