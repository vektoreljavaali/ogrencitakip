package com.islemler;

import java.util.Scanner;

public class anasayfa {

	public int secenekler() {
	
	int islem;
		
	int don=0;
	do {
	System.out.println("********   ÖÐRENCÝ TAKÝP SÝSTEMÝ  ********");
	System.out.println();
	System.out.println("	[1]- Öðrenci Kayýt");
	System.out.println("	[2]- Öðrenci Ücret Ödeme");
	System.out.println("	[3]- Öðrenci Ders Atama");
	System.out.println("	[4]- Öðrenci Not Giriþi");
	System.out.println("	[5]- Öðrenci Notlarýný Listele");
	System.out.println("	[6]- Borlu Öðrenci Listele");

	Scanner sc = new Scanner(System.in);
	System.out.println("Bir Ýþlem Seçiniz.....: ");
	islem = sc.nextInt();
	don++;
	} while (islem<1 || islem>6);
	
	return islem;	
	}// seçenekler metosunun sonu.
	
	
}
