import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.event.*;


public class IssuetoSomeone implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton button = new JButton("OK");
    JLabel label = new JLabel();
    JLayeredPane layeredPane = new JLayeredPane();
    IssuetoSomeone(){
        label.setText("The Book is already issued to someone");
        label.setVisible(true);
        label.setBounds(10,50,300,50);

        button.setVisible(true);
        button.setBounds(50,150,200,50);
        button.addActionListener(this);

        layeredPane.add(label,Integer.valueOf(1));
        layeredPane.add(button);

        frame.setSize(350,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(layeredPane);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            frame.dispose();
        }
        
    }
}
