package cn.smbms.dao.provider.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import cn.smbms.dao.provider.ProviderMapper;
import cn.smbms.pojo.Provider;

public class ProviderMapperimpl implements ProviderMapper {
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<Provider> getProviderList(String proName) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("cn.smbms.dao.provider.ProviderMapper.getProviderList",proName);
	}

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
