package com.qlsv.control;

import com.qlsv.database.SVAddDAO;
import com.qlsv.ui.SVInAdd;
import com.qlsv.ui.SVOutAdd;

public class SVControlAdd {
	
	private SVAddDAO svAddDAO;
	private SVOutAdd svOutAdd;
	private SVInAdd svInAdd;
	
	public SVControlAdd() {
	}
	public SVControlAdd(SVAddDAO svAddDAO, SVOutAdd svOutAdd, SVInAdd svInAdd) {
		this.svAddDAO = svAddDAO;
		this.svOutAdd = svOutAdd;
		this.svInAdd = svInAdd;
	}
	
	public void add() {
		//gửi thông điệp đến đối tượng SVInAdd
		svInAdd.input();
		//gửi thông điệp đến đối tượng SVAddDAO
		//gửi thông điệp đến đối tượng SVOutAdd
	}
	
	
	
	

}
