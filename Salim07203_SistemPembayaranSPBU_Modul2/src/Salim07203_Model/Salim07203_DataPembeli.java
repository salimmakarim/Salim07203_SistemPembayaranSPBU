
package Salim07203_Model;

import Salim07203_Entity.Salim07203_Pembeli;
import java.util.ArrayList;


public class Salim07203_DataPembeli {
    private ArrayList<Salim07203_Pembeli> pembeliArr = new ArrayList<>();
    
    public void add(Salim07203_Pembeli pembeli){
        this.pembeliArr.add(pembeli);
    }
    
    public void update(Salim07203_Pembeli pembeli, int index){
        this.pembeliArr.set(index, pembeli);
    }
    
    public void delete(int index){
        this.pembeliArr.remove(index);
    }
    
    public ArrayList<Salim07203_Pembeli> getAll(){
        return this.pembeliArr;
    }
    
    public Salim07203_Pembeli getByIndex(int index){
        return this.pembeliArr.get(index);
    }
}
