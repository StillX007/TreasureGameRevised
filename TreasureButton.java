import javax.swing.*;
import java.util.*;
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
 *  |                        TreasureButton                     |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |     Create functionality      |                           |
 *  |     of the buttons            |   TreasureButtonListener  |
 *  |                               |       TreasureGame        |
 *  |     Shows treasure            |         GameBoard         |
 *  |     when clicked              |                           |
 *  |-------------------------------+---------------------------|
 */
public class TreasureButton extends EmptyButton{
    //Image Icon used to display the gold
    private ImageIcon goldIcon = new ImageIcon("gold.jpg");
    //create point field
    private int randomPoints;
    /**
     * Purpose: Constructor for objects of class TreasureButton
     * signature: nothing
     * example: TreasureButton()
     */
    public TreasureButton(){
        //Create new random generator
        Random myPointsGenerator = new Random();

        //Return a number 1-3
        randomPoints = myPointsGenerator.nextInt(3)+1;

        //Set gold icon size
        goldIcon = new ImageIcon(goldIcon.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));

        //Set a disable icon treasure for random button
        setDisabledIcon(goldIcon);
    }
    /**
     * Purpose: generate random number
     * signature: output int
     * example:  getRandom()    Return 2
     */
    public int getRandom(){
        //returning random points as a integer
        return randomPoints;
    }
}