package sonvh.webservice.ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sonvh.webservice.entity.user;
import sonvh.webservice.entity.users;

//Service Implementation Bean
@WebService(endpointInterface = "sonvh.webservice.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	
	public String getHelloWorldAsString() {
		return "Hello World JAX-WS";
	}

	@Override
	
	public user getUser() {
		// TODO Auto-generated method stub
		user u = new user(1, "Mot", new Date());
		u.setBirth(new Date());

		return u;
	}

	@Override	
	public user[] getListUsers() {

		List<user> lstUsers = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			user user = new user(i, "name: " + String.valueOf(i), new Date());
			lstUsers.add(user);
		}

		users lu = new users();
		lu.setUsers(lstUsers.toArray(new user[lstUsers.size()]));
		return lu.getUsers();
	}
}