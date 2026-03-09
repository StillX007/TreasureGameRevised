import javax.swing.*;
import java.awt.event.*;
import java.util.*;
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
 *  |                    TreasureButtonListener                 |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |     Create action listener    |                           |
 *  |     for the TreasureButton    |      TreasureButton       |
 *  |                               |                           |
 *  |     Shows Treasure            |       TreasureGame        |
 *  |     Update the fields         |                           |
 *  |-------------------------------+---------------------------|
 */

public class TreasureButtonListener implements ActionListener{
    //Declare private variables 
    private TreasureGame treasureGame;                   //Used to store game's information
    private TreasureButton treasureButton;               //Used to store the treasure button 
    private GameBoard gameBoard;                         //Used to store game board

    //Create text fields 
    private JTextField triesField;                       //Used to store tries field
    private JTextField treasureField;                    //Used to store the treasure field
    private JTextField pointsField;                      //Used to store the points field 
    private JTextField lastMoveField;                    //Used to store the last move field

    /**
     * Purpose: Constructor for ScoreBoard
     * signature: nothing 
     * example: ScoreBoard(TreasureButton treasureButton, TreasureGame treasureGame, JTextField triesField,
     *                     JTextField treasureField, JTextField pointsField, lastMoveField, GameBoard gameBoard)
     */
    public TreasureButtonListener(TreasureButton treasureButton, TreasureGame treasureGame, JTextField triesField, JTextField treasureField,
    JTextField pointsField, JTextField lastMoveField, GameBoard gameBoard){
        //Set argument to instance variable
        this.treasureButton = treasureButton;
        this.treasureGame = treasureGame;
        this.gameBoard = gameBoard;
        this.triesField = triesField;
        this.treasureField = treasureField;
        this.pointsField = pointsField;
        this.lastMoveField = lastMoveField;
    }

    /**
     * Purpose: action performed for clicking on treasure button 
     * signature: nothing 
     * example:  actionPerformed(ActionEvent e)
     */
    public void actionPerformed(ActionEvent e){
        //Set the button to be disabled
        treasureButton.setEnabled(false);

        //Get a random number from treasure button
        int points = treasureButton.getRandom();

        //Using found treasure method
        treasureGame.foundTreasure(treasureButton.getRandom());

        //Update the textfields of the game 
        pointsField.setText("" + treasureGame.getPoints());
        treasureField.setText("" + treasureGame.getTreasure());
        triesField.setText("" + treasureGame.getTries());

        //Display the points the user gets when clicking on a treasure button
        if(points > 1){
            //if the random points are greater than 1 then it will display the points
            //that are greater than 1
            lastMoveField.setText("You got " + points + " points!");
        }
        else{
            //else it would display the grammer for one point
            lastMoveField.setText("You got " + points + " point!");
        }

        //If the treasure equals zero
        if(treasureGame.getTreasure() == 0){
            //Display you win
            lastMoveField.setText("Game Over - YOU WIN");

            //Disable the game board
            gameBoard.setDisabled();
        }
        //If the game is over 
        else if(treasureGame.checkGameOver()){
            //Then the game will display that the user lost.
            lastMoveField.setText("Game Over LOSER");

            //Set the  board button to be disabled.
            gameBoard.setDisabled();
        }
    }
}