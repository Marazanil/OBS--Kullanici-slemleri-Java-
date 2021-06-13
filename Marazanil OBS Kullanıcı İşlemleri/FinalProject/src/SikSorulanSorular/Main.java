package SikSorulanSorular;


public class Main {

	public static void main(String[] args) {
		
		GelenSorular gelenSorular1 = new GelenSorular(); 
		gelenSorular1.setGelenSorular("Soru 1 : Yemekhane Nerededir ?");
		gelenSorular1.setSoranAdSoyad("Ad Soyad : Ahmet Anýl DEMÝRYÜREK");
		gelenSorular1.setSoranBolum("Bölüm : Yazýlým Mühendisliði");
		gelenSorular1.setSoranKisiNumara(190290016);
		gelenSorular1.setSorduguTarih(12122019);
		gelenSorular1.setSoruCevabi("Bölüm : Teknoloji Fakültesi giriþinde kütüphane yanýnda ve mühendislik fakültesi kýz yurdu karþýsýnda olmak üzere 2 tane vardýr.");
		
		
		GelenSorular gelenSorular2 = new GelenSorular(); 
		gelenSorular2.setGelenSorular("Soru 1 : Lavabo Nerededir ?");
		gelenSorular2.setSoranAdSoyad("Ad Soyad : Mustafa Bedirhan ÝLÝK");
		gelenSorular2.setSoranBolum("Bölüm : Yazýlým Mühendisliði");
		gelenSorular2.setSoranKisiNumara(190290075);
		gelenSorular2.setSorduguTarih(12122019);
		gelenSorular2.setSoruCevabi("Bölüm : Her Fakültenin içinde kendine ait bir lavabosu vardýr.");
		
	
		GelenSorular[] gelenSorular = {gelenSorular1,gelenSorular2}; 
		
		for (GelenSorular gelenSorular3: gelenSorular) {
			System.out.println(gelenSorular3.getGelenSorular());
			System.out.println(gelenSorular3.getSoranAdSoyad());
			System.out.println(gelenSorular3.getSoranBolum());
			System.out.println(gelenSorular3.getSoranKisiNumara());
			System.out.println(gelenSorular3.getSorduguTarih());
			System.out.println(gelenSorular3.getSoruCevabi());
			System.out.println("\n");
		}
		
		SoruListele soruListele = new SoruListele();
		soruListele.add(gelenSorular1);
		
		
	}

}