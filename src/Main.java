import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Main{

    public static JLabel creatingTheBG(){

        // JLabel - a GUI Display for a String of text, Image or both
        JLabel label = new JLabel();//creates a label
        label.setText("Welcome to the Library of 10,000 Books");//adds text to the label
        ImageIcon image = new ImageIcon("library_bg.jpg");//creates image
        label.setIcon(image);//adds image to the label
        label.setHorizontalTextPosition(JLabel.CENTER);//sets Text at Left,Right,Centre
        label.setVerticalTextPosition(JLabel.TOP);//sets Text at Top,Bottom,Centre
        label.setForeground(Color.GREEN);//sets FontColor of Text
        label.setFont(new Font("MV Boli",Font.PLAIN,25));//set Font of Text
        label.setBackground(Color.BLACK);//Sets background Color
        label.setIconTextGap(-50);//Set gap of text to Image
        label.setOpaque(true);//displays Bg color
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within Label
        label.setHorizontalAlignment(JLabel.CENTER);//set Horizontal positon of icon+text within Label
        return label;
        
    }

    public static void createFrame(){
        JLabel label = creatingTheBG();
        //JFrame - A GUI Window to add comments to
        
        JFrame frame = new JFrame();//creates a frame
        frame.setTitle("The Library at the end of Time");//sets title of a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setResizable(false);//Prevent Frame from being resized
        //frame.setSize(1000,1000);//sets the x and y dimensions of the frame
        frame.setVisible(true);//makes the frame visible


        ImageIcon icon = new ImageIcon("icon.jpg");//creates a ImageIcon
        frame.setIconImage(icon.getImage());//changes the icon of frame
        frame.add(label);
        frame.pack();

    }
    public static void main(String[] args) {
        
        createFrame();
    }
}