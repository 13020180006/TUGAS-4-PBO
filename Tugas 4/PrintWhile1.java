/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Hari,Tanggal	: Rabu, 25 Maret 2020
	Waktu		: 15.39 WITA
*/

import java.util.Scanner;

public class PrintWhile1 {
	public static void main(String[] args) {
		int N;
		int i = 1;
		Scanner masukan=new Scanner(System.in);
	/* Program */
		System.out.print ("Nilai N >0 = ");
		N = masukan.nextInt(); System.out.print ("Print i dengan WHILE (ringkas): \n");
		while (i <= N){
			System.out.println (i++);
		} /* (i > N)*/
	}
}