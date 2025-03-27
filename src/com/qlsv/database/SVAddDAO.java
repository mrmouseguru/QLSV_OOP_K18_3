package com.qlsv.database;

import com.qlsv.entity.SinhVien;

public class SVAddDAO {
	
	//constructor
	
	public void insert(SinhVien sv) {
		//gọi hàm static của class MemorySVDB
		MemorySVDB.insert(sv);
	}

}
