/*package cn.smbms.dao.user.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.User;

public class UserMapperimpl implements UserMapper{

	private SqlSessionTemplate sqlSession;
	
	public List<User> getUserList(User user) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("cn.smbms.dao.user.UserMapper.getUserList", user);
	}

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	public int add(User user) {
		
		return sqlSession.insert("cn.smbms.dao.user.UserMapper.add", user);
	}

}
*/