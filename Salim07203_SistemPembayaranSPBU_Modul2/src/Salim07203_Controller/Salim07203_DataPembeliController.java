package Salim07203_Controller;

import Salim07203_Entity.Salim07203_Pembeli;
import java.util.ArrayList;

public class Salim07203_DataPembeliController {
    public void add(Salim07203_Pembeli pembeli){
        Salim07203_AllObjectModels.pembeli.add(pembeli);
    }
    
    public void update(Salim07203_Pembeli pembeli,int index){
        Salim07203_AllObjectModels.pembeli.update(pembeli, index);
    }
    
    public void delete(int index){
        Salim07203_AllObjectModels.pembeli.delete(index);
    }
    
    public ArrayList<Salim07203_Pembeli> getAll(){
        return Salim07203_AllObjectModels.pembeli.getAll();
    }
    
    public Salim07203_Pembeli getByIndex(int index){
        return Salim07203_AllObjectModels.pembeli.getByIndex(index);
    }
    
}
