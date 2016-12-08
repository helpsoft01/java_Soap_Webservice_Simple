package sonvh.webservice.entity;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "groups")
public class Groups {
	HashMap<String, Group> listGroup = new HashMap<>();

	@XmlElement(name = "listGroup")
	Group[] groups;

	public Group[] getGroups() {
		return (Group[]) listGroup.values().toArray(new Group[listGroup.size()]);
	}

	public void addGroup(Group group) {

		String key = String.valueOf(group.getId());
		if (listGroup.get(key) == null)
			listGroup.put(key, group);
	}

}
