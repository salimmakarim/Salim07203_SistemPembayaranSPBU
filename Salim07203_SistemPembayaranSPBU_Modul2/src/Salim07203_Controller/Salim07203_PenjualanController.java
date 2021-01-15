package Salim07203_Controller;

import Salim07203_Entity.Salim07203_PenjualanEntity;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Salim07203_PenjualanController {
    public void add (Salim07203_PenjualanEntity penjualan ){
        Salim07203_AllObjectModels.penjual.add(penjualan);
    }
    public ArrayList<Salim07203_PenjualanEntity> getAll(){
        return Salim07203_AllObjectModels.penjual.getAll();
    }
    public DefaultTableModel view(){
        DefaultTableModel dtmview = new DefaultTableModel();
        Object[] kolom={"Nama","Platnomor","Bahan Bakar","Liter","Harga","Uang","Kembalian"};
        dtmview.setColumnIdentifiers(kolom);
        int size = Salim07203_AllObjectModels.penjual.getAll().size();
        for(int i=0;i<size;i++){
            Object[] data = new Object[7];
            data[0]= Salim07203_AllObjectModels.penjual.getAll().get(i).getPembeli().getNama();
            data[1]= Salim07203_AllObjectModels.penjual.getAll().get(i).getPembeli().getPlatnomer();
            data[2]= Salim07203_AllObjectModels.penjual.getAll().get(i).getBbm().getBbm();
            data[3]= Salim07203_AllObjectModels.penjual.getAll().get(i).getLiter();
            data[4]= Salim07203_AllObjectModels.penjual.getAll().get(i).getHargaTotal();
            data[5]= Salim07203_AllObjectModels.penjual.getAll().get(i).getUangBayar();
            data[6]= Salim07203_AllObjectModels.penjual.getAll().get(i).getKembalian();
            dtmview.addRow(data);
        }
        return dtmview;
    }
}
