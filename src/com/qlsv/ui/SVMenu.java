package com.qlsv.ui;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlsv.control.SVControlAdd;
import com.qlsv.control.SVControlPrint;

public class SVMenu {

	PrintWriter out;
	Scanner in;
	String prompt;
	private SVControlAdd svControlAdd;
	private SVControlPrint svControlPrint;
	
	public void setSVControlPrint(SVControlPrint svControlPrint) {
		this.svControlPrint = svControlPrint;
	}

	public SVMenu() {

	}

//	SVMenu(PrintWriter _out,
//	Scanner _in){
//		out = _out;
//		in = _in;
//	}

	public SVMenu(PrintWriter out, Scanner in, String prompt) {
		this.out /* field */ = out /* tham số */;
		this.in = in;
		this.prompt = prompt;
	}
	
	public SVMenu(PrintWriter out, Scanner in, String prompt, 
			SVControlAdd svControlAdd) {
		this(out, in, prompt);
		this.svControlAdd = svControlAdd;
	}

	public void controlLoop() {
		// chạy vô tận
		out.println("hãy gõ lệnh \"help\" để được hỗ trợ!! ");
		out.flush();
		while (true) {
			String command;
			out.print(prompt);
			out.flush();
			command = in.nextLine();// "help", PRINT, ADD, QUIT, ABOUT

			// xóa khoảng trắng 2 đầu
			command = command.trim();

			// kiểm tra
			if ("help".equalsIgnoreCase(command)) {
				help();
				continue;// quay trở lại vòng lặp mới
			}
			
			if("add".equalsIgnoreCase(command)) {
				add();
				continue;
			}
			if("pAll".equalsIgnoreCase(command)) {
				printAllSV();
				continue;
			}
		}
	}

	private void printAllSV() {
		//gửi thông điệp đến đối tượng
		//SVControlPrint
		svControlPrint.printAllSV();
	}

	private void add() {
		// TODO Auto-generated method stub
		//gửi tthoong điệp đến đối tượng SVControlAdd
		svControlAdd.add();
	}

	private void help() {
		// code
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
		out.println("[HELP] huong dan su dung phan mem");
		out.flush();
		out.println("[ABOUT] thong tin ve PM QLSV");
		out.flush();
		out.println("[ADD] them mới một Sinh viên");
		out.flush();
		out.println("[PRINT] in tất cả chuyến xe");
		out.flush();
		out.println("[EXIT] thoát khỏi phần mềm");
		out.flush();
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();

	}

}
