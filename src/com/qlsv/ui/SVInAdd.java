package com.qlsv.ui;

import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

import com.qlsv.entity.SinhVien;
import com.qlsv.entity.SinhVienKT;
import com.qlsv.entity.SinhVienPM;

public class SVInAdd {
	private PrintWriter out;
	private Scanner in;

	public SVInAdd() {
	}

	public SVInAdd(PrintWriter out, Scanner in) {
		this.out = out;
		this.in = in;
	}

	public SinhVien input() {
		SinhVien sv = null;
		// xử lý nhập phần chung/ cha
		int maSV;
		String hoTen;
		String nganh;
		Date ngaySinhJava;
		String ngaySinh;
		out.print("[MÃ SINH VIÊN]:");
		out.flush();
		maSV = in.nextInt();
		in.nextLine();
		out.print("[HO TEN SV]:");
		out.flush();

		hoTen = in.nextLine();
		out.print("[NGAY SINH, dd/MM/yyyy]:");//20/02/2000
		out.flush();

		ngaySinh = in.nextLine();
		// chuyen ngay kieu chuoi
		// thanh ngay kieu Java
		out.print("[NGANH HOC \"KT\" / \"PM\"]:");
		out.flush();

		nganh = in.nextLine();
		if("KT".equalsIgnoreCase(nganh)) {
			sv = inputSVKT(maSV, hoTen, "KT", null);
		}
		
		if("PM".equalsIgnoreCase(nganh)) {
			//inputSVPM();
			sv = inputSVPM(maSV, hoTen, nganh, null);
		}
		return sv;
	}

	private SinhVien inputSVKT(int maSV, String hoTen, String nganh,
			Date ngaySinh) {
		double diemMarketing;
		double diemSale;

		out.print("[DIEM MARKETING]:");
		out.flush();

		diemMarketing = in.nextDouble();
		
		out.print("[DIEM SALES]:");
		out.flush();

		diemSale = in.nextDouble();
		
		SinhVienKT svKT = new SinhVienKT(maSV, hoTen, 
				nganh, ngaySinh,
				diemMarketing, diemSale);
		
		
		return svKT;
		
	}

	private SinhVien inputSVPM(int maSV, String hoTen, String nganh,
			Date ngaySinh) {
		double diemJava, diemCss, diemHtml;
		SinhVienPM sinhVienPM = null;
		//nhập thông tin phân mềm
		// nhập vào htong thin sinh viên phần mềm
				out.print("[ĐIỂM JAVA]:");
				out.flush();
				diemJava = in.nextDouble();
				out.print("[ĐIỂM CSS]:");
				out.flush();
				diemCss = in.nextDouble();
				out.print("[ĐIỂM HTML]:");
				out.flush();
				diemHtml = in.nextDouble();
				
				sinhVienPM = new SinhVienPM(maSV, hoTen, nganh, ngaySinh, 
						diemJava, diemCss, diemHtml);
		return sinhVienPM;
	}

}
