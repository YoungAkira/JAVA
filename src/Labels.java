import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;



public class Labels {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("ryuk.jpeg");
        Border border = BorderFactory.createLineBorder(Color.RED, 03);

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setFont(new Font("MV Boli",Font.PLAIN,40));
        label.setForeground(Color.RED);
        label.setIcon(image);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBackground(Color.BLACK);
        label.setBorder(border);
        label.setOpaque(true);
        label.setVisible(true);
        //label.setBounds(100, 100, 500, 600);


            
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(700,750);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}