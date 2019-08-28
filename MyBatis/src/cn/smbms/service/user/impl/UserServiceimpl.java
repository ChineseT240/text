package cn.smbms.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;

@Transactional
@Service("UserService")
public class UserServiceimpl implements UserService {

	@Autowired
	private UserMapper UserMapper; //申明UserService接口引用
	
	public List<User> findUsersWithConditions(User user) {
		try {
			return UserMapper.getUserList(user);  //调用Dao方法实现查询
		} catch (RuntimeException e) {
		    e.printStackTrace();
		    throw e;
		}
		
	}

	public UserMapper getUserMapper() {
		return UserMapper;
	}

	public void setUserMapper(UserMapper UserMapper) {
		this.UserMapper = UserMapper;
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public boolean addNewUser(User user) {
		boolean result=false;
		try {
			if (UserMapper.add(user)==1) {
				result=true;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return false;
	}

	public int Update(User user) {
		try {
			return UserMapper.Update(user);
		} catch (RuntimeException e) {
		    throw e;
		}
	}

	public User SelectId(int userRole) {
		try {
			return UserMapper.SelectId(userRole);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		
	}

	public int DeleteuserRole(int userRole) {
		try {
			return UserMapper.DeleteuserRole(userRole);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		
	}

}
