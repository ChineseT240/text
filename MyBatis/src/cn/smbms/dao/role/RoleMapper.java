package cn.smbms.dao.role;

import cn.smbms.pojo.Role;

public interface RoleMapper {

	//修改角色信息
	public int RoleUpdate(Role role);
	
	//删除
	public int Delect(int id);
	
	//查找
	public Role SelectRole(String role);

	public Role SelectRole(Role role1);
}
