package MesajEkle;



public class Main {

	public static void main(String[] args) {
		
		MesajOlustur mesajOlustur1 = new MesajOlustur(); 
		mesajOlustur1.setKonu("Konu : Final Notlarý");
		mesajOlustur1.setDosyaKonum("Konum : C:/Users/DEMÝRYÜREK/Documents/NetBeansProjects/Anil/src");
		mesajOlustur1.setMesaj("Mesaj : Final notum beklediðim gibi gelmedi , kontrol edebilir misiniz ?");
		
		
		MesajOlustur[] mesajOlustur = {mesajOlustur1}; 
		
		for (MesajOlustur mesajOlustur2 : mesajOlustur) {
			
		
			System.out.println(mesajOlustur1.getKonu());
			System.out.println("\n");
			System.out.println(mesajOlustur1.getDosyaKonum());
			System.out.println("\n");
			System.out.println(mesajOlustur1.getMesaj());
			System.out.println("\n");
		}
		
		

	
		MesajGonderButon mesajGonderButon = new MesajGonderButon();
		mesajGonderButon.add(mesajOlustur1);
		
		
	}

}