package Salim07203_Model;

import Salim07203_Entity.Salim07203_Pembeli;
import Salim07203_Entity.Salim07203_PenjualanEntity;
import java.util.ArrayList;


public class Salim07203_Penjualan {
    private ArrayList<Salim07203_PenjualanEntity> penjualanArr = new ArrayList<>();
    
    public void add(Salim07203_PenjualanEntity penjualan){
        this.penjualanArr.add(penjualan);
    }
    
    public ArrayList<Salim07203_PenjualanEntity> getAll(){
        return this.penjualanArr;
    }
    
}

