package FotografGuncelle;

public class Main {

	public static void main(String[] args) {
		
		FotografGuncelle fotografGuncelle1 = new FotografGuncelle(); 
		fotografGuncelle1.setBilgilendirme("Bilgilendirme : Talep edilen foto�raf vesikal�k t�r�nde olmal�d�r.\n"
				+ "Foto�raf Onay�, ba�l� bulundu�unuz B�l�m Sekreterli�i veya ��renci ��leri taraf�ndan yap�lmaktad�r.\n"
				+ "Ekleyece�iniz foto�raf resmi belgelerde kullan�laca��ndan uygun olmayan foto�raflar onaylanmayacakt�r.\\n"
				+ "  Not: Dosya format� \".JPG\" ve boyutu fazla 2MB olmal�d�r.");
		
		fotografGuncelle1.setMevcutImg("Mevcut Foto�raf : MevcutFotograf.img");
		fotografGuncelle1.setYeniImg("Yeni Foto�raf : YeniFotograf.img");
		
		
		
		
		
	
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