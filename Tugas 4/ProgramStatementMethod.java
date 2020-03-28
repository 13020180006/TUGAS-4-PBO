/* 	
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Hari/Tanggal	: Sabtu, 28 Maret 2020
	Waktu		: 17.18 WITA
*/

import java.util.Scanner;
public class ProgramStatementMethod{

	public static void looping(int batas){
		for (int a = 1; a<=batas; a++){
			System.out.println("Paramadina Mulya Majid");
		}
	}
	public static void main(String[] args){
		int batas;
		Scanner input = new Scanner(System.in);
		System.out.print("Input Jumlah Perulangan : ");
		batas = input.nextInt();
		looping(batas);
		
	}

}
