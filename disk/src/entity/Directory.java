package entity;
import java.util.*;
public class Directory
{
    private int id;
    private String user;
    private String path;
    private String parentPath;
    private String dir;
    private Date createTime;
	/**
	 * id���Ե�getter����
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * id���Ե�setter����
	 */
	public void setId(int id)
	{
		this.id = id;
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
	 * path���Ե�getter����
	 */
	public String getPath()
	{
		return path;
	}
	/**
	 * path���Ե�setter����
	 */
	public void setPath(String path)
	{
		this.path = path;
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
	 * createTime���Ե�getter����
	 */
	public Date getCreateTime()
	{
		return createTime;
	}
	/**
	 * createTime���Ե�setter����
	 */
	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}
}
