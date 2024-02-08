package kalitim;

public class employee {
	private String isim;
	private String department;
	private int id;
	private static int toplam_maas=0;
	
	public employee(String ad, String bolum, int numara, int salary) {
		this.isim=ad;
		this.department=bolum;
		this.id=numara;
		this.toplam_maas=salary;
		
	}
	public void showInfo() {
		System.out.println("Bilgiler...");
		System.out.println("İsim: "+this.isim);
		System.out.println("Bölüm : "+this.department);
		System.out.println("Numara: "+this.id);
		System.out.println("Toplam Maaş: "+this.toplam_maas);


	}
	public static void maasEkle(int eklenecek_maas) {
		toplam_maas+=eklenecek_maas;
	}

}
