import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Frame extends JFrame implements ActionListener
{
	String [] s= {"Luca", "Matteo", "Davide"};
	
	Font fontt= new Font("Bodoni MT", Font.PLAIN, 18);
	Font font= new Font("Bodoni MT", Font.PLAIN, 25); 
	Font fonttt= new Font("Bodoni MT", Font.PLAIN, 12); 
	
	JButton sorteggia= new JButton ("Sorteggia");
	JButton cancella= new JButton ("Cancella");


	JLabel label0= new JLabel ("Sorteggio Parola");
	JLabel label1= new JLabel ("Parola Sorteggiata: ");
	JLabel label= new JLabel ("");
		
	JTextArea a= new JTextArea(4,15);
	
	public Frame() 
	{
		super("Frame");
	
		setSize (300, 200);
		Container cont= this.getContentPane();
			
		cont.add(sorteggia);
		sorteggia.setFont(fonttt);
		sorteggia.setBounds(30,120, 100, 40);
			
		cont.add(cancella);
		cancella.setFont(fonttt);
		cancella.setBounds(170,120, 100, 40);
			
		cont.add(label0);
		label0.setBounds(40, 10, 250, 50);
		label0.setFont(font);
			
		cont.add(label1);
		label1.setBounds(30, 70,200, 40);
		label1.setFont(fontt);
		cont.add(a);
		a.setBounds(200,83 ,65, 20);
		a.setFont(fontt);
			
		sorteggia.addActionListener(this);
		cancella.addActionListener(this);
			
		cont.add(label);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sorteggia) 
		{
			int n=(int)(0+(Math.random()*3));
			a.setText(s[n]);
		}
		else if (e.getSource() == cancella) 
		{
			a.setText("");
		}	
	}
}
