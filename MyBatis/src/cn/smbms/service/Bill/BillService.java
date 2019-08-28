package cn.smbms.service.Bill;

import java.util.List;

import cn.smbms.pojo.Bill;
import cn.smbms.pojo.Provider;

public interface BillService {

	public List<Bill> findBillsWithConditions(Bill bill);
	
	
	public int DelectId(int id);
	
	public int Updata(Bill bill);
	
	public int Add(Bill bill);
	

}
