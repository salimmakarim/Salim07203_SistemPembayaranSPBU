package Salim07203_Entity;

public class Salim07203_PertamaxEntity implements Salim07203_BbmInterfaceEntity {
    
    private String Bbm;
    private int harga;

    public Salim07203_PertamaxEntity() {
        this.Bbm = "Pertamax";
        this.harga = 9000;
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
