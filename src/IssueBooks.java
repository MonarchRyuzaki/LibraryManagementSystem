import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IssueBooks extends Database implements ActionListener{
    
    JFrame frame = new JFrame("Add Book Info");
    JLabel bg;
    JLabel BookName;
    JLabel BookAuthor;
    JLabel Name;
    JTextField EnterBookName;
    JTextField EnterBookAuthor;
    JTextField EnterName;
    JButton submit;
    JLayeredPane layeredPane;

    ImageIcon image = new ImageIcon("addBooks.jpg");


    IssueBooks(){
        bg = new JLabel();
        bg.setIcon(image);
        bg.setBounds(0,0,420,420);

        BookName = new JLabel("Book Name : ");
        BookName.setFont(new Font("Comic Sans",Font.BOLD,20));
        BookName.setForeground(Color.GREEN);
        BookName.setBounds(50,100,200,20);
        BookName.setVisible(true);
    
        EnterBookName = new JTextField();
		EnterBookName.setFont(new Font("Comic Sans",Font.PLAIN,25));
		EnterBookName.setForeground(Color.BLACK);
		EnterBookName.setBackground(Color.WHITE);
		EnterBookName.setCaretColor(Color.BLACK);
        EnterBookName.setBounds(200,100,180,30);
        EnterBookName.setVisible(true);


        BookAuthor = new JLabel("Book Author: ");
        BookAuthor.setFont(new Font("Comic Sans",Font.BOLD,20));
        BookAuthor.setForeground(Color.GREEN);
        BookAuthor.setBounds(50,150,200,20);
        BookAuthor.setVisible(true);

        EnterBookAuthor = new JTextField();
		EnterBookAuthor.setFont(new Font("Comic Sans",Font.PLAIN,25));
		EnterBookAuthor.setForeground(Color.BLACK);
		EnterBookAuthor.setBackground(Color.WHITE);
		EnterBookAuthor.setCaretColor(Color.BLACK);
        EnterBookAuthor.setBounds(200,150,180,30);
        EnterBookAuthor.setVisible(true);

        Name = new JLabel("Your Name : ");
        Name.setFont(new Font("Comic Sans",Font.BOLD,20));
        Name.setForeground(Color.GREEN);
        Name.setBounds(50,200,200,20);
        Name.setVisible(true);
    
        EnterName = new JTextField();
		EnterName.setFont(new Font("Comic Sans",Font.PLAIN,25));
		EnterName.setForeground(Color.BLACK);
		EnterName.setBackground(Color.WHITE);
		EnterName.setCaretColor(Color.BLACK);
        EnterName.setBounds(200,200,180,30);
        EnterName.setVisible(true);

        submit = new JButton("Submit!");
        submit.setBounds(150, 250, 150, 50);
        submit.setFocusable(false);
        submit.setVisible(true);
        submit.addActionListener(this);
        

        layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,420,420);
        layeredPane.add(bg,Integer.valueOf(0));
        layeredPane.add(BookName,Integer.valueOf(1));
        layeredPane.add(EnterBookName,Integer.valueOf(1));
        layeredPane.add(BookAuthor,Integer.valueOf(1));
        layeredPane.add(EnterBookAuthor,Integer.valueOf(1));
        layeredPane.add(Name,Integer.valueOf(1));
        layeredPane.add(EnterName,Integer.valueOf(1));
        layeredPane.add(submit,Integer.valueOf(1));
        layeredPane.setVisible(true);


        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(layeredPane);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == submit){

            String bookname = EnterBookName.getText();
            String author = EnterBookAuthor.getText();
            String myname = EnterName.getText();
            Book.issueBooks(bookname,author,myname);
            frame.dispose();
        }
        
    }
}
