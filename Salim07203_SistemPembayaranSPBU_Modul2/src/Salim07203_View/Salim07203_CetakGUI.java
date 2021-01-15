package Salim07203_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Salim07203_Controller.Salim07203_PenjualanController;
public class Salim07203_CetakGUI {
    JFrame cetak = new JFrame();
    JTable tableview= new JTable();
    JScrollPane scrollview = new JScrollPane(tableview);
    JButton back;
    JLabel title;
    public Salim07203_CetakGUI(){
        cetak.setSize(650, 500);
        cetak.getContentPane().setBackground(Color.green);
        cetak.setLayout(null);
        
        title = new JLabel("List Penjualan");
        title.setBounds(220, 30, 200, 30);
        title.setFont(new Font("Arial",Font.BOLD,28));
        cetak.add(title);
        
        scrollview.setBounds(30, 100, 570, 200);
        tableview.setModel(Salim07203_AllObjctController.penjualan.view());
        cetak.add(scrollview);
        
        back =new JButton("back");
        back.setBounds(50, 330, 80, 40);
        back.setBackground(Color.red);
        cetak.add(back);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Salim07203_GUI gui = new Salim07203_GUI();
            }
            
        });
        cetak.setVisible(true);
        cetak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cetak.setLocationRelativeTo(null);
    }
}
