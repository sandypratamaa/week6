package pboo;

import <pboo>.*;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class tgspbo {
	    String nim;
	    String nama;
	    Double ipk;
	    int sks;
	    String tglLahir;//formatnya yyyy-mm-dd

	    public Mahasiswa(String nim, String nama, Double ipk, int sks, String tglLahir) {
			this.nim = nim;
			this.nama = nama;
			this.ipk = ipk;
			this.sks = sks;
			this.tglLahir = tglLahir;
	    
	    
	    public static void main(String[] args) {
		        // TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
	    int menu;	
	    
	    System.out.println("Mencari namaprodi, status , tahun angkatan, tagihan");
	    System.out.println("----------------------------------------------------------");
	    System.out.println();
	    System.out.println("pilih menu 1/2/3/4");
	    System.out.println("1. namaprodi ");
	    System.out.println("2. status ");
	    System.out.println("3. tahunangkatan ");
	    System.out.println("4. tagihan ");
	    System.out.println("inputkan menu yang akan dipilih : 1/2/3/4? ");
		menu = input.nextInt();	   
		if (menu == 1) { 
	       public String getProgdi(String progdi) {
	    	   System.out.println();
	    	   System.out.println("inputkan kode");
	    	   
		       if(progdi=="A11") {
			    ps = "Teknik Informatika";
		       }
		       else if(progdi=="A12") {
			      ps = "Sistem Informasi";
		       }
		       else if(progdi=="B11") {
			      ps = "Manajemen";
		       }
		       else if(progdi=="B12") {
			      ps = "Akuntansi";
		       }
		       else {
		          ps = "Belum terdaftar";
		       
		       System.out.println("inputkan nim ");
		       System.out.println();
		       
	   }
	   
	   if (menu == 2) {
		  System.out.println();
		  System.out.println("inputkan ipk");
	      public String ipkStatus() {
		       String stat="";
		
		  if 0 < ipk <=1 , maka stat  = "Perlu usaha lebih"
		  else if 1 < ipk <=2, maka stat  = "Perlu segera menaikkan IPK"
		  else if < ipk <=2.75, maka stat  = "Sedikit lagi"
		  else if 2.75 < ipk <= 3, maka stat = "Memuaskan"
		  else if 3 < ipk <= 3.5, maka stat  = "Sangat Memuaskan"
		  else if 3.5 < ipk <=4, maka stat  = "Dengan pujian"
		  else  > 4, maka stat  = "Range ipk di luar jalur" 
		 
				
		  return stat;
		  System.out.println("inputkan ipk");
		  System.out.println();
	      }
	    
	    if (menu == 3) {
	    System.out.println();
		System.out.println("input nim");	
	    
	    public int getTahun() {
		int angkatan;
		/**
		 * cari angkatan dari nim yang diinput
		 * misal A11.2000.00001, maka akan mengembalikan 2000
		 * 
		 */
		return angkatan;
	    }
	
	    public int getTagihanSks() {
	    	int perSks = 250000;
		
		/**
		 * cari berapa jumlah tagihan mahasiswa yang bersangkutan
		 * sks*perSks
		 */
		
		return tagihan;
		System.out.println("inputkan nim");
		System.out.println();
	    }
	    
	    if (menu == 4) {
	    System.out.println();
	    System.out.println("input sks");
	    public int getMhsSemester() {
		int smt = 0;
		Calendar kld = Calendar.getInstance();
		int thnSkr = kld.get(Calendar.YEAR);
		
		/**
		 * Hitung mahasiswa sudah berapa semester kuliah
		 */
		
		return smt;
	    }
	
	    private Date dateFormatter(String pola, String tanggal) {
		   Date tgl=null;
		   SimpleDateFormat formatter = new SimpleDateFormat(pola);
		
		   try {
			  tgl = formatter.parse(tanggal);
		   }
		   catch(ParseException e) {
			e.printStackTrace();
		   }
		   return tgl;
	    }
	
	    public String getUmur() {
	     	String umur = "";
		
		/**
		 * Hitung umur di sini
		 */
		
		return umur;	
		System.out.println("inputkan sks");
		System.out.println();
	    }

}
