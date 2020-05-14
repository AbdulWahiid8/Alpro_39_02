package ch02;

import java.util.Date;

public class ObjectProduk {
	public static void main(String[] args) {
		
		Produk x1 = new Produk();
		x1.barcode = "212327637377812";
		x1.nama = "Minyak Sanco";
		x1.tanggalKadaluarsa = new Date(2022,10,20);
		x1.harga = 18000;

		Produk x2 = new Produk();
		x2.barcode = "515152367881268";
		x2.nama = "Susu Frisian Flag";
		x2.tanggalKadaluarsa = new Date(2021,11,06);
		x2.harga = 11000;

		System.out.println(x1.nama + " (" + x1.barcode + ")");
		System.out.println("Harga : Rp " + x1.harga);
		System.out.println(" Exp : " + x1.tanggalKadaluarsa.toString());

		System.out.println("===============================");		

		System.out.println(x2.nama + " (" + x2.barcode + ")");
		System.out.println("Harga : Rp " + x2.harga);
		System.out.println(" Exp : " + x2.tanggalKadaluarsa.toString());		
	}
}