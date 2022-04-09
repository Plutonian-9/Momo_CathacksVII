//

import javax.swing.*;


import java.awt.event.ActionEvent;

import java.awt.*;
import java.awt.event.*;

public class Image_Practice_Sarah extends JFrame{
    public static void main(String[] args ) {
        Image_Practice_Sarah window = new Image_Practice_Sarah();
    }

    private JLabel label = new JLabel("Hello world", JLabel.LEFT);

    public Image_Practice_Sarah(){

        Clicklistener click = new Clicklistener();

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(1200, 800);
        JPanel panel = new JPanel();
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        panel.setMaximumSize(new Dimension(1200,400));
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        JPanel panel2 = new JPanel();
        panel2.setMaximumSize(new Dimension(1200, 800) );
        this.add(panel2);
        
        panel.setBackground(Color.BLACK);

        JButton button = new JButton("Button 1");
        button.setMinimumSize(new Dimension(400, 200));
        button.addActionListener(new Clicklistener());

        label.setForeground(Color.WHITE);
        label.setOpaque(true);
        label.setBackground(Color.BLACK);

        panel.add(button, BorderLayout.SOUTH);
        panel.add(label);
        this.add(panel);
    }

    private class Clicklistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setText("Button 1 is clicked!");
        }
    }
}

