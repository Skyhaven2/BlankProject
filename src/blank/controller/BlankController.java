package blank.controller;

import javax.swing.JOptionPane;

public class BlankController
{
	private boolean isItRed = false;
	private int value = 1;
	
	public void start()
	{
		String result = "";
		JOptionPane.showMessageDialog(null, "hi");
		
		while(!isItRed)
		{
			result = JOptionPane.showInputDialog(null, "Red or Blue?");
			
			if(result.equalsIgnoreCase("Red"))
			{
				isItRed = true;
			}
		}
		
		while(value>0)
		{
			result = JOptionPane.showInputDialog(null, "Add one or subtract one?");
			
			if(result.equalsIgnoreCase("subtract"))
			{
				value--;
				JOptionPane.showMessageDialog(null, value);
			}
			
			else
			{
				value++;
				JOptionPane.showMessageDialog(null, value);
			}
		}
		
		for(value=10; value>0; value--)
		{
			JOptionPane.showMessageDialog(null, value);
		}
		
		for(value=5; value>0; value--)
		{
			result = JOptionPane.showInputDialog(null, "Talk to me");
			JOptionPane.showMessageDialog(null, result + " is stupid.");
		}
		
		JOptionPane.showMessageDialog(null, "You porbably hate me now");
		
	}
}
