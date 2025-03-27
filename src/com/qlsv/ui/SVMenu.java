package com.qlsv.ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class SVMenu {

	PrintWriter out;
	Scanner in;
	String prompt;

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
		}
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
