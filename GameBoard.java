import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
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
 *  |                          GameBoard                        |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |     Create functionality      |       TrollButton         |
 *  |     of the game board         |       EmptyButton         |
 *  |                               |       TreasureButton      |
 *  |     Shows different buttons   |       TreasureGame        |
 *  |     when clicked              |                           |
 *  |-------------------------------+---------------------------|
 */
public class GameBoard extends JPanel{
    //Create a treasure game
    private TreasureGame treasureGame; //used to store the information of treasure game

    //Create text fields
    private JTextField triesField;               //Create tries field
    private JTextField treasureField;            //Create treasure field
    private JTextField pointsField;              //Create points field
    private JTextField trollsField;              //Create trolls field
    private JTextField lastMoveField;            //Create last move field

    //Create array of empty buttons
    private EmptyButton buttons[];

    /**
     * Purpose: This game is intended to create a gridlayout treasure hunt game
     * signature: nothing
     * example: GameBoard(TreasureGame treasureGame, JTextField triesField, JTextField treasureField,
     *                    JTextField pointsField, JTextField lastMoveField)
     */
    public GameBoard(TreasureGame treasureGame, JTextField triesField, JTextField treasureField,
    JTextField pointsField, JTextField lastMoveField){
        //Set game
        this.treasureGame = treasureGame;

        //Set the text fields to instant variables
        this.triesField = triesField;
        this.treasureField = treasureField;
        this.pointsField = pointsField;
        this.trollsField = trollsField;
        this.lastMoveField = lastMoveField;

        //Create 100 empty buttons
        buttons = new EmptyButton[100];

        //Add the treasure game
        addGame();
    }

    /**
     * Purpose: To add the treasure
     * signature: nothing
     * example: addGame()
     */
    public void addGame(){
        //Create a panel for the game
        JPanel panel = new JPanel();

        //Set the panel size
        panel.setPreferredSize(new Dimension(550, 550));

        //Create a random generator
        Random myNumberGenerator = new Random();

        //Create a grid layout for panel
        panel.setLayout(new GridLayout(10,10));

        //Loop for treasure buttons
        for(int treasureButtonIndex =0; treasureButtonIndex < 20; treasureButtonIndex++){

            //Create random number variable
            int randomTreasureButton;

            do{
                //Create a random number
                randomTreasureButton = myNumberGenerator.nextInt(100);

                //Repeat while random number are not null
            }while(buttons[randomTreasureButton] != null);

            //Create a new treasure button
            TreasureButton treasureButton = new TreasureButton();

            //Add treasure button to buttons
            buttons[randomTreasureButton] = treasureButton;

            //Add action listener to buttons
            buttons[randomTreasureButton].addActionListener
            (new TreasureButtonListener(treasureButton, treasureGame, triesField, treasureField,
                    pointsField, lastMoveField, this));
        }

        //Loop for troll buttons
        for(int trollButtonIndex = 0; trollButtonIndex < 20; trollButtonIndex++){

            //Create random number variable
            int randomTrollButton;
            do{
                //Create a random troll number
                randomTrollButton = myNumberGenerator.nextInt(100);

                //Repeat while random number are not null
            }while(buttons[randomTrollButton] != null);

            //Create a new troll button
            TrollButton trollButton = new TrollButton();

            //Add troll button to buttons
            buttons[randomTrollButton] = trollButton;

            //Add action listener to buttons
            buttons[randomTrollButton].addActionListener
            (new TrollButtonListener(trollButton, treasureGame, triesField,treasureField,
                    pointsField, lastMoveField, this));        
        }

        //Loop for empty buttons
        for(int emptyButtonIndex = 0; emptyButtonIndex < 100; emptyButtonIndex++){

            //If button is null
            if(buttons[emptyButtonIndex] == null){

                //Create a new empty button
                EmptyButton emptyButton = new EmptyButton();

                //Add empty button to buttons
                buttons[emptyButtonIndex] = emptyButton;

                //Add action listener to buttons
                buttons[emptyButtonIndex].addActionListener(new EmptyButtonListener(emptyButton, treasureGame, triesField, treasureField,
                        pointsField, lastMoveField, this));

            }

            //Add the buttons to panel
            panel.add(buttons[emptyButtonIndex]);  
        }

        //Set last move to start with text
        lastMoveField.setText("READY?");
        
        //Add panel
        add(panel);
    }

    /**
     * Purpose: To reveal game board
     * signature: nothing
     * example: setDisable()
     */
    public void setDisabled(){
        //Loop for buttons
        for(int disabledButtonIndex = 0; disabledButtonIndex < 100; disabledButtonIndex++){

            //Set the current button to be disabled
            buttons[disabledButtonIndex].setEnabled(false);
        }
    }
}
