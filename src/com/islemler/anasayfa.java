package com.islemler;

import java.util.Scanner;

public class anasayfa {

	public int secenekler() {
	
	int islem;
		
	int don=0;
	do {
	System.out.println("********   ��RENC� TAK�P S�STEM�  ********");
	System.out.println();
	System.out.println("	[1]- ��renci Kay�t");
	System.out.println("	[2]- ��renci �cret �deme");
	System.out.println("	[3]- ��renci Ders Atama");
	System.out.println("	[4]- ��renci Not Giri�i");
	System.out.println("	[5]- ��renci Notlar�n� Listele");
	System.out.println("	[6]- Borlu ��renci Listele");

	Scanner sc = new Scanner(System.in);
	System.out.println("Bir ��lem Se�iniz.....: ");
	islem = sc.nextInt();
	don++;
	} while (islem<1 || islem>6);
	
	return islem;	
	}// se�enekler metosunun sonu.
	
	
}
