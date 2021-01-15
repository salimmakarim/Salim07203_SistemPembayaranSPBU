package Salim07203_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Salim07203_GUI {
    JFrame spbu=new JFrame();
    JLabel title;
    JButton inputdata,belibbm,cetak;
    
    public Salim07203_GUI(){
        spbu.setSize(700, 600);
        spbu.setLayout(null);
        spbu.getContentPane().setBackground(Color.red);
        
        title=new JLabel("Sistem Pembayaran SPBU");
        title.setBounds(110, 50, 600, 50);
        title.setFont(new Font("Arial",Font.BOLD,40));
        spbu.add(title);
        
        inputdata = new JButton("Input Data");
        inputdata.setBounds(270, 150, 150, 50);
        inputdata.setFont(new Font("Arial",Font.BOLD,20));
        inputdata.setBackground(Color.GREEN);
        spbu.add(inputdata);
        
        inputdata.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                    Salim07203_DataPembeliGUI daftar = new Salim07203_DataPembeliGUI();
            }
        });
        
        belibbm = new JButton("Beli BBM");
        belibbm.setBounds(270, 225, 150, 50);
        belibbm.setFont(new Font("Arial",Font.BOLD,20));
        belibbm.setBackground(Color.GREEN);
        spbu.add(belibbm);
        
        belibbm.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Salim07203_PenjualanGUI penjualan = new Salim07203_PenjualanGUI();
            }
        });
        cetak = new JButton("View");
        cetak.setBounds(270, 300, 150, 50);
        cetak.setFont(new Font("Arial",Font.BOLD,20));
        cetak.setBackground(Color.GREEN);
        spbu.add(cetak);
        
        cetak.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                spbu.dispose();
                Salim07203_CetakGUI cetak = new Salim07203_CetakGUI();
                
            }
        });
        spbu.setVisible(true);
        spbu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        spbu.setLocationRelativeTo(null);
    }
}
