package Salim07203_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Salim07203_Entity.Salim07203_Pembeli;
public class Salim07203_DataPembeliGUI {
    JFrame data = new JFrame();
    JLabel title,nama,platnomor;
    JTextArea listpembeli;
    JTextField inputnama,inputplatnomor;
    JButton back,daftar,update,hapus;
    public Salim07203_DataPembeliGUI(){
        data.setSize(720, 600);
        data.setLayout(null);
        data.getContentPane().setBackground(Color.green);
        
        
        title = new JLabel("Daftar Pembeli");
        title.setBounds(90, 10, 200, 100);
        title.setFont(new Font("Arial",Font.BOLD,28));
        data.add(title);
        
        listpembeli= new JTextArea();
        listpembeli.setBounds(30, 100, 400, 300);
        data.add(listpembeli);
        listpembeli.setText(daftarPembeli());
        
        nama = new JLabel("Nama");
        nama.setBounds(450, 90, 230, 30);
        nama.setFont(new Font("Arial",Font.BOLD,20));
        data.add(nama);
        
        inputnama = new JTextField();
        inputnama.setBounds(450, 120, 220, 30);
        data.add(inputnama);
        
        platnomor = new JLabel("Plat Nomor");
        platnomor.setBounds(450, 150, 150, 25);
        platnomor.setFont(new Font("Arial",Font.BOLD,20));
        data.add(platnomor);
        
        inputplatnomor = new JTextField();
        inputplatnomor.setBounds(450, 180, 220, 30);
        data.add(inputplatnomor);
        
        back = new JButton("back");
        back.setBounds(50, 450, 80, 40);
        back.setBackground(Color.red);
        data.add(back);
        
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                 Salim07203_GUI gui= new Salim07203_GUI();
            }
        });
        daftar = new JButton("daftar");
        daftar.setBounds(450, 230, 80, 40);
        daftar.setBackground(Color.CYAN);
        data.add(daftar);
        daftar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Salim07203_AllObjctController.pembeli.add(new Salim07203_Pembeli(inputnama.getText(),inputplatnomor.getText()));
                JOptionPane.showMessageDialog(null, "Selamat Datang " +inputnama.getText(), "information",JOptionPane.INFORMATION_MESSAGE);
                listpembeli.setText(daftarPembeli());
                kosong();
            }
        });
        update = new JButton ("update");
        update.setBounds(200, 450, 80, 40);
        update.setBackground(Color.PINK);
        data.add(update);
        update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Salim07203_UpdateGUI update = new Salim07203_UpdateGUI();
            }
        });
        hapus = new JButton ("hapus");
        hapus.setBounds(350, 450, 80, 40);
        hapus.setBackground(Color.white);
        data.add(hapus);
        hapus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               Salim07203_HapusGUI hapus = new Salim07203_HapusGUI();
            }
            
        });
        data.setVisible(true);
        data.setLocationRelativeTo(null);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    String daftarPembeli(){
        for(int i=0; i<Salim07203_AllObjctController.pembeli.getAll().size();i++){
          String daftarpembeli1 = i+1 +  ".Nama : " + Salim07203_AllObjctController.pembeli.getByIndex(i).getNama() + 
                  "\n Plat Nomor : " + Salim07203_AllObjctController.pembeli.getByIndex(i).getPlatnomer();
          return daftarpembeli1;
        }
        return null;
    }
    void kosong(){
        inputnama.setText(null);
        inputplatnomor.setText(null);
    }
}
