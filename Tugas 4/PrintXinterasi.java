/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Hari,Tanggal	: Rabu, 25 Maret 2020
	Waktu		: 15.41 WITA
*/

import java.util.Scanner;

public class PrintXinterasi {
	public static void main(String[] args) {
		int Sum=0;
		int x;
		Scanner masukan=new Scanner(System.in);
	/* Program */
		System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt(); /* First Elmt */
		if (x == 999){
			System.out.print ("Kasus kosong \n");
		}else{ /* MInimal ada satu data yang dijumlahkan */
			Sum = x; /* Inisialisasi; invariant !! */
			for (;;){
				System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
				x = masukan.nextInt(); /* Next Elmt */
				if(x==999)
					break;
				else{
					Sum = Sum + x; /* Proses */
				}
			}
		}
		System.out.println("Hasil penjumlahan = "+ Sum); /* Terminasi */
	}
}