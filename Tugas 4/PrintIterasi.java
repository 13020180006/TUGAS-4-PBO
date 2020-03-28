/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Hari,Tanggal	: Rabu, 25 Maret 2020
	Waktu		: 15.35 WITA
*/

import java.util.Scanner;

public class PrintIterasi {
	public static void main(String[] args) {
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);
	/* Program */
		System.out.print ("Nilai N >0 = "); /* Inisialisasi*/
		N = masukan.nextInt();
		i = 1; /* First Elmt */
		System.out.print ("Print i dengan ITERATE : \n");
		for (;;){
			System.out.println(i); /* Proses */
			if (i == N)
				/* Kondisi Berhenti */ break;
			else {
				i++; /* Next Elmt */
			}
		} /* (i == N) */
	}
}
