package entity;

import java.text.SimpleDateFormat;
import java.util.*;

public class DirInfo
{
	private String user;
	private String path;
	private String parentPath;
	private String dir;
	private Date createTime;
	private String time;
	private int count;
	private long size;

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

	/**
	 * count���Ե�getter����
	 */
	public int getCount()
	{
		return count;
	}

	/**
	 * count���Ե�setter����
	 */
	public void setCount(int count)
	{
		this.count = count;
	}

	/**
	 * size���Ե�getter����
	 */
	public long getSize()
	{
		return size;
	}

	/**
	 * size���Ե�setter����
	 */
	public void setSize(long size)
	{
		this.size = size;
	}

	/**
	 * time���Ե�getter����
	 */
	public String getTime()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");		
		return dateFormat.format(createTime);
	}

}
