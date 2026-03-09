import javax.swing.*;
import java.awt.event.*;
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
 *  |                    TrollButtonListener                    |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |     Create action listener    |                           |
 *  |     for the TrollButton       |      TrollButton          |
 *  |                               |                           |
 *  |     Resets the points         |      TreasureGame         |
 *  |     Update the fields         |                           |
 *  |-------------------------------+---------------------------|
 */
public class TrollButtonListener implements ActionListener{
    //Declare private variables 
    private TreasureGame treasureGame;                      //Used to store game's information
    private TrollButton trollButton;                //Used to store troll button 
    private GameBoard gameBoard;                        //Used to store game board

    //Create text fields 
    private JTextField triesField;                  //Used to store tries field
    private JTextField treasureField;               //Used to store the treasure field
    private JTextField pointsField;                 //Used to store the points field 
    private JTextField lastMoveField;               //Used to store the last move field
    /**
     * Purpose: contructor that intializes the troll button, treasure game, tries, points,  last move, and gameboard.
     * signature: nothing 
     * example: TrollButtonListener(TrollButton trollButton, TreasureGame treasureGame, JTextField triesField, JTextField treasureField,
     *                              JTextField pointsField,JTextField lastMoveField, GameBoard board)
     */
    public TrollButtonListener(TrollButton trollButton, TreasureGame treasureGame, JTextField triesField, JTextField treasureField,
    JTextField pointsField,JTextField lastMoveField, GameBoard gameBoard){
        //Set argument to instance variable
        this.trollButton = trollButton;
        this.treasureGame = treasureGame;
        this.gameBoard = gameBoard;
        this.triesField = triesField;
        this.treasureField = treasureField;
        this.pointsField = pointsField;
        this.lastMoveField = lastMoveField;
    }

    /**
     * Purpose: action perform when clicking on troll button, suppose to update each field, disable buttons, and reset points
     * signature: nothing 
     * example: actionPerformed(ActionEvent e)
     */ 
    public void actionPerformed(ActionEvent e){
        //Set the troll button to be disabled
        trollButton.setEnabled(false);

        //Troll button method 
        treasureGame.trolled();

        //Update each of the fields 
        pointsField.setText("" + treasureGame.getPoints());
        treasureField.setText("" + treasureGame.getTreasure());
        triesField.setText("" + treasureGame.getTries());
        lastMoveField.setText("Trolled");

        //If game is over then set the last move field to be "Game Over Loser"
        //and set board functions to be disabled.
        if(treasureGame.checkGameOver()){          
            lastMoveField.setText("Game Over LOSER");
            gameBoard.setDisabled();
        }
    }

}
