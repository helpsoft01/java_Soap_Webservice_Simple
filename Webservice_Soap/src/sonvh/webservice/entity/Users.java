package sonvh.webservice.entity;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Users")
public class Users {

	HashMap<String, User> listUsers = new HashMap<>();

	@XmlElement(name = "listUsers")
	User[] Users;

	public Users() {

	}

	public User[] getUsers() {
		return (User[]) listUsers.values().toArray(new User[listUsers.size()]);
	}

	public boolean addUser(User user) {

		boolean flag = true;
		String key = String.valueOf(user.getId());
		if (listUsers.get(key) == null) {
			listUsers.put(key, user);
		} else {
			// duplicate
			flag = false;
		}
		return flag;
	}

	public boolean updateUser(User user) {

		boolean flag = true;
		String key = String.valueOf(user.getId());
		if (listUsers.get(key) != null) {
			listUsers.replace(key, user);
		} else {
			// not exists
			flag = false;
		}
		return flag;
	}

	public boolean deleteUser(User user) {

		boolean flag = true;
		String key = String.valueOf(user.getId());
		if (listUsers.get(key) != null) {
			listUsers.remove(key);
		} else {
			// not exists
			flag = false;
		}
		return flag;
	}

	public void setUsers(User[] users) {
		this.Users = users;
	}

}
