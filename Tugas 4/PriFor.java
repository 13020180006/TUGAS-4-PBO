/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Hari,Tanggal	: Rabu, 25 Maret 2020
	Waktu		: 15.33 WITA
*/

import java.util.Scanner;

public class PriFor {
	public static void main(String[] args) {
	
		int i,N;
		Scanner masukan=new Scanner(System.in);
	/* Program */
		
		System.out.print ("Baca N, print 1 s/d N "); 
		System.out.print ("N = ");
		N=masukan.nextInt();
		for (i = 1; i <= N; i++){
			System.out.println (i); 
		};
		System.out.println ("Akhir program \n");
	}
}