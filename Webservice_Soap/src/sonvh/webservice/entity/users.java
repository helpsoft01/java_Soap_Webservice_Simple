package sonvh.webservice.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "users")
public class users {

	@XmlElement(name = "users")
	user[] users;

	public users() {

	}

	public user[] getUsers() {
		return users;
	}

	public void setUsers(user[] users) {
		this.users = users;
	}

}
