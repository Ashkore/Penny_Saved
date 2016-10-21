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

public class UpdateGUI 
{

	private JFrame frame;
	private JTextField amountTextField;
	private JTextField Idtextfield;

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
					UpdateGUI window = new UpdateGUI();
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
	public UpdateGUI() {
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
		
		JLabel heading = new JLabel("Update Transaction");
		heading.setBounds(162, 6, 132, 16);
		frame.getContentPane().add(heading);
		
		JComboBox dayOfWeekCombo = new JComboBox();
		dayOfWeekCombo.setBounds(316, 93, 117, 27);
		dayOfWeekCombo.addItem("MONDAY");
		dayOfWeekCombo.addItem("TUESDAY");
		dayOfWeekCombo.addItem("WEDNESDAY");
		dayOfWeekCombo.addItem("THURSDAY");
		dayOfWeekCombo.addItem("FRIDAY");
		dayOfWeekCombo.addItem("SATURDAY");
		dayOfWeekCombo.addItem("SUNDAY");
		frame.getContentPane().add(dayOfWeekCombo);
		
		JLabel lblDayOfWeek = new JLabel("Day of Week");
		lblDayOfWeek.setBounds(226, 97, 78, 16);
		frame.getContentPane().add(lblDayOfWeek);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(29, 92, 78, 16);
		frame.getContentPane().add(lblTime);
		
		SpinnerDateModel model = new SpinnerDateModel();
		model.setCalendarField(Calendar.MINUTE);

		JSpinner dateSpinner= new JSpinner();
		dateSpinner.setModel(model);
		dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, "h:mm a"));
		dateSpinner.setBounds(71,87,107,33);
		frame.getContentPane().add(dateSpinner);
		
		JRadioButton rdbtnRevenue = new JRadioButton("Revenue");
		rdbtnRevenue.setBounds(27, 147, 141, 23);
		frame.getContentPane().add(rdbtnRevenue);
		
		JRadioButton rdbtnExpense = new JRadioButton("Expense");
		rdbtnExpense.setBounds(27, 182, 141, 23);
		frame.getContentPane().add(rdbtnExpense);
		
		ButtonGroup transType = new ButtonGroup();
		transType.add(rdbtnRevenue);
		transType.add(rdbtnExpense);
		
		amountTextField = new JTextField();
		amountTextField.setBounds(304, 147, 107, 26);
		frame.getContentPane().add(amountTextField);
		amountTextField.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(249, 152, 61, 16);
		frame.getContentPane().add(lblAmount);
		
		JEditorPane descriptionPane = new JEditorPane();
		descriptionPane.setBounds(314, 182, 100, 38);
		frame.getContentPane().add(descriptionPane);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(224, 186, 78, 16);
		frame.getContentPane().add(lblDescription);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(177, 230, 117, 29);
		frame.getContentPane().add(btnSave);
		btnSave.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel labelID = new JLabel("ID");
		labelID.setBounds(30, 44, 61, 16);
		frame.getContentPane().add(labelID);
		
		Idtextfield = new JTextField();
		Idtextfield.setBounds(58, 39, 130, 26);
		frame.getContentPane().add(Idtextfield);
		Idtextfield.setColumns(10);
		
	}
}
