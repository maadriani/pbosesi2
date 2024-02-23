public class buku {

     private String title;
     private String autor;
     private double price;
     private int nomorTerbit;

     public buku (String title,String autor,double price,int nomorTerbit){
        this.title = title;
        this.autor = autor;
        this.price = price;
        this.nomorTerbit = nomorTerbit;
     }
     public String getAutor(){
        return autor;
     }
     public String getTitle(){
        return title;
     }
     public double getPrice(){
        return price;
     }
     public int getNomorTerbit(){
        return nomorTerbit;
     }
     public static double hitungseluruhharga(buku[] Buku ){
        double seluruhHarga = 0;
        for (buku bukus: Buku){
            seluruhHarga += bukus.getPrice();
        }
        return seluruhHarga;
     }

     public static void main(String[] args) {
        buku novel = new buku("bidadari syurga pun cemburu", "KH.Adrian", 70.000, 7);
        buku cerpen = new buku("hujan", "mawar", 80.000, 1);
        buku komik = new buku("raja di kutuk", "erik", 50.000, 5);
        buku[] bukuBuku = {
            novel,cerpen,komik
        };
        double seluruhHarga = buku.hitungseluruhharga(bukuBuku);
        System.out.println("jumlah harga dari seluruh buku: Rp."+ seluruhHarga);
     }
}