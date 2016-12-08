package sonvh.webservice.ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import sonvh.webservice.entity.Group;
import sonvh.webservice.entity.Groups;
import sonvh.webservice.entity.User;
import sonvh.webservice.entity.Users;

//Service Implementation Bean
@WebService(endpointInterface = "sonvh.webservice.ws.ApiService")
public class ApiServiceImpl implements ApiService {

	static Users listUsers = new Users();
	static Groups listGroups = new Groups();

	public ApiServiceImpl() {

		Group group = new Group();
		group.setId(1);
		group.setName("Goup_1");
		listGroups.addGroup(group);

		group = new Group();
		group.setId(2);
		group.setName("Goup_2");
		listGroups.addGroup(group);

		group = new Group();
		group.setId(3);
		group.setName("Goup_3");
		listGroups.addGroup(group);
	}

	@Override
	public String getHelloWorldAsString() {
		return "Hello World JAX-WS";
	}

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		User u = new User(1, "Mot", new Date());
		u.setBirth(new Date());
		Group g = new Group();
		g.setId(1);
		g.setName("G_Mot");

		u.setGroup(g);
		return u;
	}

	@Override
	public User[] getListUsers() {

		// List<User> lstUsers = new ArrayList<>();

		Group group = new Group();
		group.setId(1);
		group.setName("Mot");
		for (int i = 0; i < 3; i++) {
			User user = new User(i, "name: " + String.valueOf(i), new Date());
			user.setGroup(group);
			listUsers.addUser(user);
			// lstUsers.add(user);
		}

		// Users lu = new Users();
		// lu.setUsers(lstUsers.toArray(new User[lstUsers.size()]));
		return listUsers.getUsers();// lu.getUsers();
	}

	@Override
	public boolean addUser(User user) {

		return listUsers.addUser(user);
	}

	@Override
	public boolean updateUser(User user) {

		return listUsers.updateUser(user);
	}

	@Override
	public boolean deleteUser(User user) {
		return listUsers.deleteUser(user);
	}

	@Override
	public Group[] getListGroups() {

		return listGroups.getGroups();

	}

	@Override
	public boolean addGroup(Group group) {
		listGroups.addGroup(group);
		return true;
	}
}