package Salim07203_Entity;

public class Salim07203_PertaliteEntity implements Salim07203_BbmInterfaceEntity {
    private String Bbm;
    private int harga;

    public Salim07203_PertaliteEntity() {
        this.Bbm = "Pertalite";
        this.harga = 6250;
    }

    @Override
    public String getBbm() {
        return Bbm;
    }

    @Override
    public void setBbm(String Bbm) {
        this.Bbm=Bbm;
    }

    @Override
    public int getHarga() {
        return harga;
    }

    @Override
    public void setHarga(int harga) {
        this.harga=harga;
    }
  
}

