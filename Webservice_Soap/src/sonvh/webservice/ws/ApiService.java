package sonvh.webservice.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import sonvh.webservice.entity.Group;
import sonvh.webservice.entity.User;

//Service Endpoint Interface
@WebService()
@SOAPBinding(style = Style.RPC, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface ApiService {

	@WebMethod()
	String getHelloWorldAsString();

	@WebMethod()
	@WebResult(name = "user", partName = "user")
	User getUser();

	@WebMethod()
	@WebResult(name = "users", partName = "users")
	User[] getListUsers();

	@WebMethod()
	boolean addUser(@WebParam User user);

	@WebMethod()
	boolean updateUser(@WebParam User user);

	@WebMethod()
	boolean deleteUser(@WebParam User user);

	@WebMethod()
	@WebResult(name = "groups", partName = "groups")
	Group[] getListGroups();

	@WebMethod()
	boolean addGroup(@WebParam Group group);

}