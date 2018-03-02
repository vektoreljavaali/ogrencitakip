package com.islemler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class dosyaislemleri {

	public String yeriver() throws URISyntaxException {
		File fl = new File(dosyaislemleri.class.getProtectionDomain().
				getCodeSource().getLocation().toURI().getPath());
		return fl.getAbsolutePath();		
	}	
	
	public void ogrencikaydet(String icerik) throws IOException, URISyntaxException {
		File ds = new File(yeriver()+"/com/dbdosyalari/ogrenci.txt");
		BufferedWriter bf = new BufferedWriter(new FileWriter(ds, true));
		bf.write(icerik);
		bf.newLine();
		bf.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}



