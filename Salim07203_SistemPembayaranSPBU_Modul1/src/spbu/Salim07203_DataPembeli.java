package spbu;
import java.util.ArrayList;

public class Salim07203_DataPembeli {
    private ArrayList <Salim07203_Bensin> datapembeli=new ArrayList();
    
    public void Salim07203_Belibensin(String salim07203_nomor,String salim07203_nama,String salim07203_jenis,int salim07203_uang1,int salim07203_uang2 ){
        datapembeli.add(new Salim07203_Bensin(salim07203_nomor, salim07203_nama, salim07203_jenis, salim07203_uang1, salim07203_uang2));
    }
    public void cetak(){
        int kembali=0;
        for (int i = 0; i < datapembeli.size(); i++) {
            kembali=datapembeli.get(i).salim07203_uangbayar-datapembeli.get(i).salim07203_uangbeli;
            if(datapembeli.get(i).salim07203_uangbeli>datapembeli.get(i).salim07203_uangbayar){
                System.out.println("Uang anda Kurang");
            }
            else{
            System.out.println("------------------------");
            System.out.println("Struk Pembelian Bensin ");
            System.out.println("Plat Nomor Kendaraan = "+datapembeli.get(i).salim07203_platnomor);
            System.out.println("Nama Pembeli         = "+datapembeli.get(i).salim07203_nama);
            System.out.println("Total Pembelian      = "+datapembeli.get(i).salim07203_uangbeli);
            System.out.println("Uang yang diberikan  = "+datapembeli.get(i).salim07203_uangbayar);
            System.out.println("Kembali              = "+kembali);
            System.out.println("------------------------");
        }
    }
    }
    private int carinomor(String salim07203_nomor){
        int indeks=-1;
        for (int i = 0; i <datapembeli.size(); i++) {
           if(salim07203_nomor.equals(datapembeli.get(i).salim07203_platnomor))
            indeks=i;
        }
        return indeks;
    }
    public void hapus(String salim07203_nomor){
        datapembeli.remove(carinomor(salim07203_nomor));
    }
    public void update(String salim07203_nomor,String salim07203_namabaru){
        if(carinomor(salim07203_nomor)!=-1){
            datapembeli.get(carinomor(salim07203_nomor)).salim07203_nama=salim07203_namabaru;
        }
        else{
            System.out.println("Nomor tidak dapat ditemukan");
        }
    }
}
