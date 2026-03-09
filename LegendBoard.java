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
 *  |                          LegendBoard                      |
 *  |-----------------------------------------------------------|
 *  |      Responsibilities         |   Collaborating Classes   |
 *  |-------------------------------+---------------------------|
 *  |     Inform what buttons do    |                           |
 *  |                               |       TreasureGame        |
 *  |                               |                           |
 *  |     Shows legend board        |                           |
 *  |                               |                           |
 *  |-------------------------------+---------------------------|
 */
public class LegendBoard extends JPanel{
    //Creating variables
    private ImageIcon holeIcon = new ImageIcon("hole.jpg");         //Create hold icon
    private ImageIcon sandIcon = new ImageIcon("sand.jpg");         //Create sand icon 
    private ImageIcon goldIcon = new ImageIcon("gold.jpg");         //Create gold icon 
    private ImageIcon trollIcon = new ImageIcon("troll.jpg");       //Create troll icon 
    /**
     * Purpose: Constructor for objects of class legendBoard
     * signature: nothing 
     * example: LegendBoard()
     */
    public LegendBoard(){
        //Panel for whole legend
        JPanel legendPanel = new JPanel();
        
        //Panel for clicked buttons
        JPanel clickedPanel = new JPanel();

        //Panels for each label
        JPanel sandPanel = new JPanel();
        JPanel treasurePanel = new JPanel();
        JPanel trollPanel = new JPanel();
        JPanel holePanel = new JPanel();

        //Create new border layouts for each panel
        clickedPanel.setLayout(new BorderLayout());
        legendPanel.setLayout(new BorderLayout());
        sandPanel.setLayout(new BorderLayout());
        treasurePanel.setLayout(new BorderLayout());
        trollPanel.setLayout(new BorderLayout());
        holePanel.setLayout(new BorderLayout());

        //Create Legend labels, and set the font to "Comic Sans MS" size 15
        JLabel title = new JLabel("LEGEND");
        title.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        title.setHorizontalAlignment(JLabel.CENTER);

        JLabel sandLabel = new JLabel("SAND: ");
        sandLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));

        JLabel treasureLabel = new JLabel("TREASURE: ");
        treasureLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));

        JLabel trollLabel = new JLabel("TROLL: ");
        trollLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));

        JLabel holeLabel = new JLabel("HOLE: ");
        holeLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));

        //Create image labels
        JLabel sandImage = new JLabel();
        JLabel treasureImage = new JLabel();
        JLabel trollImage = new JLabel();
        JLabel holeImage = new JLabel();

        //Resizing images 70, 70
        holeIcon = new ImageIcon(holeIcon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        sandIcon= new ImageIcon(sandIcon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        trollIcon = new ImageIcon(trollIcon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        goldIcon = new ImageIcon(goldIcon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));

        //Set images to image icon
        sandImage.setIcon(sandIcon);
        treasureImage.setIcon(goldIcon);
        trollImage.setIcon(trollIcon);
        holeImage.setIcon(holeIcon);  

        //Add sandLabel to sandPanel to the west
        sandPanel.add(sandLabel, BorderLayout.WEST);

        //Add sandImage to the sandPanel to the east
        sandPanel.add(sandImage, BorderLayout.EAST);

        //Set the sandPanel to the color pink
        sandPanel.setBackground(Color.PINK);

        //Add the treasureLabel to the treasurePanel to the west
        treasurePanel.add(treasureLabel, BorderLayout.WEST);

        //Add the treasureImage to treasurePanel to the east 
        treasurePanel.add(treasureImage, BorderLayout.EAST);

        //Set the treasure panel to the color pink
        treasurePanel.setBackground(Color.PINK);

        //Add the trollLabel to the trollPanel to the west
        trollPanel.add(trollLabel, BorderLayout.WEST);

        //Add the trollImage to the trollPanel to the east
        trollPanel.add(trollImage, BorderLayout.EAST);

        //Set the trollPanel to the color pink
        trollPanel.setBackground(Color.PINK);

        //Add the holeLabel to the holePanel to the west
        holePanel.add(holeLabel, BorderLayout.WEST);

        //Add the holeImage to the holePanel to the east.
        holePanel.add(holeImage, BorderLayout.EAST);

        //Set the holePanel to the color pink
        holePanel.setBackground(Color.PINK);

        //Add the holePanel, treasurePanel, and the trollPanel to the clicked panel
        clickedPanel.add(holePanel, BorderLayout.NORTH);
        clickedPanel.add(treasurePanel, BorderLayout.CENTER);
        clickedPanel.add(trollPanel, BorderLayout.SOUTH);

        //Add the panels to the legendPanel      
        legendPanel.add(title, BorderLayout.NORTH);
        legendPanel.add(sandPanel, BorderLayout.CENTER);
        legendPanel.add(clickedPanel, BorderLayout.SOUTH);
        legendPanel.setBackground(Color.YELLOW);

        //Add legendPanel
        add(legendPanel);
    }
}
