import javax.swing.*;

public class Main{

    public static void createFrame(){

        
        //JFrame - A GUI Window to add comments to
        
        JFrame frame = new JFrame();//creates a frame
        frame.setTitle("The Library at the end of Time");//sets title of a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setResizable(false);//Prevent Frame from being resized
        frame.setSize(690,690);//sets the x and y dimensions of the frame
        frame.setVisible(true);//makes the frame visible


        ImageIcon icon = new ImageIcon("icon.jpg");//creates a ImageIcon
        frame.setIconImage(icon.getImage());//changes the icon of frame

    }
    public static void main(String[] args) {
        
        createFrame();
    }
}