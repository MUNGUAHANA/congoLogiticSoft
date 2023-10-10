package project2;


import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
//import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Scrollbar;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import java.awt.TextField;
import java.awt.ComponentOrientation;
import java.awt.Checkbox;
import java.awt.Point;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import java.awt.Button;

public class interface2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField txtRecherche;

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
		setForeground(new Color(0, 0, 139));
		setFont(new Font("Arial Black", Font.BOLD, 28));
		setTitle("CONGO LOGISTICO SOFT");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\PaulB_Dossier \u00E0 jour 2022\\IMG-20230123-WA0076.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{430, 0};
		gbl_contentPane.rowHeights = new int[]{80, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setPreferredSize(new Dimension(610, 80));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("LOGO");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 12));
		lblNewLabel.setPreferredSize(new Dimension(45, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CONGO LOGISTICO SOFT");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setPreferredSize(new Dimension(300, 50));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		Panel panel_1 = new Panel();
		panel_1.setPreferredSize(new Dimension(610, 30));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnNewButton_2 = new JButton("Vieuw");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_2.setBackground(new Color(0, 255, 255));
		btnNewButton_2.setForeground(new Color(102, 205, 170));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 12;
		gbc_btnNewButton_2.gridy = 0;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(102, 205, 170));
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 13;
		gbc_btnNewButton.gridy = 0;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.setForeground(new Color(102, 205, 170));
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 14;
		gbc_btnNewButton_1.gridy = 0;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		Panel panel_2 = new Panel();
		panel_2.setPreferredSize(new Dimension(610, 370));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 2;
		contentPane.add(panel_2, gbc_panel_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setPreferredSize(new Dimension(620, 370));
		panel_2.add(tabbedPane);
		
		JPanel panel_8 = new JPanel();
		panel_8.setForeground(new Color(102, 205, 170));
		panel_8.setName("");
		panel_8.setToolTipText("");
		panel_8.setBackground(new Color(0, 0, 128));
		tabbedPane.addTab("New tab", null, panel_8, null);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_8.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		txtRecherche = new JTextField();
		txtRecherche.setBorder(new TitledBorder(null, "Recherche", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		txtRecherche.setToolTipText("         Recherche");
		GridBagConstraints gbc_txtRecherche = new GridBagConstraints();
		gbc_txtRecherche.insets = new Insets(0, 0, 5, 5);
		gbc_txtRecherche.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRecherche.gridx = 4;
		gbc_txtRecherche.gridy = 0;
		panel_8.add(txtRecherche, gbc_txtRecherche);
		txtRecherche.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("J'acceptes toute les conditions et je susi pr\u00EAt pour commencer ");
		chckbxNewCheckBox.setForeground(new Color(248, 248, 255));
		chckbxNewCheckBox.setBackground(new Color(0, 0, 128));
		chckbxNewCheckBox.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 10;
		panel_8.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JPanel panel_9 = new JPanel();
		panel_9.setFont(new Font("Arial", Font.BOLD, 12));
		panel_9.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("New tab", null, panel_9, null);
		GridBagLayout gbl_panel_9 = new GridBagLayout();
		gbl_panel_9.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_9.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_9.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_9.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_9.setLayout(gbl_panel_9);
		
		JLabel lblNewLabel_55 = new JLabel("BON DE SORTIE");
		lblNewLabel_55.setFont(new Font("Arial", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_55 = new GridBagConstraints();
		gbc_lblNewLabel_55.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_55.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_55.gridx = 2;
		gbc_lblNewLabel_55.gridy = 0;
		panel_9.add(lblNewLabel_55, gbc_lblNewLabel_55);
		
		JLabel lblNumroBonDe = new JLabel("Num\u00E9ro bon de sortie ");
		lblNumroBonDe.setFont(new Font("Arial", Font.BOLD, 12));
		lblNumroBonDe.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_lblNumroBonDe = new GridBagConstraints();
		gbc_lblNumroBonDe.anchor = GridBagConstraints.EAST;
		gbc_lblNumroBonDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumroBonDe.gridx = 1;
		gbc_lblNumroBonDe.gridy = 1;
		panel_9.add(lblNumroBonDe, gbc_lblNumroBonDe);
		
		textField_41 = new JTextField();
		GridBagConstraints gbc_textField_41 = new GridBagConstraints();
		gbc_textField_41.anchor = GridBagConstraints.WEST;
		gbc_textField_41.insets = new Insets(0, 0, 5, 0);
		gbc_textField_41.gridx = 2;
		gbc_textField_41.gridy = 1;
		panel_9.add(textField_41, gbc_textField_41);
		textField_41.setColumns(10);
		
		JLabel lblNewLabel_44 = new JLabel("Date");
		lblNewLabel_44.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_44 = new GridBagConstraints();
		gbc_lblNewLabel_44.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_44.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_44.gridx = 1;
		gbc_lblNewLabel_44.gridy = 2;
		panel_9.add(lblNewLabel_44, gbc_lblNewLabel_44);
		
		textField_42 = new JTextField();
		GridBagConstraints gbc_textField_42 = new GridBagConstraints();
		gbc_textField_42.anchor = GridBagConstraints.WEST;
		gbc_textField_42.insets = new Insets(0, 0, 5, 0);
		gbc_textField_42.gridx = 2;
		gbc_textField_42.gridy = 2;
		panel_9.add(textField_42, gbc_textField_42);
		textField_42.setColumns(10);
		
		JLabel lblNewLabel_45 = new JLabel("Designation Bon de sortie ");
		lblNewLabel_45.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_45 = new GridBagConstraints();
		gbc_lblNewLabel_45.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_45.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_45.gridx = 1;
		gbc_lblNewLabel_45.gridy = 3;
		panel_9.add(lblNewLabel_45, gbc_lblNewLabel_45);
		
		textField_43 = new JTextField();
		GridBagConstraints gbc_textField_43 = new GridBagConstraints();
		gbc_textField_43.anchor = GridBagConstraints.WEST;
		gbc_textField_43.insets = new Insets(0, 0, 5, 0);
		gbc_textField_43.gridx = 2;
		gbc_textField_43.gridy = 3;
		panel_9.add(textField_43, gbc_textField_43);
		textField_43.setColumns(10);
		
		JLabel lblNewLabel_47 = new JLabel("Quantit\u00E9 bon de sortie ");
		lblNewLabel_47.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_47 = new GridBagConstraints();
		gbc_lblNewLabel_47.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_47.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_47.gridx = 1;
		gbc_lblNewLabel_47.gridy = 4;
		panel_9.add(lblNewLabel_47, gbc_lblNewLabel_47);
		
		textField_44 = new JTextField();
		GridBagConstraints gbc_textField_44 = new GridBagConstraints();
		gbc_textField_44.anchor = GridBagConstraints.WEST;
		gbc_textField_44.insets = new Insets(0, 0, 5, 0);
		gbc_textField_44.gridx = 2;
		gbc_textField_44.gridy = 4;
		panel_9.add(textField_44, gbc_textField_44);
		textField_44.setColumns(10);
		
		JLabel lblNewLabel_46 = new JLabel("Prix unitaire bon de sortie ");
		lblNewLabel_46.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_46 = new GridBagConstraints();
		gbc_lblNewLabel_46.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_46.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_46.gridx = 1;
		gbc_lblNewLabel_46.gridy = 5;
		panel_9.add(lblNewLabel_46, gbc_lblNewLabel_46);
		
		textField_45 = new JTextField();
		GridBagConstraints gbc_textField_45 = new GridBagConstraints();
		gbc_textField_45.anchor = GridBagConstraints.WEST;
		gbc_textField_45.insets = new Insets(0, 0, 5, 0);
		gbc_textField_45.gridx = 2;
		gbc_textField_45.gridy = 5;
		panel_9.add(textField_45, gbc_textField_45);
		textField_45.setColumns(10);
		
		JLabel lblNewLabel_48 = new JLabel("Prix total bon de sortie ");
		lblNewLabel_48.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_48 = new GridBagConstraints();
		gbc_lblNewLabel_48.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_48.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_48.gridx = 1;
		gbc_lblNewLabel_48.gridy = 6;
		panel_9.add(lblNewLabel_48, gbc_lblNewLabel_48);
		
		textField_46 = new JTextField();
		GridBagConstraints gbc_textField_46 = new GridBagConstraints();
		gbc_textField_46.anchor = GridBagConstraints.WEST;
		gbc_textField_46.insets = new Insets(0, 0, 5, 0);
		gbc_textField_46.gridx = 2;
		gbc_textField_46.gridy = 6;
		panel_9.add(textField_46, gbc_textField_46);
		textField_46.setColumns(10);
		
		JLabel lblNewLabel_49 = new JLabel("Commentaire");
		lblNewLabel_49.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_49 = new GridBagConstraints();
		gbc_lblNewLabel_49.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_49.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_49.gridx = 1;
		gbc_lblNewLabel_49.gridy = 7;
		panel_9.add(lblNewLabel_49, gbc_lblNewLabel_49);
		
		textField_47 = new JTextField();
		GridBagConstraints gbc_textField_47 = new GridBagConstraints();
		gbc_textField_47.insets = new Insets(0, 0, 5, 0);
		gbc_textField_47.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_47.gridx = 2;
		gbc_textField_47.gridy = 7;
		panel_9.add(textField_47, gbc_textField_47);
		textField_47.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("New tab", null, panel_7, null);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_7.rowHeights = new int[]{4, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_7.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		JLabel lblBonDentree = new JLabel("BON D'ENTREE");
		lblBonDentree.setFont(new Font("Arial", Font.BOLD, 18));
		GridBagConstraints gbc_lblBonDentree = new GridBagConstraints();
		gbc_lblBonDentree.anchor = GridBagConstraints.WEST;
		gbc_lblBonDentree.insets = new Insets(0, 0, 5, 0);
		gbc_lblBonDentree.gridx = 2;
		gbc_lblBonDentree.gridy = 0;
		panel_7.add(lblBonDentree, gbc_lblBonDentree);
		
		JLabel lblNewLabel_37 = new JLabel("Num\u00E9ro Bon ");
		lblNewLabel_37.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_37 = new GridBagConstraints();
		gbc_lblNewLabel_37.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_37.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_37.gridx = 1;
		gbc_lblNewLabel_37.gridy = 2;
		panel_7.add(lblNewLabel_37, gbc_lblNewLabel_37);
		
		textField_35 = new JTextField();
		GridBagConstraints gbc_textField_35 = new GridBagConstraints();
		gbc_textField_35.anchor = GridBagConstraints.WEST;
		gbc_textField_35.insets = new Insets(0, 0, 5, 0);
		gbc_textField_35.gridx = 2;
		gbc_textField_35.gridy = 2;
		panel_7.add(textField_35, gbc_textField_35);
		textField_35.setColumns(10);
		
		JLabel lblNewLabel_38 = new JLabel("Date");
		lblNewLabel_38.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_38 = new GridBagConstraints();
		gbc_lblNewLabel_38.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_38.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_38.gridx = 1;
		gbc_lblNewLabel_38.gridy = 3;
		panel_7.add(lblNewLabel_38, gbc_lblNewLabel_38);
		
		textField_36 = new JTextField();
		GridBagConstraints gbc_textField_36 = new GridBagConstraints();
		gbc_textField_36.anchor = GridBagConstraints.WEST;
		gbc_textField_36.insets = new Insets(0, 0, 5, 0);
		gbc_textField_36.gridx = 2;
		gbc_textField_36.gridy = 3;
		panel_7.add(textField_36, gbc_textField_36);
		textField_36.setColumns(10);
		
		JLabel lblNewLabel_39 = new JLabel("Designation");
		lblNewLabel_39.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_39 = new GridBagConstraints();
		gbc_lblNewLabel_39.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_39.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_39.gridx = 1;
		gbc_lblNewLabel_39.gridy = 4;
		panel_7.add(lblNewLabel_39, gbc_lblNewLabel_39);
		
		textField_37 = new JTextField();
		GridBagConstraints gbc_textField_37 = new GridBagConstraints();
		gbc_textField_37.anchor = GridBagConstraints.WEST;
		gbc_textField_37.insets = new Insets(0, 0, 5, 0);
		gbc_textField_37.gridx = 2;
		gbc_textField_37.gridy = 4;
		panel_7.add(textField_37, gbc_textField_37);
		textField_37.setColumns(10);
		
		JLabel lblNewLabel_40 = new JLabel("Quantit\u00E9 Bon Entr\u00E9e");
		lblNewLabel_40.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_40 = new GridBagConstraints();
		gbc_lblNewLabel_40.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_40.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_40.gridx = 1;
		gbc_lblNewLabel_40.gridy = 5;
		panel_7.add(lblNewLabel_40, gbc_lblNewLabel_40);
		
		textField_38 = new JTextField();
		GridBagConstraints gbc_textField_38 = new GridBagConstraints();
		gbc_textField_38.anchor = GridBagConstraints.WEST;
		gbc_textField_38.insets = new Insets(0, 0, 5, 0);
		gbc_textField_38.gridx = 2;
		gbc_textField_38.gridy = 5;
		panel_7.add(textField_38, gbc_textField_38);
		textField_38.setColumns(10);
		
		JLabel lblNewLabel_41 = new JLabel("Prix unitaire Bon d'entr\u00E9e");
		lblNewLabel_41.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_41 = new GridBagConstraints();
		gbc_lblNewLabel_41.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_41.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_41.gridx = 1;
		gbc_lblNewLabel_41.gridy = 6;
		panel_7.add(lblNewLabel_41, gbc_lblNewLabel_41);
		
		textField_48 = new JTextField();
		GridBagConstraints gbc_textField_48 = new GridBagConstraints();
		gbc_textField_48.anchor = GridBagConstraints.WEST;
		gbc_textField_48.insets = new Insets(0, 0, 5, 0);
		gbc_textField_48.gridx = 2;
		gbc_textField_48.gridy = 6;
		panel_7.add(textField_48, gbc_textField_48);
		textField_48.setColumns(10);
		
		JLabel lblNewLabel_42 = new JLabel("Pix total bon d'entr\u00E9e ");
		lblNewLabel_42.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_42 = new GridBagConstraints();
		gbc_lblNewLabel_42.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_42.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_42.gridx = 1;
		gbc_lblNewLabel_42.gridy = 7;
		panel_7.add(lblNewLabel_42, gbc_lblNewLabel_42);
		
		textField_39 = new JTextField();
		GridBagConstraints gbc_textField_39 = new GridBagConstraints();
		gbc_textField_39.anchor = GridBagConstraints.WEST;
		gbc_textField_39.insets = new Insets(0, 0, 5, 0);
		gbc_textField_39.gridx = 2;
		gbc_textField_39.gridy = 7;
		panel_7.add(textField_39, gbc_textField_39);
		textField_39.setColumns(10);
		
		JLabel lblNewLabel_43 = new JLabel("Commentaire ");
		lblNewLabel_43.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_43 = new GridBagConstraints();
		gbc_lblNewLabel_43.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_43.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_43.gridx = 1;
		gbc_lblNewLabel_43.gridy = 8;
		panel_7.add(lblNewLabel_43, gbc_lblNewLabel_43);
		
		textField_40 = new JTextField();
		GridBagConstraints gbc_textField_40 = new GridBagConstraints();
		gbc_textField_40.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_40.gridx = 2;
		gbc_textField_40.gridy = 8;
		panel_7.add(textField_40, gbc_textField_40);
		textField_40.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("New tab", null, panel_6, null);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JLabel lblNewLabel_54 = new JLabel("FICHE DE STOCK");
		lblNewLabel_54.setFont(new Font("Arial", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_54 = new GridBagConstraints();
		gbc_lblNewLabel_54.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_54.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_54.gridx = 2;
		gbc_lblNewLabel_54.gridy = 0;
		panel_6.add(lblNewLabel_54, gbc_lblNewLabel_54);
		
		JLabel lblNewLabel_25 = new JLabel("Id Produit");
		lblNewLabel_25.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_25 = new GridBagConstraints();
		gbc_lblNewLabel_25.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_25.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_25.gridx = 1;
		gbc_lblNewLabel_25.gridy = 1;
		panel_6.add(lblNewLabel_25, gbc_lblNewLabel_25);
		
		textField_23 = new JTextField();
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.anchor = GridBagConstraints.WEST;
		gbc_textField_23.insets = new Insets(0, 0, 5, 0);
		gbc_textField_23.gridx = 2;
		gbc_textField_23.gridy = 1;
		panel_6.add(textField_23, gbc_textField_23);
		textField_23.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Date");
		lblNewLabel_26.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_26 = new GridBagConstraints();
		gbc_lblNewLabel_26.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_26.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_26.gridx = 1;
		gbc_lblNewLabel_26.gridy = 2;
		panel_6.add(lblNewLabel_26, gbc_lblNewLabel_26);
		
		textField_24 = new JTextField();
		GridBagConstraints gbc_textField_24 = new GridBagConstraints();
		gbc_textField_24.anchor = GridBagConstraints.WEST;
		gbc_textField_24.insets = new Insets(0, 0, 5, 0);
		gbc_textField_24.gridx = 2;
		gbc_textField_24.gridy = 2;
		panel_6.add(textField_24, gbc_textField_24);
		textField_24.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("Quantit\u00E9 Entr\u00E9e");
		lblNewLabel_27.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_27 = new GridBagConstraints();
		gbc_lblNewLabel_27.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_27.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_27.gridx = 1;
		gbc_lblNewLabel_27.gridy = 3;
		panel_6.add(lblNewLabel_27, gbc_lblNewLabel_27);
		
		textField_25 = new JTextField();
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.anchor = GridBagConstraints.WEST;
		gbc_textField_25.insets = new Insets(0, 0, 5, 0);
		gbc_textField_25.gridx = 2;
		gbc_textField_25.gridy = 3;
		panel_6.add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("Prix Unitaire Entr\u00E9e ");
		lblNewLabel_28.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_28 = new GridBagConstraints();
		gbc_lblNewLabel_28.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_28.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_28.gridx = 1;
		gbc_lblNewLabel_28.gridy = 4;
		panel_6.add(lblNewLabel_28, gbc_lblNewLabel_28);
		
		textField_26 = new JTextField();
		GridBagConstraints gbc_textField_26 = new GridBagConstraints();
		gbc_textField_26.anchor = GridBagConstraints.WEST;
		gbc_textField_26.insets = new Insets(0, 0, 5, 0);
		gbc_textField_26.gridx = 2;
		gbc_textField_26.gridy = 4;
		panel_6.add(textField_26, gbc_textField_26);
		textField_26.setColumns(10);
		
		JLabel lblNewLabel_29 = new JLabel("Valeur Entr\u00E9e");
		lblNewLabel_29.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_29 = new GridBagConstraints();
		gbc_lblNewLabel_29.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_29.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_29.gridx = 1;
		gbc_lblNewLabel_29.gridy = 5;
		panel_6.add(lblNewLabel_29, gbc_lblNewLabel_29);
		
		textField_27 = new JTextField();
		GridBagConstraints gbc_textField_27 = new GridBagConstraints();
		gbc_textField_27.anchor = GridBagConstraints.WEST;
		gbc_textField_27.insets = new Insets(0, 0, 5, 0);
		gbc_textField_27.gridx = 2;
		gbc_textField_27.gridy = 5;
		panel_6.add(textField_27, gbc_textField_27);
		textField_27.setColumns(10);
		
		JLabel lblNewLabel_30 = new JLabel("Quantit\u00E9 Sortie ");
		lblNewLabel_30.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_30 = new GridBagConstraints();
		gbc_lblNewLabel_30.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_30.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_30.gridx = 1;
		gbc_lblNewLabel_30.gridy = 6;
		panel_6.add(lblNewLabel_30, gbc_lblNewLabel_30);
		
		textField_28 = new JTextField();
		GridBagConstraints gbc_textField_28 = new GridBagConstraints();
		gbc_textField_28.anchor = GridBagConstraints.WEST;
		gbc_textField_28.insets = new Insets(0, 0, 5, 0);
		gbc_textField_28.gridx = 2;
		gbc_textField_28.gridy = 6;
		panel_6.add(textField_28, gbc_textField_28);
		textField_28.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("Prix Unitaire Sortie");
		lblNewLabel_31.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_31 = new GridBagConstraints();
		gbc_lblNewLabel_31.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_31.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_31.gridx = 1;
		gbc_lblNewLabel_31.gridy = 7;
		panel_6.add(lblNewLabel_31, gbc_lblNewLabel_31);
		
		textField_29 = new JTextField();
		GridBagConstraints gbc_textField_29 = new GridBagConstraints();
		gbc_textField_29.anchor = GridBagConstraints.WEST;
		gbc_textField_29.insets = new Insets(0, 0, 5, 0);
		gbc_textField_29.gridx = 2;
		gbc_textField_29.gridy = 7;
		panel_6.add(textField_29, gbc_textField_29);
		textField_29.setColumns(10);
		
		JLabel lblNewLabel_32 = new JLabel("Valeur Sortie ");
		lblNewLabel_32.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_32 = new GridBagConstraints();
		gbc_lblNewLabel_32.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_32.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_32.gridx = 1;
		gbc_lblNewLabel_32.gridy = 8;
		panel_6.add(lblNewLabel_32, gbc_lblNewLabel_32);
		
		textField_30 = new JTextField();
		GridBagConstraints gbc_textField_30 = new GridBagConstraints();
		gbc_textField_30.anchor = GridBagConstraints.WEST;
		gbc_textField_30.insets = new Insets(0, 0, 5, 0);
		gbc_textField_30.gridx = 2;
		gbc_textField_30.gridy = 8;
		panel_6.add(textField_30, gbc_textField_30);
		textField_30.setColumns(10);
		
		JLabel lblNewLabel_33 = new JLabel("Qunatit\u00E9 Sortie");
		lblNewLabel_33.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_33 = new GridBagConstraints();
		gbc_lblNewLabel_33.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_33.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_33.gridx = 1;
		gbc_lblNewLabel_33.gridy = 9;
		panel_6.add(lblNewLabel_33, gbc_lblNewLabel_33);
		
		textField_31 = new JTextField();
		GridBagConstraints gbc_textField_31 = new GridBagConstraints();
		gbc_textField_31.anchor = GridBagConstraints.WEST;
		gbc_textField_31.insets = new Insets(0, 0, 5, 0);
		gbc_textField_31.gridx = 2;
		gbc_textField_31.gridy = 9;
		panel_6.add(textField_31, gbc_textField_31);
		textField_31.setColumns(10);
		
		JLabel lblNewLabel_34 = new JLabel("Prix unitaire Stock");
		lblNewLabel_34.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_34 = new GridBagConstraints();
		gbc_lblNewLabel_34.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_34.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_34.gridx = 1;
		gbc_lblNewLabel_34.gridy = 10;
		panel_6.add(lblNewLabel_34, gbc_lblNewLabel_34);
		
		textField_32 = new JTextField();
		GridBagConstraints gbc_textField_32 = new GridBagConstraints();
		gbc_textField_32.anchor = GridBagConstraints.WEST;
		gbc_textField_32.insets = new Insets(0, 0, 5, 0);
		gbc_textField_32.gridx = 2;
		gbc_textField_32.gridy = 10;
		panel_6.add(textField_32, gbc_textField_32);
		textField_32.setColumns(10);
		
		JLabel lblNewLabel_35 = new JLabel("Valeur Stock");
		lblNewLabel_35.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_35 = new GridBagConstraints();
		gbc_lblNewLabel_35.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_35.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_35.gridx = 1;
		gbc_lblNewLabel_35.gridy = 11;
		panel_6.add(lblNewLabel_35, gbc_lblNewLabel_35);
		
		textField_33 = new JTextField();
		GridBagConstraints gbc_textField_33 = new GridBagConstraints();
		gbc_textField_33.anchor = GridBagConstraints.WEST;
		gbc_textField_33.insets = new Insets(0, 0, 5, 0);
		gbc_textField_33.gridx = 2;
		gbc_textField_33.gridy = 11;
		panel_6.add(textField_33, gbc_textField_33);
		textField_33.setColumns(10);
		
		JLabel lblNewLabel_36 = new JLabel("Commentaire ");
		lblNewLabel_36.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_36 = new GridBagConstraints();
		gbc_lblNewLabel_36.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_36.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_36.gridx = 1;
		gbc_lblNewLabel_36.gridy = 12;
		panel_6.add(lblNewLabel_36, gbc_lblNewLabel_36);
		
		textField_34 = new JTextField();
		GridBagConstraints gbc_textField_34 = new GridBagConstraints();
		gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_34.gridx = 2;
		gbc_textField_34.gridy = 12;
		panel_6.add(textField_34, gbc_textField_34);
		textField_34.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("New tab", null, panel_5, null);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel lblNewLabel_53 = new JLabel("FICHE HISTORIQUE");
		lblNewLabel_53.setFont(new Font("Arial", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_53 = new GridBagConstraints();
		gbc_lblNewLabel_53.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_53.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_53.gridx = 5;
		gbc_lblNewLabel_53.gridy = 0;
		panel_5.add(lblNewLabel_53, gbc_lblNewLabel_53);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 1;
		gbc_lblNewLabel_20.gridy = 1;
		panel_5.add(lblNewLabel_20, gbc_lblNewLabel_20);
		
		textField_18 = new JTextField();
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 2;
		gbc_textField_18.gridy = 1;
		panel_5.add(textField_18, gbc_textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_21.gridx = 1;
		gbc_lblNewLabel_21.gridy = 2;
		panel_5.add(lblNewLabel_21, gbc_lblNewLabel_21);
		
		textField_19 = new JTextField();
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 2;
		gbc_textField_19.gridy = 2;
		panel_5.add(textField_19, gbc_textField_19);
		textField_19.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_22.gridx = 1;
		gbc_lblNewLabel_22.gridy = 3;
		panel_5.add(lblNewLabel_22, gbc_lblNewLabel_22);
		
		textField_20 = new JTextField();
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.gridx = 2;
		gbc_textField_20.gridy = 3;
		panel_5.add(textField_20, gbc_textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("New label");
		lblNewLabel_23.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
		gbc_lblNewLabel_23.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_23.gridx = 1;
		gbc_lblNewLabel_23.gridy = 4;
		panel_5.add(lblNewLabel_23, gbc_lblNewLabel_23);
		
		textField_21 = new JTextField();
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.insets = new Insets(0, 0, 5, 5);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 2;
		gbc_textField_21.gridy = 4;
		panel_5.add(textField_21, gbc_textField_21);
		textField_21.setColumns(10);
		
		JLabel lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_24 = new GridBagConstraints();
		gbc_lblNewLabel_24.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_24.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_24.gridx = 1;
		gbc_lblNewLabel_24.gridy = 5;
		panel_5.add(lblNewLabel_24, gbc_lblNewLabel_24);
		
		textField_22 = new JTextField();
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.insets = new Insets(0, 0, 0, 5);
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.gridx = 2;
		gbc_textField_22.gridy = 5;
		panel_5.add(textField_22, gbc_textField_22);
		textField_22.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("New tab", null, panel_4, null);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblNewLabel_52 = new JLabel("INVENTAIRE");
		lblNewLabel_52.setFont(new Font("Arial", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_52 = new GridBagConstraints();
		gbc_lblNewLabel_52.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_52.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_52.gridx = 2;
		gbc_lblNewLabel_52.gridy = 0;
		panel_4.add(lblNewLabel_52, gbc_lblNewLabel_52);
		
		JLabel lblNewLabel_12 = new JLabel("Num\u00E9ro Article");
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 1;
		gbc_lblNewLabel_12.gridy = 1;
		panel_4.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.anchor = GridBagConstraints.WEST;
		gbc_textField_10.insets = new Insets(0, 0, 5, 0);
		gbc_textField_10.gridx = 2;
		gbc_textField_10.gridy = 1;
		panel_4.add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Date ");
		lblNewLabel_19.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 1;
		gbc_lblNewLabel_19.gridy = 2;
		panel_4.add(lblNewLabel_19, gbc_lblNewLabel_19);
		
		textField_17 = new JTextField();
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.insets = new Insets(0, 0, 5, 0);
		gbc_textField_17.anchor = GridBagConstraints.WEST;
		gbc_textField_17.gridx = 2;
		gbc_textField_17.gridy = 2;
		panel_4.add(textField_17, gbc_textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Nom Article");
		lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 1;
		gbc_lblNewLabel_13.gridy = 3;
		panel_4.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		textField_11 = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.anchor = GridBagConstraints.WEST;
		gbc_textField_11.insets = new Insets(0, 0, 5, 0);
		gbc_textField_11.gridx = 2;
		gbc_textField_11.gridy = 3;
		panel_4.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Reference Article ");
		lblNewLabel_14.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 1;
		gbc_lblNewLabel_14.gridy = 4;
		panel_4.add(lblNewLabel_14, gbc_lblNewLabel_14);
		
		textField_12 = new JTextField();
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.anchor = GridBagConstraints.WEST;
		gbc_textField_12.insets = new Insets(0, 0, 5, 0);
		gbc_textField_12.gridx = 2;
		gbc_textField_12.gridy = 4;
		panel_4.add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Mod\u00E8le Article");
		lblNewLabel_15.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 1;
		gbc_lblNewLabel_15.gridy = 5;
		panel_4.add(lblNewLabel_15, gbc_lblNewLabel_15);
		
		textField_13 = new JTextField();
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.anchor = GridBagConstraints.WEST;
		gbc_textField_13.insets = new Insets(0, 0, 5, 0);
		gbc_textField_13.gridx = 2;
		gbc_textField_13.gridy = 5;
		panel_4.add(textField_13, gbc_textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Descritpion Article ");
		lblNewLabel_16.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 1;
		gbc_lblNewLabel_16.gridy = 6;
		panel_4.add(lblNewLabel_16, gbc_lblNewLabel_16);
		
		textField_14 = new JTextField();
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.anchor = GridBagConstraints.WEST;
		gbc_textField_14.insets = new Insets(0, 0, 5, 0);
		gbc_textField_14.gridx = 2;
		gbc_textField_14.gridy = 6;
		panel_4.add(textField_14, gbc_textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Prix Article ");
		lblNewLabel_17.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 1;
		gbc_lblNewLabel_17.gridy = 7;
		panel_4.add(lblNewLabel_17, gbc_lblNewLabel_17);
		
		textField_15 = new JTextField();
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.anchor = GridBagConstraints.WEST;
		gbc_textField_15.insets = new Insets(0, 0, 5, 0);
		gbc_textField_15.gridx = 2;
		gbc_textField_15.gridy = 7;
		panel_4.add(textField_15, gbc_textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Quantit\u00E9 de stock Inventaire ");
		lblNewLabel_18.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 1;
		gbc_lblNewLabel_18.gridy = 8;
		panel_4.add(lblNewLabel_18, gbc_lblNewLabel_18);
		
		textField_16 = new JTextField();
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.anchor = GridBagConstraints.WEST;
		gbc_textField_16.insets = new Insets(0, 0, 5, 0);
		gbc_textField_16.gridx = 2;
		gbc_textField_16.gridy = 8;
		panel_4.add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("New tab", null, panel_10, null);
		GridBagLayout gbl_panel_10 = new GridBagLayout();
		gbl_panel_10.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_10.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_10.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_10.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_10.setLayout(gbl_panel_10);
		
		JLabel lblNewLabel_51 = new JLabel("JOURNAL DE STOCK");
		lblNewLabel_51.setFont(new Font("Arial", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_51 = new GridBagConstraints();
		gbc_lblNewLabel_51.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_51.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_51.gridx = 2;
		gbc_lblNewLabel_51.gridy = 0;
		panel_10.add(lblNewLabel_51, gbc_lblNewLabel_51);
		
		JLabel lblNewLabel_6 = new JLabel("Num\u00E9ro op\u00E9ration");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 1;
		panel_10.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setPreferredSize(new Dimension(100, 20));
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.anchor = GridBagConstraints.WEST;
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 1;
		panel_10.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Date de l'op\u00E9ration ");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 1;
		gbc_lblNewLabel_11.gridy = 2;
		panel_10.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		textField_9 = new JTextField();
		textField_9.setPreferredSize(new Dimension(100, 20));
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 0);
		gbc_textField_9.anchor = GridBagConstraints.WEST;
		gbc_textField_9.gridx = 2;
		gbc_textField_9.gridy = 2;
		panel_10.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Num\u00E9ro Compte");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 3;
		panel_10.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setPreferredSize(new Dimension(100, 20));
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.anchor = GridBagConstraints.WEST;
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 3;
		panel_10.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Libelle");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 4;
		panel_10.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setPreferredSize(new Dimension(100, 20));
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 4;
		panel_10.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Debit");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 1;
		gbc_lblNewLabel_9.gridy = 5;
		panel_10.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setPreferredSize(new Dimension(100, 20));
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.anchor = GridBagConstraints.WEST;
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.gridx = 2;
		gbc_textField_7.gridy = 5;
		panel_10.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Cr\u00E9dit");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 1;
		gbc_lblNewLabel_10.gridy = 6;
		panel_10.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		textField_8 = new JTextField();
		textField_8.setPreferredSize(new Dimension(100, 20));
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.anchor = GridBagConstraints.WEST;
		gbc_textField_8.insets = new Insets(0, 0, 5, 0);
		gbc_textField_8.gridx = 2;
		gbc_textField_8.gridy = 6;
		panel_10.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("New tab", null, panel_3, null);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel_50 = new JLabel("TABLE DES PRODUITS");
		lblNewLabel_50.setBackground(new Color(102, 205, 170));
		lblNewLabel_50.setFont(new Font("Arial", Font.BOLD, 17));
		GridBagConstraints gbc_lblNewLabel_50 = new GridBagConstraints();
		gbc_lblNewLabel_50.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_50.gridx = 9;
		gbc_lblNewLabel_50.gridy = 0;
		panel_3.add(lblNewLabel_50, gbc_lblNewLabel_50);
		
		JLabel lblNewLabel_2 = new JLabel("Num\u00E9ro du produit");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 1;
		panel_3.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(100, 20));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 10;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		panel_3.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nom du produit");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 2;
		panel_3.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 10;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 2;
		panel_3.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Date entr\u00E9e du produit");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 3;
		panel_3.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 10;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 3;
		panel_3.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Detail sur le produit");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 4;
		panel_3.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 10;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 4;
		panel_3.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		//contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, panel_1}));
		
	}

}
