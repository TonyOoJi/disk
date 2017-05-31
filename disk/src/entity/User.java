package entity;

public class User
{
    private String user;
    private String password;
    private String repassword;
    private String passwordMD5;
    private String xm;
    private String email;
    private String phone;
    private String qq;
    private String validationCode;
	/**
	 * validationCode���Ե�getter����
	 */
	public String getValidationCode()
	{
		return validationCode;
	}
	/**
	 * validationCode���Ե�setter����
	 */
	public void setValidationCode(String validationCode)
	{
		this.validationCode = validationCode;
	}
	/**
	 * user���Ե�getter����
	 */
	public String getUser()
	{
		return user;
	}
	/**
	 * user���Ե�setter����
	 */
	public void setUser(String user)
	{
		this.user = user;
	}
	/**
	 * password���Ե�getter����
	 */
	public String getPassword()
	{
		return password;
	}
	/**
	 * password���Ե�setter����
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	/**
	 * xm���Ե�getter����
	 */
	public String getXm()
	{
		return xm;
	}
	/**
	 * xm���Ե�setter����
	 */
	public void setXm(String xm)
	{
		this.xm = xm;
	}
	/**
	 * email���Ե�getter����
	 */
	public String getEmail()
	{
		return email;
	}
	/**
	 * email���Ե�setter����
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
	/**
	 * phone���Ե�getter����
	 */
	public String getPhone()
	{
		return phone;
	}
	/**
	 * phone���Ե�setter����
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	/**
	 * qq���Ե�getter����
	 */
	public String getQq()
	{
		return qq;
	}
	/**
	 * qq���Ե�setter����
	 */
	public void setQq(String qq)
	{
		this.qq = qq;
	}
	/**
	 * passwordMD5���Ե�getter����
	 */
	public String getPasswordMD5() throws Exception
	{
		return common.Encrypter.md5Encrypt(password);
	}
	/**
	 * passwordMD5���Ե�setter����
	 */
	public void setPasswordMD5(String passwordMD5)
	{
		this.passwordMD5 = passwordMD5;
	}
	
    public String toString()
    {
    	return getUser();
    }
	/**
	 * repassword���Ե�getter����
	 */
	public String getRepassword()
	{
		return repassword;
	}
	/**
	 * repassword���Ե�setter����
	 */
	public void setRepassword(String repassword)
	{
		this.repassword = repassword;
	}
}
