package Salim07203_Entity;

public class  Salim07203_Pembeli {
    String nama,platnomer;

    public Salim07203_Pembeli(String nama, String platnomer) {
        this.nama = nama;
        this.platnomer = platnomer;
    }
    
    public Salim07203_Pembeli(){
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPlatnomer() {
        return platnomer;
    }

    public void setPlatnomer(String platnomer) {
        this.platnomer = platnomer;
    }
    
}
