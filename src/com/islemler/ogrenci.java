package com.islemler;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class ogrenci {

	public void kaydet() throws IOException, URISyntaxException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��renci Ad�n� giriniz........:");
		String ad = sc.nextLine();
		System.out.println("��renci Soyad�n� giriniz.....:");
		String soyad = sc.nextLine();
		System.out.println("��renci Telefonunu giriniz...:");
		String telefon = sc.nextLine(); 
		System.out.println("��renci Bakiye giriniz.......:");
		String bakiye = sc.nextLine();
		
		dosyaislemleri ds = new dosyaislemleri();
		int sayac = ds.sayacoku();
		ds.ogrencikaydet("VT0"+sayac+":"+ad+":"+soyad+":"+telefon+":"+bakiye);
		
		
	}//kay�t metodunun sonu
	
}
