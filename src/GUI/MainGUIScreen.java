package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

import CRUD.CRUD_Transaction;
import Resources.GlobalUtils;

public class MainGUIScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUIScreen window = new MainGUIScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainGUIScreen() {
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 438, 266);
		frame.getContentPane().add(tabbedPane);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel createTransaction = new JPanel();
		createTransaction.setToolTipText("");
		tabbedPane.addTab("Create", null, createTransaction, null);
		
		JLabel heading = new JLabel("New Transaction");
		heading.setBounds(177, 6, 117, 16);
		createTransaction.add(heading);
		createTransaction.setLayout(null);
		
		JComboBox dayOfWeekCombo = new JComboBox();
		dayOfWeekCombo.setBounds(44, 56, 135, 27);
		dayOfWeekCombo.addItem("MONDAY");
		dayOfWeekCombo.addItem("TUESDAY");
		dayOfWeekCombo.addItem("WEDNESDAY");
		dayOfWeekCombo.addItem("THURSDAY");
		dayOfWeekCombo.addItem("FRIDAY");
		dayOfWeekCombo.addItem("SATURDAY");
		dayOfWeekCombo.addItem("SUNDAY");
		createTransaction.add(dayOfWeekCombo);
		
		JLabel lblDayOfWeek = new JLabel("Day of Week");
		lblDayOfWeek.setBounds(48, 39, 78, 16);
		createTransaction.add(lblDayOfWeek);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(258, 39, 31, 16);
		createTransaction.add(lblTime);
		
		SpinnerDateModel model = new SpinnerDateModel();
		model.setCalendarField(Calendar.MINUTE);

		JSpinner dateSpinner= new JSpinner();
		dateSpinner.setModel(model);
		dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, "h:mm a"));
		dateSpinner.setBounds(294,34,85,26);
		createTransaction.add(dateSpinner);
		
		JRadioButton rdbtnRevenue = new JRadioButton("Revenue");
		rdbtnRevenue.setBounds(6, 89, 84, 23);
		createTransaction.add(rdbtnRevenue);
		
		JRadioButton rdbtnExpense = new JRadioButton("Expense");
		rdbtnExpense.setBounds(6, 116, 84, 23);
		createTransaction.add(rdbtnExpense);
		
		ButtonGroup transType = new ButtonGroup();
		transType.add(rdbtnRevenue);
		transType.add(rdbtnExpense);
		
		JTextField amountTextField = new JTextField();
		amountTextField.setBounds(239, 119, 107, 26);
		createTransaction.add(amountTextField);
		amountTextField.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(184, 94, 50, 16);
		createTransaction.add(lblAmount);
		
		JEditorPane descriptionPane = new JEditorPane();
		descriptionPane.setBounds(239, 94, 100, 16);
		createTransaction.add(descriptionPane);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(166, 121, 73, 16);
		createTransaction.add(lblDescription);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(169, 181, 117, 29);
		createTransaction.add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CRUD_Transaction CRUD = new CRUD_Transaction();
				CRUD.Create(dayOfWeekCombo.getSelectedItem().toString(), rdbtnExpense.getText(), dateSpinner.getValue().toString(), descriptionPane.getText(), Float.parseFloat(amountTextField.getText()));
				System.out.println(GlobalUtils.getInstance().getAllTransactions().toString());
			}
		}
		);
	
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel updateTransaction = new JPanel();
		tabbedPane.addTab("Update", null, updateTransaction, null);
		updateTransaction.setLayout(null);
		
		JLabel heading2 = new JLabel("Update Transaction");
		heading2.setBounds(162, 6, 132, 16);
		updateTransaction.add(heading2);
		
		JComboBox dayOfWeekCombo2 = new JComboBox();
		dayOfWeekCombo2.setBounds(304, 78, 117, 27);
		dayOfWeekCombo2.addItem("MONDAY");
		dayOfWeekCombo2.addItem("TUESDAY");
		dayOfWeekCombo2.addItem("WEDNESDAY");
		dayOfWeekCombo2.addItem("THURSDAY");
		dayOfWeekCombo2.addItem("FRIDAY");
		dayOfWeekCombo2.addItem("SATURDAY");
		dayOfWeekCombo2.addItem("SUNDAY");
		updateTransaction.add(dayOfWeekCombo2);
		
		JLabel lblDayOfWeek2 = new JLabel("Day of Week");
		lblDayOfWeek2.setBounds(224, 82, 78, 16);
		updateTransaction.add(lblDayOfWeek2);
		
		JLabel lblTime2 = new JLabel("Time");
		lblTime2.setBounds(27, 77, 78, 16);
		updateTransaction.add(lblTime2);
		
		SpinnerDateModel model2 = new SpinnerDateModel();
		model2.setCalendarField(Calendar.MINUTE);

		JSpinner dateSpinner2= new JSpinner();
		dateSpinner2.setModel(model2);
		dateSpinner2.setEditor(new JSpinner.DateEditor(dateSpinner, "h:mm a"));
		dateSpinner2.setBounds(69,72,107,33);
		updateTransaction.add(dateSpinner2);
		
		JRadioButton rdbtnRevenue2 = new JRadioButton("Revenue");
		rdbtnRevenue2.setBounds(27, 110, 141, 23);
		updateTransaction.add(rdbtnRevenue2);
		
		JRadioButton rdbtnExpense2 = new JRadioButton("Expense");
		rdbtnExpense2.setBounds(27, 145, 141, 23);
		updateTransaction.add(rdbtnExpense2);
		
		ButtonGroup transType2 = new ButtonGroup();
		transType2.add(rdbtnRevenue2);
		transType2.add(rdbtnExpense2);
		
		JTextField amountTextField2 = new JTextField();
		amountTextField2.setBounds(304, 110, 107, 26);
		updateTransaction.add(amountTextField2);
		amountTextField2.setColumns(10);
		
		JLabel lblAmount2 = new JLabel("Amount");
		lblAmount2.setBounds(249, 115, 61, 16);
		updateTransaction.add(lblAmount2);
		
		JEditorPane descriptionPane2 = new JEditorPane();
		descriptionPane2.setBounds(304, 145, 100, 38);
		updateTransaction.add(descriptionPane2);
		
		JLabel lblDescription2 = new JLabel("Description");
		lblDescription2.setBounds(224, 149, 78, 16);
		updateTransaction.add(lblDescription2);
		
		JButton btnSave2 = new JButton("Save");
		btnSave2.setBounds(162, 185, 117, 29);
		updateTransaction.add(btnSave2);
		btnSave2.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel labelID2 = new JLabel("ID");
		labelID2.setBounds(30, 44, 61, 16);
		updateTransaction.add(labelID2);
		
		JTextField Idtextfield2 = new JTextField();
		Idtextfield2.setBounds(58, 39, 130, 26);
		updateTransaction.add(Idtextfield2);
		Idtextfield2.setColumns(10);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel deleteTransaction = new JPanel();
		tabbedPane.addTab("Delete", null, deleteTransaction, null);
		deleteTransaction.setLayout(null);
		
		JLabel heading3 = new JLabel("Delete Transaction");
		heading3.setBounds(177, 6, 125, 16);
		deleteTransaction.add(heading3);
		
		JTextField amountTextField3 = new JTextField();
		amountTextField3.setBounds(190, 57, 107, 26);
		deleteTransaction.add(amountTextField3);
		amountTextField3.setColumns(10);
		
		JLabel lblAmount3 = new JLabel("ID");
		lblAmount3.setBounds(162, 62, 61, 16);
		deleteTransaction.add(lblAmount3);
		
		JButton btnDelete3 = new JButton("Delete");
		btnDelete3.setBounds(185, 148, 117, 29);
		deleteTransaction.add(btnDelete3);
		btnDelete3.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
			}
		}); 
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel viewTransactions = new JPanel();
		tabbedPane.addTab("View All", null, viewTransactions, null);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel weeklySumTransaction = new JPanel();
		tabbedPane.addTab("Weekly Summary", null, weeklySumTransaction, null);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}
}
