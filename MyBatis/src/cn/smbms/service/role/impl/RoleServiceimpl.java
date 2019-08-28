package cn.smbms.service.role.impl;

import java.nio.file.attribute.PosixFilePermission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.smbms.dao.role.RoleMapper;
import cn.smbms.pojo.Role;
import cn.smbms.service.role.RoleService;

@Transactional
@Service("RoleService")
public class RoleServiceimpl implements RoleService{

	@Autowired(required=true)
	private RoleMapper roleMapper;
	@Transactional(propagation=Propagation.SUPPORTS)
	public int RoleUpdate(Role role) {
		try {
			return roleMapper.RoleUpdate(role);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	public int Delect(int id) {
		try {
			return roleMapper.Delect(id);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		
	}

	public Role SelectRole(String role) {
		Role role1=null;
		try {
			 role1=roleMapper.SelectRole(role1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return role1;
	}
}
