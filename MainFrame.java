/*
Project:
Contributers: 

List of things that still need to be done:
Buttons formatted, colored, and that fun stuff
The frames need to be added
Cases need to be reorganized
Currently the window completely freezes once button 1 is hit and will not close
Cases need all of their buttons added in
All of the dialog still needs to be added

List of things I would like to do but may not have time:
Convert the button if statements to switch statements (Low prio)
Allow user to hit z to scroll through the text rather than hitting a button

TLDR: Needs reorganization

*/

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// import javafx.scene.control.TextField;
// import javafx.scene.input.KeyEvent;

import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;

public class MainFrame extends JFrame {
 
  public static void main(String[] args) {
    MainFrame window = new MainFrame();
  }

  private JPanel gameWindow = new JPanel();
  private JPanel textPanel = new JPanel();
<<<<<<< HEAD
  private JButton test = new JButton();
  private StoryFrame[] plotPoints = new StoryFrame[51];
=======
  private String text[] = new String[60];
  private JLabel text_label = new JLabel("Hello");
  private JButton button = new JButton("Button 1");
  private JButton buttonY = new JButton("Yes");
  private JButton buttonN = new JButton("No");
  private JButton buttonA = new JButton("A");
  private JButton buttonB = new JButton("B");
  private JButton buttonC = new JButton("C");
  private JButton buttonD = new JButton("D");
  private int case_story = 0;
  private int endOfPath = 0;
>>>>>>> k
  
  public MainFrame() {
    fillPlotPoints();
    //----------------------game Window------------------------
    gameWindow.setBackground(Color.BLACK);
    gameWindow.setBorder(new EmptyBorder(10,10,10,10));
    gameWindow.setPreferredSize(new Dimension(800,500));
    test.addActionListener(new ButtonActionListener());

    //----------------------Text Panel-------------------------
    textPanel.setBackground(Color.LIGHT_GRAY);
    textPanel.setBorder(new EmptyBorder(10,10,10,10));
    textPanel.setPreferredSize(new Dimension(800,250));
    text_label.setForeground(Color.BLACK);
    text_label.setOpaque(true);
    text_label.setBackground(Color.LIGHT_GRAY);
    
    //-----------------------Buttons----------------------------
    //Text scrolling button
    button.setMinimumSize(new Dimension(400, 200));
    button.addActionListener(new Clicklistener());
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
    //Each case will directly correlate with the spot in the arrary the text is in. So case 1 is text[1] and our 1 in the
    //Spreadsheet
    //text 0 is a place holder for now.
    text[0] = "Welcome!";
    //text 1 is an example how the text should go in. The rest are still placeholders but I hope having this example helps.
    text[1] = "Marian the librarian is a creature of habit. Every day she steps into her office at exactly 8:13 a.m., with her lunch, two folders, and a notebook in her messenger bag. Officially, she starts work at 8:15, but it is her sincerely held ";
    text[2] = "Mariam works at the library and is currently on her way to the library";
    text[3] = ">I'm just testing";


  }

  //The case button's are outdated bear in mind. This was made before the story was completely finished so these
  //will still need to be reorganized once ready. I have marked what needs to be reorganzed and what need to be taken away

  //This waits for a button to be pressed and then once the specified button is pressed it goes into the if statement for it
  //All of them run under a loop waiting for an end. The scenes all run under the continue button.
  private class Clicklistener implements ActionListener{

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
            text_label.setText(text[case_story]);
            //if no case_story = 6; if yes case_story = 23; (Not anymore) - NEED TO CHANGE
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
            text_label.setText(text[case_story]);
            //if yes case_story=24 if no case_story = 10;
            break;
            case 10:
            text_label.setText(text[case_story]);
            case_story = 11;
            break;
            case 11:
            text_label.setText(text[case_story]);
            //11 if A||B case_story = 25; if C case_story = 26; if D case_story = 12;
            break;
            case 12:
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
            text_label.setText(text[case_story]);
            // 15 if A case_story = 27; if B case_story = 16; - NEEDS TO BE CHANGED
            break;
            case 16:
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
            text_label.setText(text[case_story]);
            //case_story = 28;
            break;
            case 22:
            text_label.setText(text[case_story]);
            case_story = 35;
            break;
            case 23:
            text_label.setText(text[case_story]);
            //no path yet. DOESN'T EXIST
            break;
            case 24:
            text_label.setText(text[case_story]);
            case_story = 10;
            break;
            case 25:
            text_label.setText(text[case_story]);
            //nothing yet
            break;
            case 26:
            text_label.setText(text[case_story]);
            //nothing yet
            break;
            case 27:
            text_label.setText(text[case_story]);
            //nothing yet DOESN'T EXIST
            break;
            case 28:
            text_label.setText(text[case_story]);
            case_story = 4;
            break;
            case 29:
            text_label.setText(text[case_story]);
            //29 if A case_story = 30; if B case_story = 31;
            break;
            case 30:
            text_label.setText(text[case_story]);
            case_story = 32;
            break;
            case 31:
            text_label.setText(text[case_story]);
            //an ending DOESN'T EXIST
            endOfPath = 1;
            break;
            case 32:
            text_label.setText(text[case_story]);
            //32 if A case_story = 33; if B case_story = 34; UPDATE A TO 11
            break;
            case 33:
            text_label.setText(text[case_story]);
            //DOESN'T EXIST
            break;
            case 34:
            text_label.setText(text[case_story]);
            case_story = 36;
            //BUTTONS A,B,C,D ALL NEED TO BE ADDED.
            break;
            case 35:
            text_label.setText(text[case_story]);
            case_story = 29;
            break;
            case 36:
            text_label.setText(text[case_story]);
            //36 if Yes case_story = 37; if no case_story = 38;
            break;
            case 37:
            text_label.setText(text[case_story]);
            break;
            case 38:
            text_label.setText(text[case_story]);
            case_story = 39;
            break;
            case 39:
            text_label.setText(text[case_story]);
            // 39 if A||B case_story = 40; if C case_story = 41; if D case_story = 42;
            break;
            case 40:
            text_label.setText(text[case_story]);
            case_story = 43;
            break;
            case 41:
            text_label.setText(text[case_story]);
            case_story = 43;
            break;
            case 42:
            text_label.setText(text[case_story]);
            case_story = 43;
            break;
            case 43:
            //CHANGED TO JUST 45
            text_label.setText(text[case_story]);
            //if A case_story = 44; if B case_story = 45;
            break;
            case 44:
            //DOESNT EXIST
            text_label.setText(text[case_story]);
            endOfPath = 1;
            break;
            case 45: 
            text_label.setText(text[case_story]);
            case_story = 46;
            break;
            case 46:
            text_label.setText(text[case_story]);
            //46 if A||D case_story =47; if B case_story = 48; if C case_story = 49;
            break;
            case 47:
            text_label.setText(text[case_story]);
            endOfPath = 1;
            break;
            case 48:
            text_label.setText(text[case_story]);
            endOfPath = 1;
            break;
            case 49:
            text_label.setText(text[case_story]);
            endOfPath = 1;
            break;
            case 50:
            //currently unused
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
          if(case_story == 5){
            case_story = 23;
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
          if(case_story == 5){
            case_story = 6;
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
            case_story = 27;
          }
          if(case_story == 29){
            case_story = 30;
          }
          if(case_story == 32){
            case_story = 33;
          }
          if(case_story == 39){
            case_story = 40;
          }
          if(case_story == 43){
            case_story = 44;
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
            case_story = 31;
          }
          if(case_story == 33){
            case_story = 34;
          }
          if(case_story == 39){
            case_story = 40;
          }
          if(case_story == 43){
            case_story = 45;
          }
          if(case_story == 46){
            case_story = 48;
          }
        }
        if(e.getSource() == buttonC){
          if(case_story == 11){
            case_story = 26;
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
          if(case_story == 39){
            case_story = 42;
          }
          if(case_story == 46){
            case_story = 47;
          }
        }
    }
  }
  
  //this is stupid
  private class ButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

      
    }
  }



  public void fillPlotPoints() {
    // title screen
    String[] tempArA = new String[4];
    String[] tempArB = new String[3];
    int[] ids = new int[4];
    tempArB[0] = "Marian";
    ids[0] = 1;
    plotPoints[0] = new StoryFrame("Library.png", "Marian the Librarian: A Choose-Your-Own Adventure Game", "", tempArA, 0, ids, tempArB, 0, 0);
    ids[0] = 2;
    plotPoints[1] = new StoryFrame("Library.png", "Marian the librarian is a creature of habit. Every day she steps into her office at exactly 8:13 a.m., with her lunch, two folders, and a notebook in her messenger bag. Officially, she starts work at 8:15, but it is her sincerely held belief that two minute early is the perfect time to arrive, no matter what the occasion.", "", tempArA, 0, ids, tempArB, 0, 1);
    ids[0] = 3;
    tempArB[1] = "Phil";
    plotPoints[2] = new StoryFrame("Library.png", "Today, though, her colleague, Phil, stopped her to chat at 8:12 a.m. That was the first thing that went wrong. Phil is pleasant and kind, but he has nothing interesting to say today. He’s musing about his breakfast, and Marian is watching her watch, conscious of her own rudeness, but really wanting to get to her office.", "", tempArA, 1, ids, tempArB, 0, 2);
    ids[0] = 4;
    ids[1] = 21;
    tempArA[0] = "Yes";
    tempArA[1] = "No";
    tempArB[1] = "Evil_Hat";
    plotPoints[3] = new StoryFrame("Office.png", "Marian didn’t make it into her office until 8:17. A nightmare! When she finally got in, the air felt funny. The vibes of the day were all wrong. She was filling with dread when she saw the most peculiar thing. The tallest of top hats sat atop of her desk, with a blood red ribbon tied around it. She’d never seen it before. Today is Monday, and the custodians don’t visit over the weekend. Whose hat could this be?", "Does Marian step out to inquire with her colleagues about the lost hat?", tempArA, 2, ids, tempArB, 2, 2);
    ids[0] = 22;
    ids[1] = 5;
    tempArA[0] = "A";
    tempArA[1] = "B";
    tempArB[1] = "Evil_Hat";
    plotPoints[4] = new StoryFrame("Office.png", "Marian is chilly now, and she feels as though she’s being drawn to the hat–some kind of force, not quite magnetic, not quite magic, perhaps something in between. Her messenger bag is still on her shoulder, and she remembers she should put her lunch away. She kneels to put her lunch in the mini-refrigerator but notices it’s been unplugged. She opens the refrigerator, and her yogurts have spoiled. She doesn’t understand how they’ve become so putrid so fast.", "Does Marian: A. clean out her fridge now? or B. set the lunch bag on the desk and take her seat in front of the hat?", tempArA, 3, ids, tempArB, 2, 2);
    ids[0] = 6;
    plotPoints[5] = new StoryFrame("Office.png", "Marian sighs, a bit distraught. She has lots of new books to catalog today. The hat is so tall. She puts her hand near it but not quite touching. She feels energy shoot through her body! She wants to touch the hat. She has to touch the hat! She hears a quiet windy whisper. No, was that the hat whispering her name? “Marian! Marian!” Yes, it is the hat. “Marian, help me! I am so alone!”", "", tempArA, 4, ids, tempArB, 0, 2);
    ids[0] = 7;
    plotPoints[6] = new StoryFrame("Library.png", "Marian is dizzy. She’s been swept into another universe, but it spat her back out, and now she has plummeted back to her desk in the library. No one even knew she was gone. There is a cart of books outsider her door with a note from her library pages. They apologized for not getting through all of the shelving last night. Marian likes shelving. You don’t get to shelve much as a librarian, but Marian misses it. She lets her staff do it for her, but that settles it. Today she will shelve.", "", tempArA, 5, ids, tempArB, 0, 1);
    ids[0] = 8;
    plotPoints[7] = new StoryFrame("Library.png", "The cart is full of romance novels. Marian used to sneer at the cheesy covers with their bad fonts. Now, they are her secret guilty pleasure. Very secret. She tells no one. She likes shelving the romance novels because she likes browsing them unsuspectingly. She shelves meticulously; everything goes in its alphabetical place, perfectly flush with the shelves.", "", tempArA, 6, ids, tempArB, 0, 1);
    ids[0] = 9;
    plotPoints[8] = new StoryFrame("Library.png", "When she has put almost every book in its place, she notices the top hat on top of the last shelf in the aisle.", "", tempArA, 7, ids, tempArB, 0, 2);
    tempArA[0] = "Yes";
    tempArA[1] = "No";
    ids[0] = 24;
    ids[1] = 10;
    plotPoints[9] = new StoryFrame("Library.png", "Marian looks around. No one is watching her, and no one has spotted the hat. She hears the hat whispering again. She’s sure of it now. The hat is calling out to her. Begging her. “Please, Marian. Wear me. I haven’t been a proper hat in so long,” it says.", "Does Marian put on the hat now?", tempArA, 8, ids, tempArB, 2, 2);
    ids[0] = 11;
    plotPoints[10] = new StoryFrame("Library.png", "Marian grabs the hat, closing the head hole tightly with a fist, as though it were a mouth. She still hears the hat. “Marian! Marian! My favorite librarian! Don’t you remember me?” the hat says. Marian stuffs the hat between her torso and arm, squishing it as hard as she can. She begins walking back to her office, not bothering to bring back her shelving cart.", "", tempArA, 9, ids, tempArB, 0, 2);
    ids[0] = 25;
    ids[1] = 26;
    ids[2] = 12;
    tempArA[0] = "A";
    tempArA[1] = "B";
    tempArA[2] = "C";
    tempArA[3] = "D";
    tempArB[1] = "Phil";
    plotPoints[11] = new StoryFrame("Library.png", "On the way to her office, she sees Phil, who is holding a cup of coffee and walking toward his own office. “How’s it going, Marian? Should I save you a seat at the staff luncheon?” Marian had completely forgotten. There was a very important staff luncheon with all the city council members. At least she wouldn’t be needing her spoiled lunch, anyway.", "Marian replies: A. “Yes, absolutely! I’ll see you there. Can’t wait.” B. “Oh, I’d forgotten! Ah, I suppose.” C. “I really don’t want to go. Do you think anyone will notice if I don’t?” D. “Phil, I need help. I think I’m being stalked by a hat.”", tempArA, 10, ids, tempArB, 0, 2);

    ids[0] = 13;
    tempArB[2] = "Evil_Hat";
    plotPoints[12] = new StoryFrame("Library.png", "Phil thinks Marian is joking for a moment. But when she doesn’t say anything more, he raises his eyebrows. “You what? Marian, are you alright? Should I get you a bottle of water from the vending machine?” Phil says. “No, it’s alright,” Marian says. And just then, the hat seems to grow strong. It’s fighting to slip out from Marian’s clutch. “No!” she says. “Stop that!” Phil cocks his head, and then the hat jumps out at Phil, covering his entire face for a moment, as though to shut him up. Marian grabs the hat, commanding it to behave. “Jeez, Marian. What’d you do that for?” Phil says.", "Marian says: A. “It wasn’t me! It’s the hat! It’s possessed, I think.” B. “Do you believe me now?” C. “Whatever” D. “I can’t control this thing.”", tempArA, 11, ids, tempArB, 4, 3);
    ids[0] = 14;
    plotPoints[13] = new StoryFrame("Library.png", "Phil hears the hat whispering now. “Whoa, did the hat just say your name?” Phil says.", "", tempArA, 12, ids, tempArB, 0, 3);
    ids[0] = 15;
    plotPoints[14] = new StoryFrame("Library.png", "The hat starts writhing on the ground. “What do I do?” Marian cries. “Marian! Just kill me if you won’t put me on your head! Just do it! I beggeth thee. I can’t live like this.” the hat says, with a weak but deeper voice than a whisper now.", "", tempArA, 13, ids, tempArB, 0, 3);
    ids[0] = 16;
    plotPoints[15] = new StoryFrame("Library.png", "Marian and Phil look at each other. “How do you kill a hat?” Phil asks.", "Marian replies: A. “You wouldn’t really kill it, would you?” B. I don’t know… we could try burning it.”", tempArA, 14, ids, tempArB, 2, 3);
    
    ids[0] = 17;
    plotPoints[16] = new StoryFrame("Library.png", "", "", tempArA, 15, ids, tempArB, 0, 2);
    ids[0] = 18;
    plotPoints[17] = new StoryFrame("Library.png", "", "", tempArA, 16, ids, tempArB, 0, 2);
    ids[0] = 19;
    plotPoints[18] = new StoryFrame("Library.png", "", "", tempArA, 17, ids, tempArB, 0, 2);
    ids[0] = 20;
    plotPoints[19] = new StoryFrame("Library.png", "", "", tempArA, 18, ids, tempArB, 0, 2);
    ids[0] = 50;
    plotPoints[20] = new StoryFrame("Library.png", "", "", tempArA, 19, ids, tempArB, 0, 2);
    
    ids[0] = 11;
    plotPoints[10] = new StoryFrame("Library.png", "", "", tempArA, 9, ids, tempArB, 0, 2);
    ids[0] = 11;
    plotPoints[10] = new StoryFrame("Library.png", "", "", tempArA, 9, ids, tempArB, 0, 2);
    ids[0] = 11;
    plotPoints[10] = new StoryFrame("Library.png", "", "", tempArA, 9, ids, tempArB, 0, 2);
    ids[0] = 11;
    plotPoints[10] = new StoryFrame("Library.png", "", "", tempArA, 9, ids, tempArB, 0, 2);
    ids[0] = 11;
    plotPoints[10] = new StoryFrame("Library.png", "", "", tempArA, 9, ids, tempArB, 0, 2);
    ids[0] = 11;
    plotPoints[10] = new StoryFrame("Library.png", "", "", tempArA, 9, ids, tempArB, 0, 2);


  
  
  }

}

