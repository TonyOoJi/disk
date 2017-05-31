package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import java.io.File;
import service.interfaces.*;
import entity.*;

public class RegisterAction extends BaseAction implements ModelDriven<User>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();

	public User getModel()
	{
		return user;
	}

	/**
	 * ��֤��
	 */
	@Override
	public void validate()
	{
		if("".equals(user.getValidationCode())) return;
		Object obj = ActionContext.getContext().getSession().get(
				"validation_code");
		
		String validationCode = (obj != null) ? obj.toString() : "";

		if (!validationCode.equalsIgnoreCase(user.getValidationCode()))
		{
			if (user.getValidationCode() != null)
			{				
				this.addFieldError("validationCode", "��֤���������!");
			}
		}
	}

	public String execute() throws Exception
	{
		try
		{
//			System.out.println("RAuserModel:"+user);
//			System.out.println("RAserviceManager:"+serviceManager);
			UserService userService = serviceManager.getUserService();
			//ͨ��service����DAO����user
			userService.addUser(user);
            File dir = new File(userInfo.getRoot() + user.getUser());
            if(!dir.exists())
                dir.mkdir();
			result = "<" + user.getUser() + ">ע��ɹ���";
			return SUCCESS;
		}
		catch (Exception e)
		{
			result = e.getMessage();
			return ERROR;
		}

	}
}