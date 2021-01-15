package Salim07203_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Salim07203_HapusGUI {
    JFrame hapus = new JFrame();
    JLabel title,nomor;
    JButton back,delete;
    JTextField inputnomor;
    int index;
    public Salim07203_HapusGUI(){
        hapus.setSize(300, 300);
        hapus.setLayout(null);
        hapus.getContentPane().setBackground(Color.green);
        
        title = new JLabel("Delete");
        title.setBounds(90, 20, 250, 35);
        title.setFont(new Font("Arial",Font.BOLD,30));
        hapus.add(title);
        
        nomor = new JLabel("Nomor");
        nomor.setBounds(30, 70, 80, 40);
        nomor.setFont(new Font("Arial",Font.BOLD,20));
        hapus.add(nomor);
        
        inputnomor = new JTextField();
        inputnomor.setBounds(30, 110, 190, 25);
        hapus.add(inputnomor);
        
        back = new JButton("back");
        back.setBounds(30, 170, 80, 40);
        back.setBackground(Color.red);
        hapus.add(back);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Salim07203_DataPembeliGUI data = new Salim07203_DataPembeliGUI();
            }
        });
        delete = new JButton("delete");
        delete.setBounds(130, 170, 80, 40);
        delete.setBackground(Color.cyan);
        hapus.add(delete);
        delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                index = Integer.parseInt(inputnomor.getText());
                Salim07203_AllObjctController.pembeli.delete(index-1);
                JOptionPane.showMessageDialog(null, "Hapus Berhasil", "information", JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
        });
        
        hapus.setVisible(true);
        hapus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hapus.setLocationRelativeTo(null);
    }
    void kosong(){
        inputnomor.setText(null);
    }
}
