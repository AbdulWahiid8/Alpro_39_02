package ch02;

public class ObjectFakultas {
	public static void main(String[] args) {
		Fakultas fk1 = new Fakultas();
		Fakultas fk2 = new Fakultas();

		fk1.nama = "Sain dan Teknologi";
		fk1.jumlahMahasiswa = 2345;

		fk2.nama ="Psikologi";
		fk2.jumlahMahasiswa = 12012;

		System.out.println("Fakultas " + fk1.getNama() + ": " + fk1.getJumlahMahasiswa());
		System.out.println("Fakultas " + fk2.getNama() + ": " + fk2.getJumlahMahasiswa()); 
	}
}