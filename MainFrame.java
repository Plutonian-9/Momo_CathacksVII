/*
Project:
Contributers: 

*/

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DimensionUIResource;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;

public class MainFrame extends JFrame {
 
  public static void main(String[] args) {
    MainFrame window = new MainFrame();
  }

  private JPanel gameWindow = new JPanel();
  private JPanel textPanel = new JPanel();
  private String text[] = new String[60];
  private JLabel text_label = new JLabel("Hello");
  private int text_counter = 1;
  private JButton button = new JButton("Button 1");
  
  public MainFrame() {

    //----------------------game Window------------------------
    gameWindow.setBackground(Color.BLACK);
    gameWindow.setBorder(new EmptyBorder(10,10,10,10));
    gameWindow.setPreferredSize(new Dimension(800,500));


    //----------------------Text Panel------------------------
    textPanel.setBackground(Color.LIGHT_GRAY);
    textPanel.setBorder(new EmptyBorder(10,10,10,10));
    textPanel.setPreferredSize(new Dimension(800,250));
    text_label.setForeground(Color.BLACK);
    text_label.setOpaque(true);
    text_label.setBackground(Color.LIGHT_GRAY);
    
    //-----------------------Button------------------------------
    button.setMinimumSize(new Dimension(400, 200));
    button.addActionListener(new Clicklistener());

    ////----------------------Main Window------------------------
    this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
    this.add(gameWindow);
    this.add(textPanel);
    textPanel.add(text_label);
    textPanel.add(button);
    this.setTitle("MoMo");
    this.setSize(800, 800);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setVisible(true);

    //--------------------Game Text Responses---------------------
    text[0] = "Welcome!";
    text[1] = "This is Mariam";
    text[2] = "Mariam works at the library and is currently on her way to the library";
    text[3] = ">I'm just testing";
    
  }

  private class Clicklistener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e){
        text_label.setText(text[text_counter]);
        text_counter++;
    }
  }
}

