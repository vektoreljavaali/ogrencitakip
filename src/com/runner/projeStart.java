package com.runner;

import java.io.Console;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import com.islemler.anasayfa;
import com.islemler.ogrenci;

public class projeStart {

	public static void main(String[] args) throws IOException, URISyntaxException {
	
		anasayfa ansf = new anasayfa();
	    int secilen = ansf.secenekler();
		ogrenci ogr = new ogrenci();
	    
		switch (secilen) {
		case 1:	ogr.kaydet();break;
		case 2: break; //�cret �deme
		case 3: break; //ders atama
		case 4: break; //not giri�i
		case 5: break; //not listeleme
		case 6: break; //��renci listeleme
		default: break;
		}
	    
	   	    
		
		System.out.println("PROGRAM SONLANMI�TIR.");
	}// main metod sonu

}
