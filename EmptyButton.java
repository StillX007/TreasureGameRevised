import javax.swing.*;
import java.awt.*;
/**
 * Contributor(s): 
 * Your name: Howie Nguyen; CSID: 0005774775
 *            Reese Johnson; CSID: 0005689389
 *            
 * Sources:
 * Starting Out with Java, 6th edition, T. Gaddis
 * http://MyProgrammingLab.com: Starting Out with Java, 6th edition
 * https://docs.oracle.com/javase/tutorial/uiswing/layout/using.html#set
 * Jason Hawk phone number: 510-996-2264
 *
 * Version: 12/09/2019
 * 
 *
 *  |-----------------------------------------------------------|
 *  |                          EmptyButton                      |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |     Create functionality      |                           |
 *  |     of the buttons            |     EmptyButtonListener   |
 *  |                               |       TreasureGame        |
 *  |     Shows empty when clicked  |         GameBoard         |
 *  |                               |                           |
 *  |-------------------------------+---------------------------|
 */
public class EmptyButton extends JButton{
    //Creating Image icons
    private ImageIcon holeIcon = new ImageIcon("hole.jpg");  //Create hole icon
    private ImageIcon sandIcon = new ImageIcon("sand.jpg");  //Create sand icon
    /**
     * Purpose: Constructor for objects of class EmptyButton
     * signature: nothing
     * example: EmptyButton()
     */
    public EmptyButton(){
        //Resizing the images to be 60,60
        holeIcon = new ImageIcon(holeIcon.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
        sandIcon = new ImageIcon(sandIcon.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));

        //Setting the icon to be "sandIcon"
        setIcon(sandIcon);

        //Set a disable icon hole for empty button
        setDisabledIcon(holeIcon);
    }
}
