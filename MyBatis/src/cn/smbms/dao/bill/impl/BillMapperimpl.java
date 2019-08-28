/*package cn.smbms.dao.bill.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import cn.smbms.dao.bill.BillMapper;
import cn.smbms.pojo.Bill;

public class BillMapperimpl implements BillMapper{

	private SqlSessionTemplate sqlSessionTemplate;
	public List<Bill> getBillLsit(Bill bill) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("cn.smbms.dao.bill.BillMapper.getBillLsit",bill);
	}
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
*/