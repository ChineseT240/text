package cn.smbms.service.role;

import cn.smbms.pojo.Role;

public interface RoleService {

	//修改角色信息
	public int RoleUpdate(Role role);
	
	//删除
	public int Delect(int id);
		
	public Role SelectRole(String role);
		
}
