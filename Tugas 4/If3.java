/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Hari,Tanggal	: Rabu, 25 Maret 2020
	Waktu		: 15.23 WITA
*/

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {

		int a;
		Scanner masukan=new Scanner(System.in);
	/* Program */
		System.out.print ("Contoh IF tiga kasus \n");
		System.out.print ("Ketikkan suatu nilai integer :");
		a=masukan.nextInt();
		if (a > 0){
			System.out.println ("Nilai a positif "+ a);
		}else if (a == 0){
			System.out.println ("Nilai Nol "+ a);
		}else /* a > 0 */ {
			System.out.println ("Nilai a negatif "+ a);
		}
	}
}