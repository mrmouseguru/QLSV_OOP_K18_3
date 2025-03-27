package main;


import java.io.PrintWriter;
import java.util.Scanner;

import com.qlsv.control.SVControlAdd;
import com.qlsv.ui.SVInAdd;
import com.qlsv.ui.SVMenu;

public class AppQLSV {

	public static void main(String[] args) {

		//Bước 1
		PrintWriter out;
		SVMenu menu;
		Scanner in;
		SVControlAdd svControlAdd;
		SVInAdd svInAdd;
		
	   //Bước 3     //Bước 2
		out =       new PrintWriter(System.out);
		in =       new Scanner(System.in);
		//menu =      new SVMenu();
		//menu =     new SVMenu(out, in , "->");
		//truyền biến tham chiếu đối tượng vào bên trong 
		//đối tượng thông qua constructor
		svInAdd = new SVInAdd(out, in);
		svControlAdd = new SVControlAdd(null, null, svInAdd);
		menu = new SVMenu(out, in, "->", svControlAdd);
		
		//gửi thông điệp
		out.println("~~~~ Chương trình QLSV ~~~~");
		out.flush();
		
		menu.controlLoop();
	}

}
