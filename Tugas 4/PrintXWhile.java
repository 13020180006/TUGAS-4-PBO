/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Hari,Tanggal	: Rabu, 25 Maret 2020
	Waktu		: 15.46 WITA
*/

import java.util.Scanner;

public class PrintXWhile {
	public static void main(String[] args) {
		int Sum;
		int x; 
		Scanner masukan=new Scanner(System.in);
	/* Program */
		Sum = 0; /* Inisialisasi */
		System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt();/* First Elmt*/
		while (x != 999) /* Kondisi berhenti */ {
			Sum = Sum + x; /* Proses */
			System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
			x = masukan.nextInt();/* First Elmt*/
		}
		System.out.println("Hasil penjumlahan = "+ Sum); /* Terminasi */
	}
}