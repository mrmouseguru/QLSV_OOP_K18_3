package main;


import java.io.PrintWriter;
import java.util.Scanner;

import com.qlsv.ui.SVMenu;

public class AppQLSV {

	public static void main(String[] args) {

		//Bước 1
		PrintWriter out;
		SVMenu menu;
		Scanner in;
		
	   //Bước 3     //Bước 2
		out =       new PrintWriter(System.out);
		in =       new Scanner(System.in);
		//menu =      new SVMenu();
		menu =     new SVMenu(out, in , "->");
		
		//gửi thông điệp
		out.print("~~~~ Chương trình QLSV ~~~~");
		out.flush();
		
		menu.controlLoop();
	}

}
