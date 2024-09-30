public class MyFrame extends JFrame {

    MyFrame() {
        
        this.setTitle("Nightmare");
        this.setSize(420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("NightmareLogo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(102, 0, 102));

        this.setVisible(true);
    }
}
