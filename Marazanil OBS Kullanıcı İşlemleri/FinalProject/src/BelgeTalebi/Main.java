package BelgeTalebi;



public class Main {

	public static void main(String[] args) {
		
		BelgeTalep belgeTalep1 = new BelgeTalep(); 
		belgeTalep1.setTalepEdenKurumAdi("Talep Eden Kurum Ad� : E-Devlet");
		belgeTalep1.setTalepNedeni("Durumu : Silinen Mesajlar");
		belgeTalep1.setBelgeT�r�("Talep T�r� : Elektronik �mzal�");
		belgeTalep1.setBelgeTipi("Talep Tipi : ��renci Belgesi");
		
		
	
		
		
	
		BelgeTalep[] belgeTalep = {belgeTalep1}; 
		
		for (BelgeTalep belgeTalep2: belgeTalep) {
			System.out.println(belgeTalep2.getTalepEdenKurumAdi());
			System.out.println(belgeTalep2.getTalepNedeni());
			System.out.println(belgeTalep2.getBelgeT�r�());
			System.out.println(belgeTalep2.getBelgeTipi());
			System.out.println("\n");
		}
		

		BelgeTalebiG�nder belgeTalebiG�nder = new BelgeTalebiG�nder();
		belgeTalebiG�nder.add(belgeTalep1);
		
		
	}

}