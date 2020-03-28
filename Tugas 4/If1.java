/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Hari,Tanggal	: Rabu, 25 Maret 2020
	Waktu		: 15.19 WITA
*/

/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */

import java.util.Scanner;
public class If1 {

	public static void main(String[] args) {

		Scanner masukan=new Scanner(System.in);
		int a;
	/* Program */
		System.out.print ("Contoh IF satu kasus \n");	
		System.out.print ("Ketikkan suatu nilai integer : ");
		a = masukan.nextInt();
		if (a >= 0)
			System.out.print ("\nNilai a positif "+ a);
	}
}