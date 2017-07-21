import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener
{
   JTextField upperLeft = new JTextField(10);
   JTextField upperCenter = new JTextField(10);
   JTextField upperRight = new JTextField(10);
   
   JTextField centerLeft = new JTextField(10);
   JTextField centerCenter = new JTextField(10);
   JTextField centerRight = new JTextField(10);
   
   JTextField lowerLeft = new JTextField(10);
   JTextField lowerCenter = new JTextField(10);
   JTextField lowerRight = new JTextField(10);
   
   JButton doneButton = new JButton("Done with turn");
   JButton quitButton = new JButton("Quit");
   JButton clearButton = new JButton("Clear Board");
   
   
   public static void main(String [] args)
   {
      new TicTacToe();
   }
   
   public TicTacToe()
   {
      //set the size of the frame
      setSize(400,400);
      
      //set location on startup
      setLocation(100,200);
      
      //set the title
      setTitle("X's and O's");
      
      //create new JPanel
      JPanel jp = new JPanel(new GridLayout(3,3));
      JPanel jpFinished = new JPanel(new GridLayout(1,3));
      
      Font font = new Font("Courier", Font.PLAIN, 100);
               
      //set font for JTextField
      upperLeft.setFont(font);
      upperLeft.setHorizontalAlignment(JTextField.CENTER);
      
      upperCenter.setFont(font);
      upperCenter.setHorizontalAlignment(JTextField.CENTER);
      
      upperRight.setFont(font);
      upperRight.setHorizontalAlignment(JTextField.CENTER);
      
      centerLeft.setFont(font);
      centerLeft.setHorizontalAlignment(JTextField.CENTER);
      
      centerCenter.setFont(font);
      centerCenter.setHorizontalAlignment(JTextField.CENTER);
      
      centerRight.setFont(font);
      centerRight.setHorizontalAlignment(JTextField.CENTER);
      
      lowerLeft.setFont(font);
      lowerLeft.setHorizontalAlignment(JTextField.CENTER);
      
      lowerCenter.setFont(font);
      lowerCenter.setHorizontalAlignment(JTextField.CENTER);
      
      lowerRight.setFont(font);
      lowerRight.setHorizontalAlignment(JTextField.CENTER);
      
      //add features to frame
      jp.add(upperLeft);
      jp.add(upperCenter);
      jp.add(upperRight);
      jp.add(centerLeft);
      jp.add(centerCenter);
      jp.add(centerRight);
      jp.add(lowerLeft);
      jp.add(lowerCenter);
      jp.add(lowerRight);
      
      jpFinished.add(doneButton);
      jpFinished.add(clearButton);
      jpFinished.add(quitButton);
      
      
      quitButton.addActionListener(this);
      doneButton.addActionListener(this);
      clearButton.addActionListener(this);
      
      add(jp, BorderLayout.CENTER);
      add(jpFinished, BorderLayout.SOUTH);
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      }
      
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getSource() == quitButton)
         {
            this.dispose();
         }
         else if(ae.getSource() == clearButton)
         {
            upperLeft.setText("");
            upperCenter.setText(null);
            upperRight.setText(null);
            centerLeft.setText(null);
            centerCenter.setText(null);
            centerRight.setText(null);
            lowerLeft.setText(null);
            lowerCenter.setText(null);
            lowerRight.setText(null);
         }
         else if(ae.getSource() == doneButton && upperLeft.getText().equals("x") || upperCenter.getText().equals("x") || upperRight.getText().equals("x") || centerLeft.getText().equals("x") || centerCenter.getText().equals("x") || centerRight.getText().equals("x") || lowerLeft.getText().equals("x") || lowerCenter.getText().equals("x"))
         {
            lowerRight.setText("o");  
         }
         else if(ae.getSource() == doneButton && lowerRight.getText().equals("x"))
         {
            upperLeft.setText("o");
         }
      }
      
}