package GonderilenMesajlar;

public class Main {

	public static void main(String[] args) {
		
		GonderilenMesajlar gonderilenMesajlar1 = new GonderilenMesajlar(); 
		gonderilenMesajlar1.setDurumu("Durumu : Aktif Mesajlar");
		gonderilenMesajlar1.setTarihAraligi(12032020);
		gonderilenMesajlar1.setAliciTipi("Alýcý Tipi : Tümü");
		
		
		
		GonderilenMesajlar gonderilenMesajlar2 = new GonderilenMesajlar(); 
		gonderilenMesajlar2.setDurumu("Durumu : Silinen Mesajlar");
		gonderilenMesajlar2.setTarihAraligi(12112021);
		gonderilenMesajlar2.setAliciTipi("Alýcý Tipi : Danýþmana Gönderilen Mesajlar");
		
		
		
	
		GonderilenMesajlar[] gonderilenMesajlar = {gonderilenMesajlar1,gonderilenMesajlar2}; 
		
		for (GonderilenMesajlar gonderilenMesajlar3: gonderilenMesajlar) {
			System.out.println(gonderilenMesajlar3.getDurumu());
			System.out.println(gonderilenMesajlar3.getAliciTipi());
			System.out.println(gonderilenMesajlar3.getTarihAraligi());
			System.out.println("\n");
		}
		
		

	
		MesajListele mesajListele = new MesajListele();
		mesajListele.add(gonderilenMesajlar1);
		
		
	}

}