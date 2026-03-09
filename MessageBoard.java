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
 *  |                          MessageBoard                     |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |     Create functionality      |                           |
 *  |     to update the last move   |       TreasureGame        |
 *  |                               |                           |
 *  |     Shows message             |                           |
 *  |                               |                           |
 *  |-------------------------------+---------------------------|
 */
public class MessageBoard extends JPanel{
    //Create text field
    private JLabel lastMoveLabel; //Used to display last move.
    /**
     * Purpose: Constructor for MessageBoard
     * signature: nothing 
     * example: MessageBoard(JTextField lastMoveField)
     */
    public MessageBoard(JTextField lastMoveField){
        //Create new JPanel
        JPanel panel = new JPanel();

        //Set borderLayout
        panel.setLayout(new BorderLayout());

        //Label, assign and set the font to have "Comic Sans MS", 20
        lastMoveLabel = new JLabel("Last Move: ");
        lastMoveLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));

        //Set the last move panel to the color pink
        panel.setBackground(Color.YELLOW);

        //Add and set the lastMoveLabel to west
        panel.add(lastMoveLabel, BorderLayout.WEST);

        //Add and set the lastmoveField to the east
        panel.add(lastMoveField, BorderLayout.EAST);

        //Add panel
        add(panel);
    }
}