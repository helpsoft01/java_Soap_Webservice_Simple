package sonvh.webservice.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "user")
@XmlType(name = "user")
public class User {

	@XmlElement(name = "id")
	private int id;
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "birth")
	private Date birth;
	@XmlElement(name = "group")
	private Group group;

	// bat buoc phai co contruction nay
	public User() {
	}

	public User(int it, String name, Date date) {

		setId(it);
		setName(name);
		setBirth(date);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

}
