package cn.smbms.dao.bill;

import java.util.List;

import cn.smbms.pojo.Bill;

public interface BillMapper {

	public List<Bill> getBillLsit(Bill bill);
	
	public int DelectId(int id);
	
	public int Updata(Bill bill);
	
	public int Add(Bill bill);
}
