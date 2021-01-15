package spbu;
import java.util.Scanner;


public class Salim07203_Spbu {
       static Scanner salim07203_input = new Scanner(System.in);

        
    
    public static void main(String[] args) {
        Salim07203_DataPembeli pembelian=new Salim07203_DataPembeli();
        int pil;
        do{
            System.out.println("Sstem Pembayaran SPBU");
        System.out.println("1.Beli Bensin");
        System.out.println("2.Cetak Struk");
        System.out.println("3.Hapus");
        System.out.println("4.Update");
        System.out.println("5.Exit");
        System.out.println("MAsukan Pilihan = ");
        pil=salim07203_input.nextInt();
        switch(pil){
            case 1:
                System.out.println("Masukkan Plat nomor Kendaraan = ");
                String salim07203_nomor=salim07203_input.next();
                System.out.println("Masukkan Nama = ");
                String salim07203_nama=salim07203_input.next();
                System.out.println("Beli Bensin = ");
                String salim07203_jenis=salim07203_input.next();
                System.out.println("Masukkan Jumlah Pembelian BEnsin = ");
                int salim07203_uangbeli=salim07203_input.nextInt();
                System.out.println("Masukkan Uang yang dibayarkan = ");
                int salim07203_uangbayar=salim07203_input.nextInt();
                
                pembelian.Salim07203_Belibensin(salim07203_nomor, salim07203_nama,salim07203_jenis, salim07203_uangbeli, salim07203_uangbayar);
                break;
            case 2:
                pembelian.cetak();
                break;
            case 3:
                System.out.println("Data plat nomor berapa yang akan dihapus =");
                String hapus=salim07203_input.next();
                pembelian.hapus(hapus);
                break;
            case 4:
                System.out.println("Data Plat Nomor berapa yang akan di update = ");
                String nomor=salim07203_input.next();
                System.out.println("Nama Baru = ");
                String namabaru=salim07203_input.next();
                pembelian.update(nomor, namabaru);
                break;
        }
    
    }while(pil!=5);
}
        }