package KullaniciIslemleri;


import BelgeTalebi.BelgeTalebiGönder;
import BelgeTalebi.BelgeTalep;

public class Main {

	public static void main(String[] args) {
		
		KullaniciAcilirMenu kullaniciAcilirMenu1 = new KullaniciAcilirMenu(); 
		kullaniciAcilirMenu1.setGelenMesajlar("Gelen Mesajlar");
		kullaniciAcilirMenu1.setGonderilenMesajlar("Gönderilen Mesajlar");
		kullaniciAcilirMenu1.setMesajEkle("Mesaj Ekle");
		kullaniciAcilirMenu1.setBelgeTalebi("Belge Talebi");
		kullaniciAcilirMenu1.setFotografGuncelle("Fotoðraf Güncelle");
		kullaniciAcilirMenu1.setSikSorulanSorular("S.S.S");
		
		KullaniciAcilirMenu[] kullaniciAcilirMenu = {kullaniciAcilirMenu1}; 
		
		for (KullaniciAcilirMenu kullaniciAcilirMenu2 : kullaniciAcilirMenu) {
			
			KullaniciButon kullaniciButon = new KullaniciButon();
			kullaniciButon.add(kullaniciAcilirMenu1);
	
			
			System.out.println("\n");
			System.out.println(kullaniciAcilirMenu1.getGelenMesajlar());
			System.out.println(kullaniciAcilirMenu1.getGonderilenMesajlar());
			System.out.println(kullaniciAcilirMenu1.getMesajEkle());
			System.out.println(kullaniciAcilirMenu1.getBelgeTalebi());
			System.out.println(kullaniciAcilirMenu1.getFotografGuncelle());
			System.out.println(kullaniciAcilirMenu1.getSikSorulanSorular());
			System.out.println("\n");
		}
		

		
		
	
	}

}