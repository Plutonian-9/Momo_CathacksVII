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
  private int case_story = 0;
  
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
    button.setBounds(300,300,10,10);

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

    /*
    Create a switch statement of different the different paths
    Make button look pretty
    */

    /*Case statements with multiple paths for 3
    4
    5
    9
    11
    15
    21
    28
    29
    32
    36
    39
    43
    46
    */

    switch(case_story){
      case 0:
      //text is something
      case_story = 1;
      break;
      case 1:
      //Ummmmmmm
      case_story = 2;
      break;
      case 2:
      //filler
      case_story = 3;
      break;
      case 3:
      //if No case_story = 4; if yes case_story = 21;
      break;
      case 4:
      //if B case_story = 5; if A case_story = 22;
      break;
      case 5:
      //if no case_story = 6; if yes case_story = 23;
      break;
      case 6:
      case_story = 7;
      break;
      case 7:
      case_story = 8;
      break;
      case 8:
      case_story = 9;
      break;
      case 9:
      //if yes case_story=24 if no case_story = 10;
      break;
      case 10:
      case_story = 11;
      break;
    }

  }

  private class Clicklistener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e){
        text_label.setText(text[text_counter]);
        text_counter++;
    }
  }
}

