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


    ////----------------------Main Window------------------------
    this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
    this.add(gameWindow);
    this.add(textPanel);
    this.setTitle("MoMo");
    this.setSize(800, 800);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
  
  //this is stupid
  private class ButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

      
    }
  }



  public void fillPlotPoints() {
    // title screen
    plotPoints[0] = new StoryFrame("library.png", "Marian the Librarian: A Choose-Your-Own Adventure Game", "", {}, 0, 2, {});
  }

}
