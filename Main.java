import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
public class Main implements ActionListener {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel();
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.weightx = 0.2;
		
		JLabel charNameLabel = new JLabel("Character Name: ");
		c.gridx = 0;
		c.gridy = 0;
		pane.add(charNameLabel, c);		
		
		JTextField charNameText = new JTextField(40);
		c.gridx = 1;
		c.gridy = 0;
		pane.add(charNameText, c);
		
		JLabel charClass = new JLabel("Class: ");
		c.gridx = 2;
		c.gridy = 0;
		pane.add(charClass, c);
		
		JTextField charClassText = new JTextField(15);
		c.gridx = 3;
		c.gridy = 0;
		pane.add(charClassText, c);
		
		JLabel charBackground = new JLabel("Background: ");
		c.gridx = 4;
		c.gridy = 0;
		pane.add(charBackground, c);
		
		JTextField charBackgroundText = new JTextField(15);
		c.gridx = 5;
		c.gridy = 0;
		pane.add(charBackgroundText, c);		
		
		JLabel playerName = new JLabel("Player Name: ");
		c.gridx = 6;
		c.gridy = 0;
		pane.add(playerName, c);		
		
		JTextField playerNameText = new JTextField(15);
		c.gridx = 7;
		c.gridy = 0;
		pane.add(playerNameText, c);
		
		JLabel charFaction = new JLabel("Faction");
		c.gridx = 8;
		c.gridy = 0;
		pane.add(charFaction, c);
		
		JTextField charFactionText = new JTextField(15);
		c.gridx = 9;
		c.gridy = 0;
		pane.add(charFactionText, c);
		
		
		JButton submit = new JButton("Submit");
		c.gridx = 4;
		c.gridy = 1;
		pane.add(submit, c);
		
		submit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			
				try (Writer writer = new BufferedWriter(new OutputStreamWriter(
			              new FileOutputStream("filename.txt"), "utf-8"))) {
					
			   writer.write(charNameText.getText());
			   
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
				
				
			}
			
		});

		
		

		//frame.setSize(1280, 720);
		frame.add(pane);
		frame.pack();
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
