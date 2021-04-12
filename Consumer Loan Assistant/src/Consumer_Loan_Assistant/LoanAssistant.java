package Consumer_Loan_Assistant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoanAssistant extends JFrame {

	private static final long serialVersionUID = 1L;

	JLabel balanceLabel = new JLabel();
	JLabel interestLabel = new JLabel();
	JLabel paymentLabel = new JLabel();
	JLabel monthsLabel = new JLabel();
	JLabel analysisLabel = new JLabel();

	JTextField balanceField = new JTextField();
	JTextField interestField = new JTextField();
	JTextField monthField = new JTextField();
	JTextField paymentField = new JTextField();

	JButton computeButton = new JButton();
	JButton loanButton = new JButton();
	JButton monthsButton = new JButton();
	JButton paymentButton = new JButton();
	JButton exitButton = new JButton();

	JTextArea analysisArea = new JTextArea();

	Font myFont = new Font("Arial", Font.PLAIN, 16);
	Color lightYellow = new Color(255, 255, 255, 128);
	boolean computePayment;

	public static void main(String[] args) {
		new LoanAssistant();
	}

	public LoanAssistant() {
		setVisible(true);
		setTitle("Loan Assistant");
		setResizable(false);
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints constraints;

		// Loan Balance Label and Text Field

		balanceLabel.setText("Loan Balance");
		balanceLabel.setFont(myFont);
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 0, 0);
		getContentPane().add(balanceLabel, constraints);

		balanceField.setPreferredSize(new Dimension(100, 25));
		balanceField.setHorizontalAlignment(SwingConstants.LEFT);
		balanceField.setFont(myFont);
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.insets = new Insets(10, 10, 0, 10);
		getContentPane().add(balanceField, constraints);
		balanceField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balanceTextFieldActionPerformed(e);
			}
		});

		// Interest Rate Label and Text Field

		interestLabel = new JLabel();
		interestLabel.setText("Interest Rate");
		interestLabel.setFont(myFont);
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 0, 0);
		getContentPane().add(interestLabel, constraints);

		interestField = new JTextField();
		interestField.setPreferredSize(new Dimension(100, 25));
		interestField.setFont(myFont);
		interestField.setHorizontalAlignment(SwingConstants.LEFT);
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.insets = new Insets(10, 10, 0, 10);
		add(interestField, constraints);
		interestField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				interestFieldActionPerformed(e);

			}
		});

		// Number of Payment Label and Text Field

		paymentLabel.setText("Number of Payments");
		paymentLabel.setFont(myFont);
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 0, 0);
		getContentPane().add(paymentLabel, constraints);

		paymentField.setPreferredSize(new Dimension(100, 25));
		paymentField.setHorizontalAlignment(SwingConstants.LEFT);
		paymentField.setFont(myFont);
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.insets = new Insets(10, 10, 0, 10);
		getContentPane().add(paymentField, constraints);
		paymentField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymentFieldActionPerformed(e);
			}
		});

		// Monthly Payment Label and Text Field

		monthsLabel.setText("Monthly Payment");
		monthsLabel.setFont(myFont);
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 0, 0);
		getContentPane().add(monthsLabel, constraints);
	
		monthField.setPreferredSize(new Dimension(100, 25));
		monthField.setHorizontalAlignment(SwingConstants.LEFT);
		monthField.setFont(myFont);
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.insets = new Insets(10, 10, 0, 10);
		getContentPane().add(monthField, constraints);
		monthField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monthsFieldActionPerformed(e);
			}
		});

	// Compute Monthly Payment Button

		computeButton.setText("Compute Monthly Payment");
		computeButton.setFocusable(false);
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = 2;
		constraints.insets = new Insets(10,0,0,0);
		getContentPane().add(computeButton, constraints);
		computeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				computeButtonActionPerformed(e);
			}
		});

		loanButton.setText("New Loan Analysis");
		loanButton.setFocusable(false);
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.gridwidth = 2;
		constraints.insets = new Insets(10,0,10,0);
		getContentPane().add(loanButton, constraints);
		loanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loanButtonActionPerformed(e);
			}
		});

			
		paymentButton.setText("X");
		paymentButton.setFocusable(false);
		constraints = new GridBagConstraints();
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.insets = new Insets(10,0,0,0);
		getContentPane().add(paymentButton, constraints);
		paymentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymentButtonActionPerformed(e);
			}
		});


		monthsButton.setText("X");
		monthsButton.setFocusable(false);
		constraints = new GridBagConstraints();
		constraints.gridx = 2;
		constraints.gridy = 3;
		constraints.insets = new Insets(10,0,0,0);
		getContentPane().add(monthsButton, constraints);
		monthsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monthsButtonActionPerformed(e);
			}
		});


		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	

	protected void monthsButtonActionPerformed(ActionEvent e) {
	}

	protected void paymentButtonActionPerformed(ActionEvent e) {}
	
	protected void computeButtonActionPerformed(ActionEvent e) {}

	protected void loanButtonActionPerformed(ActionEvent e)  {}

	protected void balanceTextFieldActionPerformed(ActionEvent e) {}

	protected void interestFieldActionPerformed(ActionEvent e) {}

	protected void paymentFieldActionPerformed(ActionEvent e) {}

	protected void monthsFieldActionPerformed(ActionEvent e) {}



}