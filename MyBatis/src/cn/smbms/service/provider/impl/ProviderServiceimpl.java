package cn.smbms.service.provider.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.smbms.dao.provider.ProviderMapper;
import cn.smbms.pojo.Provider;
import cn.smbms.service.provider.ProviderService;


@Service("ProviderService")
public class ProviderServiceimpl implements ProviderService {

	@Autowired
	private ProviderMapper ProviderMapper;
	
	public List<Provider> findProvidersWithConditions(String proName) {
		try {
			return ProviderMapper.getProviderList(proName);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	
		
	}

	public ProviderMapper getProviderMapper() {
		return ProviderMapper;
	}

	public void setProviderMapper(ProviderMapper ProviderMapper) {
		this.ProviderMapper = ProviderMapper;
	}

	

}
