package com.qlsv.database;

import com.qlsv.entity.SinhVien;

public class SVAddDAO {
	
	//constructor
	//nếu không có lập trình bất kỳ hàm khởi tạo nào
	//thì Java sẽ tự động lập trình hàm khởi tạo mặc định
	//không tham số class đó
	
	public void insert(SinhVien sv) {
		//gọi hàm static của class MemorySVDB
		MemorySVDB.insert(sv);
	}

}
