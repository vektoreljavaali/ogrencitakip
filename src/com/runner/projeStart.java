package com.runner;

import java.io.Console;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import com.islemler.anasayfa;
import com.islemler.ogrenci;

public class projeStart {

	public static void main(String[] args) throws IOException, URISyntaxException {
	
	//	anasayfa ansf = new anasayfa();
	   // int secilen = ansf.secenekler();
		
	    ogrenci ogr = new ogrenci();
	    ogr.kaydet();
	    
	    
		
		System.out.println("PROGRAM SONLANMIÞTIR.");
	}// main metod sonu

}
