package cn.smbms.service.user;

import java.util.List;

import cn.smbms.pojo.User;

public interface UserService {

	public List<User> findUsersWithConditions(User user);
	
	public boolean addNewUser(User user);
	
	public int Update(User user);
	
	public User SelectId(int userRole);
	
	public int DeleteuserRole(int userRole);
}
