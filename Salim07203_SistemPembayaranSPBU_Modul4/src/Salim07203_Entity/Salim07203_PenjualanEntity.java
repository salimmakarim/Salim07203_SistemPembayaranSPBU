package Salim07203_Entity;
public class Salim07203_PenjualanEntity {
    private Salim07203_Pembeli pembeli;
    private Salim07203_BbmInterfaceEntity bbm;
    private int liter;
    private int uangBayar;
    
    
    public Salim07203_Pembeli getPembeli() {
        return pembeli;
    }

    public void setPembeli(Salim07203_Pembeli pembeli) {
        this.pembeli = pembeli;
    }
    public Salim07203_BbmInterfaceEntity getBbm() {
        return bbm;
    }
    public void setBbm(Salim07203_BbmInterfaceEntity bbm) {
        this.bbm = bbm;
    }
    public int getLiter() {
        return liter;
    }
    public void setLiter(int liter) {
        this.liter = liter;
    }
    public int getUangBayar() {
        return uangBayar;
    }
    public void setUangBayar(int uangBayar) {
        this.uangBayar = uangBayar;
    }    
    public int getKembalian(){
        int kembalian = 0;
        int hargaTotal = this.getHargaTotal();
        if(this.uangBayar<hargaTotal){
            System.out.println("Uang anda kurang !");
        }
        else{
         kembalian = this.uangBayar - hargaTotal;
        
    }    
        return kembalian;
    }
    public int getHargaTotal(){
        return this.bbm.getHarga() * this.liter;
    }
}
