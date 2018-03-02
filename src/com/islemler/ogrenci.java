package com.islemler;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class ogrenci {

	public void kaydet() throws IOException, URISyntaxException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Öðrenci Adýný giriniz........:");
		String ad = sc.nextLine();
		System.out.println("Öðrenci Soyadýný giriniz.....:");
		String soyad = sc.nextLine();
		System.out.println("Öðrenci Telefonunu giriniz...:");
		String telefon = sc.nextLine(); 
		System.out.println("Öðrenci Bakiye giriniz.......:");
		String bakiye = sc.nextLine();
		
		dosyaislemleri ds = new dosyaislemleri();
		ds.ogrencikaydet("VT0001"+":"+ad+":"+soyad+":"+telefon+":"+bakiye);
		
		
	}//kayýt metodunun sonu
	
}
