package SikSorulanSorular;


public class Main {

	public static void main(String[] args) {
		
		GelenSorular gelenSorular1 = new GelenSorular(); 
		gelenSorular1.setGelenSorular("Soru 1 : Yemekhane Nerededir ?");
		gelenSorular1.setSoranAdSoyad("Ad Soyad : Ahmet An�l DEM�RY�REK");
		gelenSorular1.setSoranBolum("B�l�m : Yaz�l�m M�hendisli�i");
		gelenSorular1.setSoranKisiNumara(190290016);
		gelenSorular1.setSorduguTarih(12122019);
		gelenSorular1.setSoruCevabi("B�l�m : Teknoloji Fak�ltesi giri�inde k�t�phane yan�nda ve m�hendislik fak�ltesi k�z yurdu kar��s�nda olmak �zere 2 tane vard�r.");
		
		
		GelenSorular gelenSorular2 = new GelenSorular(); 
		gelenSorular2.setGelenSorular("Soru 1 : Lavabo Nerededir ?");
		gelenSorular2.setSoranAdSoyad("Ad Soyad : Mustafa Bedirhan �L�K");
		gelenSorular2.setSoranBolum("B�l�m : Yaz�l�m M�hendisli�i");
		gelenSorular2.setSoranKisiNumara(190290075);
		gelenSorular2.setSorduguTarih(12122019);
		gelenSorular2.setSoruCevabi("B�l�m : Her Fak�ltenin i�inde kendine ait bir lavabosu vard�r.");
		
	
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