package GelenMesajlar;

public class Main {

	public static void main(String[] args) {
		
		GelenMesajlar gelenMesajlar1 = new GelenMesajlar(); 
		gelenMesajlar1.setDurumu("Durumu : Okunan Mesaj");
		gelenMesajlar1.setTarihAraligi(25062020);
		gelenMesajlar1.setGondericiTipi("G�derici Tipi : Dan��man");
		
		
		
		GelenMesajlar gelenMesajlar2 = new GelenMesajlar(); 
		gelenMesajlar2.setDurumu("Durumu : T�m�");
		gelenMesajlar2.setTarihAraligi(11052021);
		gelenMesajlar2.setGondericiTipi("G�nderici Tipi : T�m�");
		
		
		
	
		GelenMesajlar[] gelenMesajlar = {gelenMesajlar1,gelenMesajlar2}; 
		
		for (GelenMesajlar gelenMesajlar3: gelenMesajlar) {
			System.out.println(gelenMesajlar3.getGondericiTipi());
			System.out.println(gelenMesajlar3.getDurumu());
			System.out.println(gelenMesajlar3.getTarihAraligi());
			System.out.println("\n");
			
		}
		
		MesajListele mesajListele = new MesajListele();
		mesajListele.add(gelenMesajlar1);
		
	}

}




