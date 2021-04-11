package Loan_Assistant;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.InsetsUIResource;

import java.awt.event.*;
import java.awt.*;

public class LoanAssistant extends JFrame {	
	
	private static final long serialVersionUID = 1L;

	JLabel balanceLabel = new JLabel();
	JLabel interestLabel = new JLabel();
	JLabel paymentLabel = new JLabel();
	JLabel monthsLabel = new JLabel();
	JLabel analysisLabel = new JLabel();

	JTextField balanceField = new JTextField();
	JTextField interestField = new JTextField();
	JTextField montField = new JTextField();
	JTextField paymentField = new JTextField();

	JButton computeButton = new JButton();
	JButton newLoanButton = new JButton();
	JButton monthsButton = new JButton();
	JButton paymentButton = new JButton();
	JButton exitButton = new JButton();

	JTextArea analysisArea = new JTextArea();

	Font myFont = new Font("Arial",Font.PLAIN,16);
	Color lightYellow = new Color(255,255,255,128);
	boolean computePayment;

	 public static void main(String[] args) {
		 new LoanAssistant();
	 }

	 public LoanAssistant() {

		setTitle("Loan Assistant");
		setVisible(true);
		setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		balanceField.setHorizontalAlignment(SwingConstants.RIGHT);
		balanceField.setFont(myFont);
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.insets = new Insets(10, 10, 0, 10);
		getContentPane().add(balanceField, constraints);
		balanceField.addActionListener(new ActionListener (){
		public void actionPerformed(ActionEvent e){
			balanceTextFieldActionPerformed(e);
		}});	
	

	// Interest Rate Label and Text Field		

		interestLabel = new JLabel();
		interestLabel.setText("Interest Rate");
		interestLabel.setFont(myFont);
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(100, 10, 00, 10);
		getContentPane().add(interestLabel,constraints);

		interestField = new JTextField();
		interestField.setPreferredSize(new Dimension(100,25));
		interestField.setFont(myFont);
		interestField.setHorizontalAlignment(SwingConstants.LEFT);
		constraints = new GridBagConstraints();
		constraints.gridx =0;
		constraints.gridy =1;
		constraints.insets = new Insets(10, 10, 0, 10);
		add(interestField,constraints);
		interestField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				interestFieldActionPerformed(e);
				
			}
		});

	// Number of  Payment Label and Text Field
	
		paymentLabel.setText("Number of Payments");
		paymentLabel.setFont(myFont);
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new InsetsUIResource(10, 10, 0, 0);
		getContentPane().add(paymentLabel,constraints);

		paymentField.setPreferredSize(new Dimension(100,25));
		paymentField.setHorizontalAlignment(SwingConstants.RIGHT);
		paymentField.setFont(myFont);
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.insets = new Insets(10,10,0,0);
		getContentPane().add(paymentField,constraints);
		paymentField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymentFieldActionPerformed(e);
			}
		});

	}
	protected void balanceTextFieldActionPerformed(ActionEvent e) {}
	protected void interestFieldActionPerformed(ActionEvent e) {}
    protected void paymentFieldActionPerformed(ActionEvent e) {}
} 