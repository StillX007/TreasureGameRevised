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
 *  |                      EmptyButtonListener                  |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |     Create action listener    |                           |
 *  |     for the EmptyButton       |        EmptyButton        |
 *  |                               |                           |
 *  |     Shows empty when clicked  |       TreasureGame        |
 *  |     Update the fields         |                           |
 *  |-------------------------------+---------------------------|
 */
public class EmptyButtonListener implements ActionListener{
    //Declare private variables 
    private TreasureGame treasureGame;              //Used to store game's information
    private EmptyButton emptyButton;                //Used to store empty button 
    private GameBoard gameBoard;                    //Used to store game board

    //Create text fields 
    private JTextField triesField;                  //Used to store tries field
    private JTextField treasureField;               //Used to store the treasure field
    private JTextField pointsField;                 //Used to store the points field 
    private JTextField lastMoveField;               //Used to store the last move field

    /**
     * Purpose: contructor that intializes the empty button, treasure game, tries, points,  last move, and gameboard.
     * signature: nothing 
     * example: EmptyButtonListener(EmptyButton emptyButton, TreasureGame treasureGame, JTextField triesField, JTextField treasureField,
     *                              JTextField pointsField, JTextField lastMoveField, GameBoard gameBoard)
     */
    public EmptyButtonListener(EmptyButton emptyButton, TreasureGame treasureGame, JTextField triesField, JTextField treasureField,
    JTextField pointsField, JTextField lastMoveField, GameBoard gameBoard){
        //Set argument to instance variable
        this.emptyButton = emptyButton;
        this.treasureGame = treasureGame;
        this.gameBoard = gameBoard;
        this.triesField = triesField;
        this.treasureField = treasureField;
        this.pointsField = pointsField;
        this.lastMoveField = lastMoveField;
    }

    /**
     * Purpose: action perform when clicking on empty button, suppose to update each field, and disable buttons 
     * signature: nothing 
     * example: actionPerformed(ActionEvent e)
     */
    public void actionPerformed(ActionEvent e){
        //Set the button ot be disabled  
        emptyButton.setEnabled(false);

        //Using the found nothing method 
        treasureGame.foundNothing();

        //Update the game's text fields
        pointsField.setText("" + treasureGame.getPoints());
        treasureField.setText("" + treasureGame.getTreasure());
        triesField.setText("" + treasureGame.getTries());
        lastMoveField.setText("Miss owo");

        //If the game is over, then the game will say "Game Over LOSER"
        //Then set the board functions to be disabled.
        if(treasureGame.checkGameOver()){
            //end game decide win/lose
            lastMoveField.setText("Game Over LOSER");
            gameBoard.setDisabled();
        }
    }
}