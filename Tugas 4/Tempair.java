/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Hari,Tanggal	: Rabu, 25 Maret 2020
	Waktu		: 15.50 WITA
*/

import java.util.Scanner;

public class Tempair {
	public static void main(String[] args) {
		int T;
		Scanner masukan=new Scanner(System.in);
	/* Program */
		System.out.print ("Contoh IF tiga kasus \n");
		System.out.print ("Temperatur (der. C) = ");		
		T=masukan.nextInt();
		
		if (T < 0) {
			System.out.print ("Wujud air beku \n"+ T);
		}else if ((0 <= T) && (T <= 100)){
			System.out.print ("Wujud air cair \n"+ T);
		}else if (T > 100){
			System.out.print ("Wujud air uap/gas \n"+ T);
		};
	}
}