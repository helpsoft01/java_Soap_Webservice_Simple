package sonvh.webservice.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import sonvh.webservice.entity.user;

//Service Endpoint Interface
@WebService()
@SOAPBinding(style = Style.RPC, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface HelloWorld {

	@WebMethod()
	String getHelloWorldAsString();

	@WebMethod
	user getUser();

	@WebMethod()
	@WebResult(name = "users", partName = "users")
	user[] getListUsers();

	// @WebMethod
	// @WebResult(name = "EchoStructReturnMessage", targetNamespace =
	// "http://example.org/complex")
	// users getComplexUser();

}