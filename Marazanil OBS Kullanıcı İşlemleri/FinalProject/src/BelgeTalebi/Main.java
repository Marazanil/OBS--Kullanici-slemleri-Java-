package BelgeTalebi;



public class Main {

	public static void main(String[] args) {
		
		BelgeTalep belgeTalep1 = new BelgeTalep(); 
		belgeTalep1.setTalepEdenKurumAdi("Talep Eden Kurum Adý : E-Devlet");
		belgeTalep1.setTalepNedeni("Durumu : Silinen Mesajlar");
		belgeTalep1.setBelgeTürü("Talep Türü : Elektronik Ýmzalý");
		belgeTalep1.setBelgeTipi("Talep Tipi : Öðrenci Belgesi");
		
		
	
		
		
	
		BelgeTalep[] belgeTalep = {belgeTalep1}; 
		
		for (BelgeTalep belgeTalep2: belgeTalep) {
			System.out.println(belgeTalep2.getTalepEdenKurumAdi());
			System.out.println(belgeTalep2.getTalepNedeni());
			System.out.println(belgeTalep2.getBelgeTürü());
			System.out.println(belgeTalep2.getBelgeTipi());
			System.out.println("\n");
		}
		

		BelgeTalebiGönder belgeTalebiGönder = new BelgeTalebiGönder();
		belgeTalebiGönder.add(belgeTalep1);
		
		
	}

}