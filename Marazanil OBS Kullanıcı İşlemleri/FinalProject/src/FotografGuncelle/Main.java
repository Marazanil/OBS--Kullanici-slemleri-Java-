package FotografGuncelle;

public class Main {

	public static void main(String[] args) {
		
		FotografGuncelle fotografGuncelle1 = new FotografGuncelle(); 
		fotografGuncelle1.setBilgilendirme("Bilgilendirme : Talep edilen fotoðraf vesikalýk türünde olmalýdýr.\n"
				+ "Fotoðraf Onayý, baðlý bulunduðunuz Bölüm Sekreterliði veya Öðrenci Ýþleri tarafýndan yapýlmaktadýr.\n"
				+ "Ekleyeceðiniz fotoðraf resmi belgelerde kullanýlacaðýndan uygun olmayan fotoðraflar onaylanmayacaktýr.\\n"
				+ "  Not: Dosya formatý \".JPG\" ve boyutu fazla 2MB olmalýdýr.");
		
		fotografGuncelle1.setMevcutImg("Mevcut Fotoðraf : MevcutFotograf.img");
		fotografGuncelle1.setYeniImg("Yeni Fotoðraf : YeniFotograf.img");
		
		
		
		
		
	
		FotografGuncelle[] fotografGuncelle = {fotografGuncelle1}; 
		
		for (FotografGuncelle fotografGuncelle2 : fotografGuncelle) {
			
		
			System.out.println(fotografGuncelle1.getBilgilendirme());
			System.out.println("\n");
			System.out.println(fotografGuncelle1.getMevcutImg());
			System.out.println("\n");
			System.out.println(fotografGuncelle1.getYeniImg());
			System.out.println("\n");
		}
		
		

	
		YukleButonu yukleButonu = new YukleButonu();
		yukleButonu.add(fotografGuncelle1);
		
		
	}

}