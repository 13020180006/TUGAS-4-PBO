/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Hari,Tanggal	: Rabu, 25 Maret 2020
	Waktu		: 15.14 WITA
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

public class BacaString {
	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
	/* Program */
		System.out.print ("\nBaca string dan Integer: \n");
		System.out.print("masukkan sebuah string: ");
		str= datAIn.readLine();
		System.out.print ("String yang dibaca : "+ str);
	}
}