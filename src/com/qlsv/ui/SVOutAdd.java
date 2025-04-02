package com.qlsv.ui;

import java.io.PrintWriter;

import com.qlsv.entity.SinhVien;

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
		
		//out.println(sv);//toString()
	}
	
	

}
