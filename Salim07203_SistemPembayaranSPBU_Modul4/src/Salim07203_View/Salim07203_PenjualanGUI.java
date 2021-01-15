package Salim07203_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Salim07203_Entity.Salim07203_PenjualanEntity;
import Salim07203_Entity.Salim07203_PertaliteEntity;
import Salim07203_Entity.Salim07203_PertamaxEntity;

public class Salim07203_PenjualanGUI {
    JFrame penjualan = new JFrame();
    JLabel title,liter,uang,nomor;
    JTextField inputliter,inputuang,inputnomor;
    JRadioButton pertalite,pertamax;
    JButton beli,back;
    int index,literr,duit;
     Salim07203_PenjualanEntity penjualan1 = new Salim07203_PenjualanEntity();
   public Salim07203_PenjualanGUI(){
        penjualan.setSize(600, 700);
        penjualan.getContentPane().setBackground(Color.green);
        penjualan.setLayout(null);
        
        title = new JLabel("Pembelian BBM");
        title.setBounds(160, 50,250 , 40);
        title.setFont(new Font("Arial",Font.BOLD,30));
        penjualan.add(title);
        
        nomor = new JLabel("Nomor");
        nomor.setBounds(130, 100, 80, 40);
        nomor.setFont(new Font("Arial",Font.BOLD,20));
        penjualan.add(nomor);
        
        inputnomor = new JTextField();
        inputnomor.setBounds(130, 140, 220, 30);
        penjualan.add(inputnomor);
        
        pertalite = new JRadioButton("Pertalite Rp.6250");
        pertalite.setBounds(130, 180, 140, 70);
        pertalite.setBackground(Color.yellow);
        penjualan.add(pertalite);
        pertalite.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                index=Integer.parseInt( inputnomor.getText());
                    literr = Integer.parseInt(inputliter.getText());
                    duit = Integer.parseInt(inputuang.getText());
                if(pertalite.isSelected()){
                    pertamax.setSelected(false);
                    
                    
                    
                    penjualan1.setPembeli(Salim07203_AllObjctController.pembeli.getByIndex(index-1));
                    penjualan1.setBbm(new Salim07203_PertaliteEntity());
                    penjualan1.setLiter(literr);
                    penjualan1.setUangBayar(duit);
                }
            }
        });
        pertamax = new JRadioButton("Pertamax Rp.9000");
        pertamax.setBounds(300, 180, 140, 70);
        pertamax.setBackground(Color.yellow);
        penjualan.add(pertamax);
        pertamax.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(pertamax.isSelected()){
                    pertalite.setSelected(false);
                    index=Integer.parseInt(inputnomor.getText());
                    literr = Integer.parseInt(inputliter.getText());
                    duit = Integer.parseInt(inputuang.getText());
                    
                   
                    penjualan1.setPembeli(Salim07203_AllObjctController.pembeli.getByIndex(index-1));
                    penjualan1.setBbm(new Salim07203_PertamaxEntity());
                    penjualan1.setLiter(literr);
                    penjualan1.setUangBayar(duit);
                }
            }
                });
        liter = new JLabel("Liter");
        liter.setBounds(130, 240, 75, 50);
        liter.setFont(new Font("Arial",Font.BOLD,20));
        penjualan.add(liter);
        
        inputliter = new JTextField();
        inputliter.setBounds(130, 280, 220, 30);
        penjualan.add(inputliter);
        
        uang = new JLabel("Uang");
        uang.setBounds(130, 310, 75, 50);
        uang.setFont(new Font("Arial",Font.BOLD,20));
        penjualan.add(uang);
        
        inputuang = new JTextField();
        inputuang.setBounds(130, 350, 220, 30);
        penjualan.add(inputuang);
        
        beli = new JButton("beli");
        beli.setBounds(130, 400, 75, 50);
        beli.setBackground(Color.CYAN);
        penjualan.add(beli);
        beli.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Salim07203_AllObjctController.penjualan.add(penjualan1);
                JOptionPane.showMessageDialog(null, "Pembelian Berhasil", "information", JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
        });
        back = new JButton("back");
        back.setBounds(30,470,75,50);
        back.setBackground(Color.red);
        penjualan.add(back);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               Salim07203_GUI gui = new Salim07203_GUI(); 
            }
        });
        penjualan.setVisible(true);
        penjualan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        penjualan.setLocationRelativeTo(null);
    }
   void kosong(){
       inputliter.setText(null);
       inputuang.setText(null);
       inputnomor.setText(null);
   }
}
