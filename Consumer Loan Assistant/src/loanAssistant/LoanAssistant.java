package loanAssistant;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoanAssistant {

	public static void main(String[] args) {
		new Title_Frame();

	}
}

@SuppressWarnings("serial")
class Title_Frame extends JFrame {

	private static JLabel balanaceLabel;
	private static JLabel interestLabel;
	private static JLabel paymentLabel;
	private static JLabel monthlyLabel;

	private static JTextField balanceField;
	private static JTextField interesField;
	private static JTextField paymentField;
	private static JTextField monthField;

	private static JButton computeButton;
	private static JButton LoanButton;
	private static JButton monthsButton;
	private static JButton paymentButton;

	boolean computePayment;
	
	
	Font font =   new Font("Arial", Font.PLAIN,16);

	public Title_Frame() {

		setTitle("Loan Assistant");
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints;
		
		
		balanaceLabel = new JLabel();
		balanaceLabel.setText("Loan Balance");
		balanaceLabel.setFont(font);
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagConstraints.insets= new Insets(10, 10, 0, 0);
		getContentPane().add(balanaceLabel,gridBagConstraints);
		
		balanceField = new JTextField();
		balanceField.setPreferredSize(new Dimension(100,25));
		balanceField.setHorizontalAlignment(SwingConstants.RIGHT);
		balanceField.setFont(font);
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new Insets(10, 10, 0, 10);
		getContentPane().add(balanceField,gridBagConstraints);
		balanceField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			balanceFieldActionPeformed(e);
			}

			private void balanceFieldActionPeformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		interestLabel = new JLabel();
		interestLabel.setText("Interest Label");
		interestLabel.setFont(font);
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagConstraints.insets = new Insets(10, 10, 0, 0);
		getContentPane().add(interestLabel,gridBagConstraints);
		
		interesField = new JTextField();
		interesField.setPreferredSize(new Dimension(100,25));
		interesField.setFont(font);
		interesField.setHorizontalAlignment(SwingConstants.RIGHT);
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx =1;
		gridBagConstraints.gridy =1;

		gridBagConstraints.insets = new Insets(10, 10, 0, 10);
		add(interesField,gridBagConstraints);
		interesField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				interestFieldActionPerformed(e);
				
			}

			private void interestFieldActionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		paymentLabel = new JLabel();
		paymentLabel.setText("Number of Payment");
		paymentLabel.setFont(font);
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagConstraints.insets = new Insets(10, 10, 0, 0);
		getContentPane().add(paymentLabel,gridBagConstraints);
		
		
		paymentField = new JTextField();
		paymentField.setPreferredSize(new Dimension(100,25));
		paymentField.setFont(font);
		paymentField.setHorizontalAlignment(SwingConstants.RIGHT);
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.insets = new Insets(10, 10, 0, 10);
		getContentPane().add(paymentField, gridBagConstraints);
		paymentField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paymentFieldActionPerformed(e);
				
			}

			private void paymentFieldActionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		monthlyLabel = new JLabel();
		monthlyLabel.setText("Monthly Payment");
		monthlyLabel.setFont(font);
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridy = 3;
		gridBagConstraints.gridx = 0;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagConstraints.insets = new Insets(10, 10, 0, 0);
		getContentPane().add(monthlyLabel,gridBagConstraints);
		
		monthField = new JTextField();
		monthField.setPreferredSize(new Dimension(100,25));
		monthField.setHorizontalAlignment(SwingConstants.RIGHT);
		monthField.setFont(font);
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.insets = new Insets(10, 10, 0, 10);
		getContentPane().add(monthField,gridBagConstraints);
		monthField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				monthFieldActionPerformed(e);
				
			}

			private void monthFieldActionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		computeButton = new JButton();
		computeButton.setText("Compute Monthly Payment");
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(10, 10, 0, 0);
		getContentPane().add(computeButton, gridBagConstraints);
		computeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				computeButtonActionPerformed(e);
				
			}

			private void computeButtonActionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		LoanButton = new JButton();
		LoanButton.setText("New Loan Analysis");
		
		
		
		
		
		
		
		
		
		
		
		
		setResizable(false);
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
