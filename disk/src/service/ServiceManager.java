package service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import common.UserInfo;

import service.interfaces.*;

public class ServiceManager implements ApplicationContextAware
{
    private UserService userService;
    private DirectoryService directoryService;
    private FileService fileService;
    private static ApplicationContext applicationContext;
    
	public FileService getFileService()
	{
		return fileService;
	}
	public void setFileService(FileService fileService)
	{
		this.fileService = fileService;
	}
	/**
	 * directoryService���Ե�getter����
	 */
	public DirectoryService getDirectoryService()
	{
		return directoryService;
	}
	/**
	 * directoryService���Ե�setter����
	 */
	public void setDirectoryService(DirectoryService directoryService)
	{
		this.directoryService = directoryService;
	}
	/**
	 * userService���Ե�getter����
	 */
	public UserService getUserService()
	{
		return userService;
	}
	/**
	 * userService���Ե�setter����
	 */
	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}
	
	//diaoyong bean
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		ServiceManager.applicationContext = applicationContext;
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
