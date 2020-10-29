import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JTextField nameField;
  JLabel outputLabel;
  JButton helloButton;

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Hello Person!");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
 

    //initialize class variables
    mainPanel = new JPanel();

    nameField = new JTextField("");
    outputLabel = new JLabel("");
    helloButton = new JButton("Say Hello");

    //add action listeners
    helloButton.addActionListener(this);

    //turn on manual layout
    mainPanel.setLayout(null);

    //set class variable size & layout
    nameField.setBounds(250, 80, 300, 30);
    outputLabel.setBounds(250, 170, 300, 40);
    helloButton.setBounds(350, 260, 100, 30);

    //add the class variables to the main panel
    mainPanel.add(nameField);
    mainPanel.add(outputLabel);
    mainPanel.add(helloButton);

    //add the main panel to the JFrame
    frame.add(mainPanel);

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    //store the inputted name in a variable
    String name = nameField.getText();

    //make the label say hello to that name
    outputLabel.setText("Hello " + name);
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
