/*
AUTHOR: 
Nama	: Moh Fatkhur Rahman
Kelas	: TI-1B
NIM		: 4.33.22.1.15
*/

import java.util.Scanner;

public class jobsheet1{

	public static void main(String[] args) {
	Scanner inputan = new Scanner(System.in); 

	System.out.print("Masukkan tinggi badan anda (cm): ");
	int tinggiBadan = inputan.nextInt();

	System.out.println("");
	System.out.println("=====================================");
	System.out.println("Tinggi badan anda adalah: \t" + tinggiBadan + " cm");

	double beratBadanIdeal = (tinggiBadan - 100) - ((tinggiBadan - 100) * 10/100 );
	System.out.println("Berat badan ideal anda adalah: \t " + beratBadanIdeal + " kg");

	}
}

