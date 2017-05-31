package common;

import java.io.File;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class UserInfo implements ApplicationContextAware
{
    private String cookieUser;
    private String root;
    private String userRoot;
	private String dir;
	private String parentPath;
	private String time;
	private static ApplicationContext applicationContext;
	
	/**
	 * time���Ե�getter����
	 */
	public String getTime()
	{
	
		return time;
	}
	/**
	 * time���Ե�setter���� 
	 */
	public void setTime(String time)
	{
		this.time = time;
	}
	/**
	 * dir���Ե�getter����
	 */
	public String getDir()
	{
		return dir;
	}
	/**
	 * dir���Ե�setter����
	 */
	public void setDir(String dir)
	{
		this.dir = dir;
	}
	/**
	 * parentPath���Ե�getter����
	 */
	public String getParentPath()
	{
		return parentPath;
	}
	/**
	 * parentPath���Ե�setter����
	 */
	public void setParentPath(String parentPath)
	{
		this.parentPath = parentPath;
	}
	/**
	 * cookieUser���Ե�getter����
	 */
	public String getCookieUser()
	{
		return cookieUser;
	}
	/**
	 * cookieUser���Ե�setter����
	 */
	public void setCookieUser(String cookieUser)
	{
		this.cookieUser = cookieUser;
	}
	/**
	 * root���Ե�getter����
	 */
	public String getRoot()
	{
		return root;
	}
	/**
	 * root���Ե�setter����
	 */
	public void setRoot(String root)
	{
		this.root = root;
	}
	/**
	 * userRoot���Ե�getter����
	 */
	public String getUserRoot()
	{
		return userRoot;
	}
	/**
	 * userRoot���Ե�setter����
	 */
	public void setUserRoot(String userRoot)
	{
		this.userRoot = userRoot;
	}
	
	public String getAbsolutePath(String path)
	{
		String absolutePath = userRoot
		+ (File.separator.equals("\\") ? path.replaceAll(
				"/", "\\\\") : path);
		return absolutePath;
	}
	
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		UserInfo.applicationContext = applicationContext;
	}
	
	public static ApplicationContext getApplicationContext(){
		checkApplicationContext();
		return applicationContext;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name){
		checkApplicationContext();
		return (T) applicationContext.getBean(name);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz){
		checkApplicationContext();
		return (T) applicationContext.getBeansOfType(clazz);
	}
	
	private static void checkApplicationContext(){
		if(applicationContext == null){
			throw new IllegalStateException("û��springbean����");
		}
	}
}
