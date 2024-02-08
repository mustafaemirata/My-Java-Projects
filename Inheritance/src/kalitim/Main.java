package kalitim;

public class Main {

	public static void main(String[] args) {
		employee emp1=new employee("Mustafa","Yazılım",1,40000);
		emp1.maasEkle(450000);
		emp1.showInfo();
		
		
		System.out.println("Yönetici Bilgileri");
		
		manager Manager1=new manager("Yönetici Eymen","İnsan Kaynakları",2,34500);
		Manager1.maasEkle(450);
		Manager1.showInfo();
	}

}
