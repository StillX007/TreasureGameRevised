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
 *
 *  |-----------------------------------------------------------|
 *  |                    TrollButton                            |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |     Create Functionality      |                           |
 *  |     of the buttons            |    TrollButtonListener    |
 *  |                               |       TreasureGame        |
 *  |     Resets the points         |         GameBoard         |
 *  |                               |                           |
 *  |-------------------------------+---------------------------|
 */

public class TrollButton extends EmptyButton{
    //Image Icon used to display the troll
    private ImageIcon trollIcon = new ImageIcon("troll.jpg");
    /**
     * Purpose: Constructor for objects of class TrollButton
     * signature: nothing
     * example: TrollButton()
     */
    public TrollButton(){
        //Set troll icon size
        trollIcon = new ImageIcon(trollIcon.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));

        //Set a disable icon troll for random button
        setDisabledIcon(trollIcon);
    }
}