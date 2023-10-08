package org.eclipse.wb.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Scrollbar;
import javax.swing.JPasswordField;

public class interface2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interface2 frame = new interface2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interface2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\PaulB_Dossier \u00E0 jour 2022\\IMG-20230123-WA0076.jpg"));
		setFont(new Font("Arial Black", Font.BOLD, 18));
		setTitle("CONGO LOGISTICO SOFT ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial Black", Font.BOLD, 11));
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel_2 = new JLabel("CLS");
		lblNewLabel_2.setForeground(new Color(95, 158, 160));
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 36));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 0;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("WELCOME IN CONGO LOGISTICO SOFT");
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 10));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sign in or Log in ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(new Color(95, 158, 160));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBackground(new Color(0, 0, 128));
		GridBagConstraints gbc_scrollbar = new GridBagConstraints();
		gbc_scrollbar.gridheight = 8;
		gbc_scrollbar.insets = new Insets(0, 0, 5, 0);
		gbc_scrollbar.gridx = 7;
		gbc_scrollbar.gridy = 0;
		contentPane.add(scrollbar, gbc_scrollbar);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 4;
		gbc_passwordField.gridy = 5;
		contentPane.add(passwordField, gbc_passwordField);
		
		JButton btnNewButton = new JButton(" Connect");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(new Color(102, 205, 170));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 7;
		contentPane.add(btnNewButton, gbc_btnNewButton);
	}

}
