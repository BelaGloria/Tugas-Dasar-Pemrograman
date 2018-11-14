class Perpustakaan{
	private String Judul;	
	private String Penerbit;
	private String Penulis;
	private int Tahun;


	public Perpustakaan(String Jdl, String Pnbt, String Pnls, int Thn){
	this.Judul=Jdl;
	this.Penerbit=Pnbt;
	this.Penulis=Pnls;
	this.Tahun=Thn;
	}
	    
	public void IsibukuPerpustakaan()
       	{
	System.out.println(" Buku yang Tersedia ");
	System.out.println(" Judul Buku : "+this.Judul);
	System.out.println(" Penerbit Buku : "+this.Penerbit);
	System.out.println(" Penulis Buku : "+this.Penulis);
	System.out.println(" Tahun Buku : "+this.Tahun+" diterbitkan");
          	 }
        
	}
	public class BukuPerpustakaan{
	public static void main(String args []) {
	Perpustakaan Perpus = new Perpustakaan ( "Pemrograman Java","ANDI Yogyakarta","Rijaul Fikri , dkk",2005);
	Perpus.IsibukuPerpustakaan();
	   }
	}
