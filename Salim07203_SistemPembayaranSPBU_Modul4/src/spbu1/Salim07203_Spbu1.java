package spbu1;


import Salim07203_View.Salim07203_GUI;
import Salim07203_Controller.Salim07203_PenjualanController;
import Salim07203_Controller.Salim07203_DataPembeliController;
import java.util.Scanner;


public class Salim07203_Spbu1 {
    private static Salim07203_DataPembeliController pembeli = new Salim07203_DataPembeliController();
    private static Salim07203_PenjualanController penjualan = new Salim07203_PenjualanController();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        PenjualanGUI g = new PenjualanGUI();
//        HapusGUI g=new HapusGUI();
        Salim07203_GUI g=new Salim07203_GUI();
    }
}
//        while(true){ 
//            System.out.println("Pilih menu : ");
//            System.out.println("1. Management Pembeli");
//            System.out.println("2. Input Pembelian");
//            System.out.println("3. Cetak Pembelian");
//            System.out.println("4. Selesai");
//            System.out.print("Masukkan Pilihan : ");
//            int pilmenu = input.nextInt();
//
//            if(pilmenu == 1){
//                listPembeli();
//                System.out.println("Pilih menu : ");
//                System.out.println("1. Tambah Pembeli");
//                System.out.println("2. Update Pembeli");
//                System.out.println("3. Delete Pembeli");
//                System.out.print("Masukkan Pilihan : ");
//                int pilsubmenu1 = input.nextInt();
//                if(pilsubmenu1 == 1){
//                    input.nextLine();
//                    System.out.print("Masukkan Nama : ");
//                    String nama = input.nextLine();
//                    System.out.print("Masukkan Plat Nomor : ");
//                    String plat = input.nextLine();
//
//                    Pembeli pembeli = new Pembeli();
//                    pembeli.setNama(nama);
//                    pembeli.setPlatnomer(plat);
//
//                    Spbu1.pembeli.add(pembeli);
//
//                }else if(pilsubmenu1 == 2){
//                    input.nextLine();
//                    System.out.print("Masukkan nomor yang mau di ganti: ");
//                    int index = input.nextInt();
//                    input.nextLine();
//                    System.out.print("Masukkan Nama : ");
//                    String nama = input.nextLine();
//                    System.out.print("Masukkan Plat Nomor : ");
//                    String plat = input.nextLine();
//
//                    Pembeli pembeli = new Pembeli();
//                    pembeli.setNama(nama);
//                    pembeli.setPlatnomer(plat);
//
//                    Spbu1.pembeli.update(pembeli, index-1);
//                }else if(pilsubmenu1 == 3){
//                    listPembeli();
//                    try{System.out.print("Masukkan nomor yang mau di hapus: ");
//                    int index = input.nextInt();
//                    
//                    pembeli.delete(index-1);
//                    }catch(Exception exception){
//                        System.out.println("Nomor yang anda masukkan salah");
//                    }
//                }
//            }else if(pilmenu == 2){
//                listPembeli();
//                System.out.print("Masukkan nomor Pembeli: ");
//                int pembeli = input.nextInt();
//                System.out.println("1. Pertalite (Rp. 6250): ");
//                System.out.println("2. Pertamax: (Rp. 9000)");
//                System.out.print("Masukkan Pilihan Bahan Bakar : ");
//                int bbm = input.nextInt();
//                System.out.print("Masukkan jumlah liter : ");
//                int jumlah = input.nextInt();
//                System.out.print("Masukkan uang bayar: ");
//                int uang = input.nextInt();
//                
//                if(bbm == 1){
//                    PenjualanEntity penjualan = new PenjualanEntity();
//                    penjualan.setPembeli(Spbu1.pembeli.getByIndex(pembeli-1));
//                    penjualan.setBbm(new PertaliteEntity());
//                    penjualan.setLiter(jumlah);
//                    penjualan.setUangBayar(uang);
//                    
//                    
//                    Spbu1.penjualan.add(penjualan);
//                }else if(bbm == 2){
//                    PenjualanEntity penjualan = new PenjualanEntity();
//                    penjualan.setPembeli(Spbu1.pembeli.getByIndex(pembeli-1));
//                    penjualan.setBbm(new PertamaxEntity());
//                    penjualan.setLiter(jumlah);
//                    penjualan.setUangBayar(uang);
//                    
//                    
//                    Spbu1.penjualan.add(penjualan);
//                }
//
//            }else if(pilmenu == 3){
//                for(PenjualanEntity p : penjualan.getAll()){
//                    System.out.println("=====================================");
//                    System.out.println("Nama        : " + p.getPembeli().getNama());
//                    System.out.println("Plat Nomer  : " + p.getPembeli().getPlatnomer());
//                    System.out.println("Bahan Bakar : " + p.getBbm().getBbm());
//                    System.out.println("Jumlah Liter: " + p.getLiter());
//                    System.out.println("Harga Total : " + p.getHargaTotal());
//                    System.out.println("Jumlah Uang : " + p.getUangBayar());
//                    System.out.println("Kembaliannya: " + p.getKembalian());
//                    System.out.println("=====================================");
//                }
//            }else if(pilmenu == 4){
//                break;
//            }
//            
//        }
//        
//        
//    }
//    
//    public static void listPembeli(){
//        System.out.println("Data Pembeli : ");
//        for(int i=0; i<pembeli.getAll().size();i++){
//            System.out.println((i+1)+".Nama : " + pembeli.getByIndex(i).getNama());
//            System.out.println("Plat Nomor : " + pembeli.getByIndex(i).getPlatnomer());
//        }
//    }
    

