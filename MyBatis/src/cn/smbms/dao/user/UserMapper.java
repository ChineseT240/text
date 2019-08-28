package cn.smbms.dao.user;

import java.util.List;

import cn.smbms.pojo.User;

public interface UserMapper {

	public List<User> getUserList(User user);
	
	/**
	 * 添加数据
	 * @param user
	 * @return
	 */
	public int add(User user);
	
	public int Update(User user);
	
	public int Delete(int id);
	
	public User SelectId(int userRole);
	
	public int DeleteuserRole(int userRole);
}
