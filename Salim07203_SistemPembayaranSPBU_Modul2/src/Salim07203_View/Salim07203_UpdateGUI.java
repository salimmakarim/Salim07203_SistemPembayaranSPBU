package Salim07203_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Salim07203_Entity.Salim07203_Pembeli;
public class Salim07203_UpdateGUI {
    JFrame update = new JFrame();
    JLabel title,namabaru,nomor,platnomor;
    JButton back,perbarui;
    JTextField inputnomor,inputnama,inputplat;
    Salim07203_Pembeli pembelian= new Salim07203_Pembeli();
    int index;
    public Salim07203_UpdateGUI(){
        update.setSize(300, 400);
        update.setLayout(null);
        update.getContentPane().setBackground(Color.green);
        
        title = new JLabel("Update");
        title.setBounds(90, 20, 250, 35);
        title.setFont(new Font("Arial",Font.BOLD,30));
        update.add(title);
        
        nomor = new JLabel("Nomor");
        nomor.setBounds(30, 70, 80, 40);
        nomor.setFont(new Font("Arial",Font.BOLD,20));
        update.add(nomor);
        
        inputnomor = new JTextField();
        inputnomor.setBounds(30, 110, 190, 25);
        update.add(inputnomor);
        
        namabaru = new JLabel("Nama");
        namabaru.setBounds(30, 140, 80, 40);
        namabaru.setFont(new Font("Arial",Font.BOLD,20));
        update.add(namabaru);
        
        inputnama = new JTextField();
        inputnama.setBounds(30, 170, 190, 25);
        update.add(inputnama);
        
        platnomor = new JLabel ("Plat Nomor");
        platnomor.setBounds(30, 200, 100, 50);
        platnomor.setFont(new Font("Arial",Font.BOLD,18));
        update.add(platnomor);
        
        inputplat = new JTextField();
        inputplat.setBounds(30, 240, 190, 25);
        update.add(inputplat);
        
        back = new JButton("back");
        back.setBounds(30, 290, 80, 40);
        back.setBackground(Color.red);
        update.add(back);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Salim07203_DataPembeliGUI data = new Salim07203_DataPembeliGUI();
            }
        });
        
        perbarui = new JButton("update");
        perbarui.setBounds(140, 290, 80, 40);
        perbarui.setBackground(Color.cyan);
        update.add(perbarui);
        perbarui.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                index = Integer.parseInt(inputnomor.getText());
                pembelian.setNama(inputnama.getText());
                pembelian.setPlatnomer(inputplat.getText());
                Salim07203_AllObjctController.pembeli.update(pembelian, index-1);
                JOptionPane.showMessageDialog(null, "Update Berhasil", "information", JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
        });
        
        update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        update.setLocationRelativeTo(null);
        update.setVisible(true);
        
    }
    void kosong(){
        inputnomor.setText(null);
        inputnama.setText(null);
        inputplat.setText(null);
    }
}
