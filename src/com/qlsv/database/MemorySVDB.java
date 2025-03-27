package com.qlsv.database;

import java.util.ArrayList;

import com.qlsv.entity.SinhVien;
import com.qlsv.entity.SinhVienKT;
import com.qlsv.entity.SinhVienPM;

public class MemorySVDB {
	
	private static ArrayList<SinhVien> svDB;
	
	//khối code static
	static {
		svDB = new ArrayList<SinhVien>();
		
		SinhVienPM svPM1 = new SinhVienPM(111, "Le Van Teo", 
				"PM", null, 4, 4, 4);
		SinhVienPM svPM2 = new SinhVienPM(222, "Le Van Tu", 
				"PM", null, 9, 9, 1);
		SinhVienKT svKT1 = new SinhVienKT(333, "Nguyen Thi Meo", 
				"KT", null, 7, 8);
		SinhVienKT svKT2 = new SinhVienKT(444, "Nguyen Thi Suu", 
				"KT", null, 2, 2);
		
		svDB.add(svPM1);
		svDB.add(svPM2);
		svDB.add(svKT1);
		svDB.add(svKT1);
		
	}
	
	public static void insert(SinhVien sv) {
		svDB.add(sv);
	}

}
