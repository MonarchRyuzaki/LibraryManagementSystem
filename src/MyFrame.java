import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{ 

    JLabel label;
    JLayeredPane layeredPane;
    JButton button1;
    JButton button2;
    JButton button3;
    
    MyFrame(){
        // JLabel - a GUI Display for a String of text, Image or both
        label = new JLabel();//creates a label
        label.setText("Welcome to the Library of 10,000 Books");//adds text to the label
        ImageIcon image = new ImageIcon("library_bg.jpg");//creates image
        label.setIcon(image);//adds image to the label
        label.setOpaque(true);//displays Bg color
        label.setHorizontalTextPosition(JLabel.CENTER);//sets Text at Left,Right,Centre
        label.setVerticalTextPosition(JLabel.TOP);//sets Text at Top,Bottom,Centre
        label.setForeground(Color.GREEN);//sets FontColor of Text
        label.setFont(new Font("Comic Sans",Font.PLAIN,25));//set Font of Text
        label.setBackground(Color.BLACK);//Sets background Color
        label.setIconTextGap(-50);//Set gap of text to Image
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within Label
        label.setHorizontalAlignment(JLabel.CENTER);//set Horizontal positon of icon+text within Label
        label.setBounds(0,0,800,600);
        label.setVisible(true);

        button1 = new JButton("Add Books");
        button1.setBounds(50, 250, 150, 100);
        button1.setFocusable(false);
        button1.addActionListener(this);
        button2 = new JButton("Issue Books");
        button2.setBounds(250, 250, 150,100 );
        button2.setFocusable(false);
        button2.addActionListener(this);
        //button3 = new JButton("Return Issued Books");
        //button3.setFocusable(false);
        //button3.setBounds(450, 250, 250,100 );
        layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,800,600);
        layeredPane.add(label,Integer.valueOf(0));
        layeredPane.add(button1 , Integer.valueOf(1));
        layeredPane.add(button2,Integer.valueOf(1));
        //layeredPane.add(button3,Integer.valueOf(1));
        layeredPane.setVisible(true);

        //JFrame - A GUI Window to add components to
        this.setTitle("The Library at the end of Time");//sets title of a frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        this.setResizable(false);//Prevent Frame from being resized
        this.setVisible(true);//makes the frame visible
        this.setSize(800,600);//sets the x and y dimensions of the frame

        ImageIcon icon = new ImageIcon("icon.jpg");//creates a ImageIcon
        this.setIconImage(icon.getImage());//changes the icon of frame
        this.add(layeredPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1){

            new BookAdd();
        }

        if (e.getSource() == button2){

            new IssueBooks();
        }
        
    }


}