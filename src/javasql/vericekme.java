package javasql;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class vericekme {

	
	
	public static void main(String[] args) {
		
		String veriler;
		try {
		
		Document doc = Jsoup.connect("https://dovizborsa.com/doviz/dolar").get();
		Element baslikElementi =doc.select("div.-w0 > p").first(); //div i�inde classifiedDetailTitle den h1 k�sm�n� cek	
		
			String baslik = baslikElementi.text();	
			String birim = doc.select("div.-w0 > h1").first().text();
			String fiyat = doc.select("div.-w1 > span").first().text();
			
			veriler = "INSERT INTO ogrenci (Ad,Soyad,Yas,Numara) VALUES ("+"'" +baslik+ "','" + birim + "'," + "" + fiyat + "," + fiyat + ")"; 
			// ilk veri taban� �zerine kay�t deniyorum veri taban� de�i�ince de�i�ecek


			System.out.println(veriler);
			baglanti.ekle(veriler);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
