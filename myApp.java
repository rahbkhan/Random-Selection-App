import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class myApp implements ActionListener {
	// Declare all of the necessary objects.
	JFrame frame;
	JPanel panelTop,panelMid,panelBottom;
	JButton Submit, Cancel;
	JLabel winner1, winner2, Daniel1, Robert2, Jason3, Eric4, Brent5;
	JTextField txtUsername, txtPassword;
	
	
	//Variables for each worker at CFFT
	String Daniel="1";
	String Robert="2";
	String Jason="3";
	String Eric="4";
	String Brent="5";
	
	//Variable that starts the while-loop
	String go="no";
	
	//random int that is converted into a string and then stored here.
	String Option1="empty";
	String Option2="empty";
	
	//Final display of the lucky winner!!
	String Lucky1;
	String Lucky2;
	
	//Temp variable for placing the int that is randomly generated
	int temp1;
	int temp2;
	
	
	public myApp()
	{
		// create the layout of the panels.
		GridLayout layout = new GridLayout(0, 2);
		FlowLayout flow= new FlowLayout();
		panelTop = new JPanel();
		panelTop.setLayout(flow);
		
		panelMid = new JPanel();
		panelMid.setLayout(layout);
		
		panelBottom = new JPanel();
		panelBottom.setLayout(layout);
		
		// Create all of the necessary labels.
		Daniel1 = new JLabel("1-Daniel:", JLabel.CENTER);
		Daniel1.setHorizontalAlignment(SwingConstants.CENTER);
		Robert2 = new JLabel("2-Robert:", JLabel.CENTER);
		Robert2.setHorizontalAlignment(SwingConstants.CENTER);
		Jason3 = new JLabel("3-Jason:", JLabel.CENTER);
		Jason3.setHorizontalAlignment(SwingConstants.CENTER);
		Eric4 = new JLabel("4-Eric:", JLabel.CENTER);
		Eric4.setHorizontalAlignment(SwingConstants.CENTER);
		Brent5 = new JLabel("5-Brent:", JLabel.CENTER);
		Brent5.setHorizontalAlignment(SwingConstants.CENTER);
		
		winner1 = new JLabel("Winner 1", JLabel.CENTER);
		winner1.setHorizontalAlignment(SwingConstants.CENTER);
		winner2 = new JLabel("Winner 2", JLabel.CENTER);
		winner2.setHorizontalAlignment(SwingConstants.CENTER);
		
		panelTop.add(Daniel1);
		panelTop.add(Robert2);
		panelTop.add(Jason3);
		panelTop.add(Eric4);
		panelTop.add(Brent5);
		
		panelMid.add(winner1);
		panelMid.add(winner2);
		
		
		
		// Create the buttons and then add them to the panel.
				Submit = new JButton("Generate");
				Submit.addActionListener(this);
				Submit.setHorizontalAlignment(SwingConstants.CENTER);
				panelBottom.add(Submit, BorderLayout.SOUTH);

				Cancel = new JButton("Retry");
				Cancel.addActionListener(this);
				Cancel.setHorizontalAlignment(SwingConstants.CENTER);
				panelBottom.add(Cancel, BorderLayout.SOUTH);
				
				// Create the frame and add the panel to it.
				frame = new JFrame("Welcome");

				frame.add(panelTop, BorderLayout.CENTER);
				frame.add(panelMid, BorderLayout.CENTER);
				frame.add(panelBottom, BorderLayout.CENTER);

				frame.pack();

				// Format the frame and then display it.
				frame.setSize(300, 300);
				frame.setLayout(new GridLayout(0,1));
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
				
	}
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		new myApp();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() instanceof JButton) {
			if (e.getSource() == Submit) {
				//System.out.println("Submit was clicked");
				Random selection= new Random();
				while(go=="no")
				{
					 temp1= 1+selection.nextInt(5);
					 temp2= 1+selection.nextInt(5);
					
					if(temp1!=temp2)
					{
					go="yes";
					}
				}
				Option1= Integer.toString(temp1);
				Option2= Integer.toString(temp2);
				
				//System.out.println(Option1);
				
				//System.out.println(Option2);
				
				//Makes a selection for the first field
				if(Option1.equals(Daniel))
				{
					Lucky1="Daniel";
					
					//System.out.println(Lucky1);
					winner1.setText(Lucky1);
				}
				if(Option1.equals(Robert))
				{
					Lucky1="Robert";
					//System.out.println(Lucky1);
					winner1.setText(Lucky1);
				}
				if(Option1.equals(Jason))
				{
					Lucky1="Jason";
					//System.out.println(Lucky1);
					winner1.setText(Lucky1);
				}
				if(Option1.equals(Eric))
				{
					Lucky1="Eric";
					//System.out.println(Lucky1);
					winner1.setText(Lucky1);
				}
				if(Option1.equals(Brent))
				{
					Lucky1="Brent";
					//System.out.println(Lucky1);
					winner1.setText(Lucky1);
				}
				
				//Makes a selection for the second field.
						if(Option2.equals(Daniel))
						{
							Lucky2="Daniel";
							//System.out.println(Lucky2);
							winner2.setText(Lucky2);
						}
						if(Option2.equals(Robert))
						{
							Lucky2="Robert";
							//System.out.println(Lucky2);
							winner2.setText(Lucky2);
						}
						if(Option2.equals(Jason))
						{
							Lucky2="Jason";
							//System.out.println(Lucky2);
							winner2.setText(Lucky2);
						}
						if(Option2.equals(Eric))
						{
							Lucky2="Eric";
							//System.out.println(Lucky2);
							winner2.setText(Lucky2);
						}
						if(Option2.equals(Brent))
						{
							Lucky2="Brent";
							//System.out.println(Lucky2);
							winner2.setText(Lucky2);
						}
		
			}
			if (e.getSource() == Cancel) {
				// Refreshes the window for another selection
				frame.dispose();
				new myApp();
			}
		}
	}
	
}
