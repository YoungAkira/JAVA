public class MyFrame extends JFrame implements ActionListener, AncestorListener {

    JButton button;

     MyFrame() {

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);

        
        this.setTitle("");
        this.setSize(400, 300); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(button); 
        this.setVisible(true); 
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Poo");
        }

    }

    @Override
    public void ancestorAdded(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorAdded'");
    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorRemoved'");
    }

    @Override
    public void ancestorMoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorMoved'");
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
