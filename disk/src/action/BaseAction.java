package action;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import service.ServiceManager;

import com.opensymphony.xwork2.ActionSupport;
import common.UserInfo;

public class BaseAction extends ActionSupport implements
		org.apache.struts2.interceptor.ServletRequestAware,
		org.apache.struts2.interceptor.ServletResponseAware
{

	protected ServiceManager serviceManager;
	protected UserInfo userInfo;
	protected String result;	
	protected Map<String, String> cookies;
	protected javax.servlet.http.HttpServletResponse response;
	protected javax.servlet.http.HttpServletRequest request;

	public void setServletResponse(HttpServletResponse response)
	{
		this.response = response;

	}

	protected String getCookieValue(String name)
	{
		javax.servlet.http.Cookie cookies[] = request.getCookies();
		if (cookies != null)
		{
			for (Cookie cookie : cookies)
			{

				if (!cookie.getName().equals(name))
					continue;
//				System.out.println("cookie:"+cookie.getValue());
				return cookie.getValue();
			}
			
		}
		String value = request.getParameter(name);
//		System.out.println("param:"+value);
		if(value != null) return value;
		return null;
	}
	/**
	 * org.apache.struts2.interceptor.ServletRequestAware接口实现方法,
	 * 不需要调用就运行
	 */
	public void setServletRequest(HttpServletRequest request)
	{
		this.request = request;
//		System.out.println(getCookieValue("user"));
//		ApplicationContext context = new FileSystemXmlApplicationContext(
//				"WebRoot\\WEB-INF\\applicationContext.xml");
		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
		userInfo = (UserInfo) wac.getBean("userInfo");
		serviceManager = (ServiceManager) wac.getBean("serviceManager");
		userInfo.setCookieUser(getCookieValue("user"));
//		userInfo.setCookieUser(request.getParameter("user"));
		userInfo.setUserRoot(userInfo.getRoot() + userInfo.getCookieUser());
	}

	/**
	 * result属性的getter方法
	 */
	public String getResult()
	{
		return result;
	}

	/**
	 * result属性的setter方法
	 */
	public void setResult(String result)
	{
		this.result = result;

	}

	public void setServiceManager(ServiceManager serviceManager)
	{
		this.serviceManager = serviceManager;
	}

	/**
	 * userInfo属性的setter方法
	 */
	public void setUserInfo(UserInfo userInfo)
	{
		this.userInfo = userInfo;

	}

	protected void saveCookie(String name, String value, int maxAge)
	{
		javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie(name,
				value);
		cookie.setMaxAge(maxAge);
		response.addCookie(cookie);
	}

}