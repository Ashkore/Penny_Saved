package GUI;

import java.awt.EventQueue;
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

public class TransactionGUI 
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
					TransactionGUI window = new TransactionGUI();
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
	public TransactionGUI() {
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
		
		JLabel heading = new JLabel("New Transaction");
		heading.setBounds(177, 6, 117, 16);
		frame.getContentPane().add(heading);
		
		JComboBox dayOfWeekCombo = new JComboBox();
		dayOfWeekCombo.setBounds(314, 40, 117, 27);
		dayOfWeekCombo.addItem("MONDAY");
		dayOfWeekCombo.addItem("TUESDAY");
		dayOfWeekCombo.addItem("WEDNESDAY");
		dayOfWeekCombo.addItem("THURSDAY");
		dayOfWeekCombo.addItem("FRIDAY");
		dayOfWeekCombo.addItem("SATURDAY");
		dayOfWeekCombo.addItem("SUNDAY");
		frame.getContentPane().add(dayOfWeekCombo);
		
		JLabel lblDayOfWeek = new JLabel("Day of Week");
		lblDayOfWeek.setBounds(224, 44, 78, 16);
		frame.getContentPane().add(lblDayOfWeek);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(27, 39, 78, 16);
		frame.getContentPane().add(lblTime);
		
		SpinnerDateModel model = new SpinnerDateModel();
		model.setCalendarField(Calendar.MINUTE);

		JSpinner dateSpinner= new JSpinner();
		dateSpinner.setModel(model);
		dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, "h:mm a"));
		dateSpinner.setBounds(69,34,107,33);
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
		
	}
}
