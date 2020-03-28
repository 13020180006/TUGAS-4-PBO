/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Hari,Tanggal	: Rabu, 25 Maret 2020
	Waktu		: 15.36 WITA
*/

import java.util.Scanner;
public class PrintRepeat {

	public static void main(String[] args) {
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);
	/* Program */
		System.out.print ("Nilai N >0 = ");
	/* Inisialisasi */
		N = masukan.nextInt();
		i = 1;
	/* First Elmt */
		System.out.print ("Print i dengan REPEAT: \n");
		do{
			System.out.print (i+"\n"); /* Proses */
			i++; /* Next Elmt */
		}

		while (i <= N); /* Kondisi pengulangan */
	}
}