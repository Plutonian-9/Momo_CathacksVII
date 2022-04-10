/*
Project:
Contributers: 

*/

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
 
  public static void main(String[] args) {
    MainFrame window = new MainFrame();
  }

  private JPanel gameWindow = new JPanel();
  private JPanel textPanel = new JPanel();
  private JButton test = new JButton();
  private StoryFrame[] plotPoints = new StoryFrame[50];
  private int case_story = 0;
  private String text[] = new String[60];
  private JLabel text_label = new JLabel("Hello");
  private JButton button = new JButton("Continue");
  private JButton buttonY = new JButton("Yes");
  private JButton buttonN = new JButton("No");
  private JButton buttonA = new JButton("A");
  private JButton buttonB = new JButton("B");
  private JButton buttonC = new JButton("C");
  private JButton buttonD = new JButton("D");
  private int endOfPath = 0;
  
  public MainFrame() {
    fillPlotPoints();
    //----------------------game Window------------------------
    gameWindow.setBackground(Color.BLACK);
    gameWindow.setBorder(new EmptyBorder(10,10,10,10));
    gameWindow.setPreferredSize(new Dimension(800,500));
    test.addActionListener(new ButtonActionListener());

    //----------------------Text Panel------------------------
    textPanel.setBackground(Color.LIGHT_GRAY);
    textPanel.setBorder(new EmptyBorder(10,10,10,10));
    textPanel.setPreferredSize(new Dimension(800,250));
    text_label.setForeground(Color.BLACK);
    text_label.setOpaque(true);
    text_label.setBackground(Color.LIGHT_GRAY);

        //-----------------------Buttons----------------------------
    //Text scrolling button
    button.setMinimumSize(new Dimension(400, 200));
    button.addActionListener(Clicklistener());
    button.setBounds(300,300,10,10);

    //Button option "Yes"
    buttonY.setMinimumSize(new Dimension(400, 200));
    buttonY.addActionListener(new Clicklistener());
    buttonY.setBounds(300,300,10,10);
    buttonY.setVisible(false);

    //Button option "No"
    buttonN.setMinimumSize(new Dimension(400, 200));
    buttonN.addActionListener(new Clicklistener());
    buttonN.setBounds(300,300,10,10);
    buttonN.setVisible(false);

    //Button option "A"
    buttonA.setMinimumSize(new Dimension(400, 200));
    buttonA.addActionListener(new Clicklistener());
    buttonA.setBounds(300,300,10,10);
    buttonA.setVisible(false);

    //Button option "B"
    buttonB.setMinimumSize(new Dimension(400, 200));
    buttonB.addActionListener(new Clicklistener());
    buttonB.setBounds(300,300,10,10);
    buttonB.setVisible(false);

    //Button option "C"
    buttonC.setMinimumSize(new Dimension(400, 200));
    buttonC.addActionListener(new Clicklistener());
    buttonC.setBounds(300,300,10,10);
    buttonC.setVisible(false);

    //Button option "D"
    buttonD.setMinimumSize(new Dimension(400, 200));
    buttonD.addActionListener(new Clicklistener());
    buttonD.setBounds(300,300,10,10);
    buttonD.setVisible(false);


    ////----------------------Main Window------------------------
    this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
    this.add(gameWindow);
    this.add(textPanel);
    textPanel.add(text_label);
    textPanel.add(button);
    textPanel.add(buttonY);
    textPanel.add(buttonN);
    textPanel.add(buttonA);
    textPanel.add(buttonB);
    textPanel.add(buttonC);
    textPanel.add(buttonD);
    this.setTitle("MoMo");
    this.setSize(800, 800);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setVisible(true);

  //--------------------Game Text Responses---------------------
  //Heres how I was personally tracking the text responses. I'm adding it back in case it's needed but if not it can easily be removed
  //text 0 is a place holder for now.
  text[0] = "Welcome!";
  text[1] = "Marian the librarian is a creature of habit. Every day she steps into her office at exactly 8:13 a.m., with her lunch, two folders, and a notebook in her messenger bag. Officially, she starts work at 8:15, but it is her sincerely held ";
  text[2] = "Mariam works at the library and is currently on her way to the library";

  }
  
  
  //this is stupid
  private class ButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

      
    }
  }



  public void fillPlotPoints() {
    // title screen
    plotPoints[0] = new StoryFrame("library.png", "Marian the Librarian: A Choose-Your-Own Adventure Game", "", {}, 0, 2, {}, 0, 1);
    @Override
    public void actionPerformed(ActionEvent e){
      while(endOfPath != 1){
        if(e.getSource() == button){
            switch(case_story){
            case 0:
            text_label.setText(text[case_story]);
            case_story = 1;
            break;
            case 1:
            text_label.setText(text[case_story]);
            case_story = 2;
            break;
            case 2:
            text_label.setText(text[case_story]);
            case_story = 3;
            break;
            case 3:
            text_label.setText(text[case_story]);
            //2 buttons
            button.setVisible(false);
            buttonY.setVisible(true);
            buttonN.setVisible(true);
            //if No (button 2)case_story = 4; if (button 3) yes case_story = 21;
            break;
            case 4:
            buttonY.setVisible(false);
            buttonN.setVisible(false);
            text_label.setText(text[case_story]);
            buttonA.setVisible(true);
            buttonB.setVisible(true);
            //if B case_story = 5; if A case_story = 22;
            break;
            case 5:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            case_story = 6;
            break;
            case 6:
            text_label.setText(text[case_story]);
            case_story = 7;
            break;
            case 7:
            text_label.setText(text[case_story]);
            case_story = 8;
            break;
            case 8:
            text_label.setText(text[case_story]);
            case_story = 9;
            break;
            case 9:
            button.setVisible(false);
            buttonY.setVisible(true);
            buttonN.setVisible(true);
            text_label.setText(text[case_story]);
            //if yes case_story=24 if no case_story = 10;
            break;
            case 10:
            buttonY.setVisible(false);
            buttonN.setVisible(false);
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            case_story = 11;
            break;
            case 11:
            button.setVisible(false);
            buttonA.setVisible(true);
            buttonB.setVisible(true);
            buttonC.setVisible(true);
            buttonD.setVisible(true);
            text_label.setText(text[case_story]);
            //11 if A||B case_story = 25; if C case_story = 26; if D case_story = 12;
            break;
            case 12:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            buttonC.setVisible(false);
            buttonD.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            case_story = 13;
            break;
            case 13:
            text_label.setText(text[case_story]);
            case_story = 14;
            break;
            case 14:
            text_label.setText(text[case_story]);
            case_story = 15;
            break;
            case 15:
            button.setVisible(false);
            buttonA.setVisible(true);
            buttonB.setVisible(true);
            text_label.setText(text[case_story]);
            // 15 if A; if B case_story = 16; - NEEDS TO BE CHANGED
            break;
            case 16:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            case_story = 17;
            break;
            case 17:
            text_label.setText(text[case_story]);
            case_story = 18;
            break;
            case 18:
            text_label.setText(text[case_story]);
            case_story = 19;
            break;
            case 19:
            text_label.setText(text[case_story]);
            case_story = 20;
            break;
            case 20:
            text_label.setText(text[case_story]);
            endOfPath = 1;
            //No path yet
            break;
            case 21:
            button.setVisible(true);
            buttonY.setVisible(false);
            buttonN.setVisible(false);
            text_label.setText(text[case_story]);
            //case_story = 28;
            break;
            case 22:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            case_story = 35;
            break;
            case 23:
            text_label.setText(text[case_story]);
            //no path yet. DOESN'T EXIST
            break;
            case 24:
            buttonY.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            case_story = 10;
            break;
            case 25:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            buttonC.setVisible(false);
            buttonD.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            //nothing yet
            break;
            case 26:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            buttonC.setVisible(false);
            buttonD.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            //nothing yet
            break;
            case 28:
            text_label.setText(text[case_story]);
            case_story = 4;
            break;
            case 29:
            button.setVisible(false);
            buttonA.setVisible(true);
            buttonB.setVisible(true);
            text_label.setText(text[case_story]);
            //29 if A case_story = 30; if B case_story = 10;
            break;
            case 30:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            case_story = 32;
            break;
            case 32:
            button.setVisible(false);
            buttonA.setVisible(true);
            buttonB.setVisible(true);
            text_label.setText(text[case_story]);
            //32 if A case_story = 11; if B case_story = 34; UPDATE A TO 11
            break;
            case 34:
            button.setVisible(false);
            buttonC.setVisible(true);
            buttonD.setVisible(true);
            text_label.setText(text[case_story]);
            //BUTTONS A,B,C,D ALL NEED TO BE ADDED.
            break;
            case 35:
            text_label.setText(text[case_story]);
            case_story = 29;
            break;
            case 36:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            buttonC.setVisible(false);
            buttonD.setVisible(false);
            buttonY.setVisible(true);
            buttonN.setVisible(true);
            text_label.setText(text[case_story]);
            //36 if Yes case_story = 37; if no case_story = 38;
            break;
            case 37:
            buttonY.setVisible(false);
            buttonN.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            break;
            case 38:
            buttonY.setVisible(false);
            buttonN.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            case_story = 39;
            break;
            case 39:
            button.setVisible(false);
            buttonA.setVisible(true);
            buttonB.setVisible(true);
            buttonC.setVisible(true);
            buttonD.setVisible(true);
            text_label.setText(text[case_story]);
            // 39 if A||B case_story = 40; if C case_story = 41; if D case_story = 42;
            break;
            case 40:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            buttonC.setVisible(false);
            buttonD.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            case_story = 43;
            break;
            case 41:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            buttonC.setVisible(false);
            buttonD.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            case_story = 43;
            break;
            case 42:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            buttonC.setVisible(false);
            buttonD.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            case_story = 43;
            break;
            case 43:
            text_label.setText(text[case_story]);
            case_story = 45;
            break;
            case 45: 
            text_label.setText(text[case_story]);
            case_story = 46;
            break;
            case 46:
            button.setVisible(false);
            buttonA.setVisible(true);
            buttonB.setVisible(true);
            buttonC.setVisible(true);
            buttonD.setVisible(true);
            text_label.setText(text[case_story]);
            //46 if A||D case_story =47; if B case_story = 48; if C case_story = 49;
            break;
            case 47:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            buttonC.setVisible(false);
            buttonD.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            endOfPath = 1;
            break;
            case 48:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            buttonC.setVisible(false);
            buttonD.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            endOfPath = 1;
            break;
            case 49:
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            buttonC.setVisible(false);
            buttonD.setVisible(false);
            button.setVisible(true);
            text_label.setText(text[case_story]);
            endOfPath = 1;
            break;
          }
        }
      }
        if(e.getSource() == buttonY){
          if(case_story == 3){
            case_story = 4;
          }
          if(case_story == 9){
            case_story = 24;
          }
          if(case_story == 36){
            case_story = 37;
          }
        }
        if(e.getSource() == buttonN){
          if(case_story == 3){
            case_story = 21;
          }
          if(case_story == 9){
            case_story = 24;
          }
          if(case_story == 36){
            case_story = 38;
          }
        }
        if(e.getSource() == buttonA){
          if(case_story == 4){
            case_story = 22;
          }
          if(case_story == 11){
            case_story = 25;
          }
          if(case_story == 15){
            case_story = 16;
          }
          if(case_story == 29){
            case_story = 30;
          }
          if(case_story == 32){
            case_story = 11;
          }
          if(case_story == 34){
            case_story = 36;
          }
          if(case_story == 39){
            case_story = 40;
          }
          if(case_story == 46){
            case_story = 47;
          }
        }
        if(e.getSource() == buttonB){
          if(case_story == 4){
            case_story = 5;
          }
          if(case_story == 11){
            case_story = 25;
          }
          if(case_story == 15){
            case_story = 16;
          }
          if(case_story == 29){
            case_story = 10;
          }
          if(case_story == 33){
            case_story = 34;
          }
          if(case_story == 34){
            case_story = 36;
          }
          if(case_story == 39){
            case_story = 40;
          }
          if(case_story == 46){
            case_story = 48;
          }
        }
        if(e.getSource() == buttonC){
          if(case_story == 11){
            case_story = 26;
          }
          if(case_story == 34){
            case_story = 36;
          }
          if(case_story == 39){
            case_story = 41;
          }
          if(case_story == 46){
            case_story = 49;
          }
        }
        if(e.getSource() == buttonD){
          if(case_story == 11){
            case_story = 12;
          }
          if(case_story == 34){
            case_story = 36;
          }
          if(case_story == 39){
            case_story = 42;
          }
          if(case_story == 46){
            case_story = 47;
          }
        }
    }
  }

}
