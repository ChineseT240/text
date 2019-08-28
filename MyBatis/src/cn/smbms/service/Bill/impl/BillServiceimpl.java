package cn.smbms.service.Bill.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.smbms.dao.bill.BillMapper;
import cn.smbms.pojo.Bill;
import cn.smbms.pojo.Provider;
import cn.smbms.service.Bill.BillService;

@Service("BillService")
public class BillServiceimpl implements BillService {

	@Autowired
	private BillMapper BillMapper;
	
	public List<Bill> findBillsWithConditions(Bill bill) {
		try {
			return BillMapper.getBillLsit(bill);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		
	}

	public BillMapper getBillMapper() {
		return BillMapper;
	}

	public void setBillMapper(BillMapper billMapper) {
		BillMapper = billMapper;
	}

	public int DelectId(int id) {
		try {
			return BillMapper.DelectId(id);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		
	}

	public int Updata(Bill bill) {
		try {
			return BillMapper.Updata(bill);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		
	}

	public int Add(Bill bill) {
		try {
			return BillMapper.Add(bill);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		
	}

}
