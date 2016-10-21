package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;

public class RemoveGUI 
{

	private JFrame frame;
	private JTextField amountTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					RemoveGUI window = new RemoveGUI();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RemoveGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel heading = new JLabel("Delete Transaction");
		heading.setBounds(177, 6, 125, 16);
		frame.getContentPane().add(heading);
		
		amountTextField = new JTextField();
		amountTextField.setBounds(204, 77, 107, 26);
		frame.getContentPane().add(amountTextField);
		amountTextField.setColumns(10);
		
		JLabel lblAmount = new JLabel("ID");
		lblAmount.setBounds(176, 82, 61, 16);
		frame.getContentPane().add(lblAmount);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(177, 230, 117, 29);
		frame.getContentPane().add(btnDelete);
		btnDelete.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
			}
		}); 
		
	}
}

