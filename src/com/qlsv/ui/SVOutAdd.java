package com.qlsv.ui;

import java.io.PrintWriter;

import com.qlsv.entity.SinhVien;
import com.qlsv.entity.SinhVienKT;
import com.qlsv.entity.SinhVienPM;

public class SVOutAdd {
	private PrintWriter out;

	
	public SVOutAdd(PrintWriter out) {
		this.out = out;
	}
	
	public void showMessage(SinhVien sv) {
		out.println("Đã thêm mới thành công SV!!");
		out.flush();
		out.println("[MÃ SV]: " + sv.getMaSV());
		out.println("[TÊN SV]: " + sv.getHoTen());
		out.println("[NGÀNH ]: " + sv.getNganh());
		out.println("[ĐIỂM]: " + sv.tinhDiem());
		out.println("[HỌC LỰC]: " + sv.tinhHocLuc());
		
		//kiểm tra, 2 cách
		//ngành
		//if("PM".equalsIgnoreCase(sv.getNganh())) {
			//điểm java, css, html
			
		//}
		
		//instance of
		if(sv instanceof SinhVienPM) {
			//phần mềm
			//điểm java, css, html
			SinhVienPM sinhVienPM;
			//ép kiểu
			sinhVienPM = (SinhVienPM)sv;
			out.println("ĐIỂM JAVA: " + sinhVienPM.getDiemJava());
		}
		
		if(sv instanceof SinhVienKT) {
			//kinh tiế
			//điểm marketing , sales
		}
		
		
		//out.println(sv);//toString()
	}
	
	

}
