package com.rpallot.orbitalcalculator;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JTextField;

public class CalculatorWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtEcc;
	private JTextField textField;
	private JTextField textInclination;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public CalculatorWindow() {
		setResizable(false);
		setTitle("Orbital Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		setSize(700, 700);
		setLocationRelativeTo(null);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnuFile = new JMenu("File");
		menuBar.add(mnuFile);

		JMenuItem mntmNew = new JMenuItem("New");
		mnuFile.add(mntmNew);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mnuFile.add(mntmOpen);

		JSeparator separator = new JSeparator();
		mnuFile.add(separator);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnuFile.add(mntmExit);

		JMenu mnTools = new JMenu("Tools");
		menuBar.add(mnTools);

		JMenuItem mntmOptions = new JMenuItem("Options");
		mnTools.add(mntmOptions);
		getContentPane().setLayout(null);
		
		JPanel pnlOrbEle = new JPanel();
		pnlOrbEle.setBounds(10, 11, 674, 100);
		getContentPane().add(pnlOrbEle);
		pnlOrbEle.setLayout(null);
		
		JLabel lblEnterOrbitalElements = new JLabel("Enter Orbital Elements");
		lblEnterOrbitalElements.setFont(new Font("Verdana", Font.BOLD, 14));
		lblEnterOrbitalElements.setBounds(250, 2, 174, 14);
		pnlOrbEle.add(lblEnterOrbitalElements);
		
		JLabel lblEccentricity = new JLabel("Eccentricity (e):");
		lblEccentricity.setBounds(10, 26, 79, 14);
		pnlOrbEle.add(lblEccentricity);
		
		txtEcc = new JTextField();
		txtEcc.setBounds(112, 23, 86, 20);
		pnlOrbEle.add(txtEcc);
		txtEcc.setColumns(10);
		
		JLabel lblSMA = new JLabel("Semimajor axis (a):");
		lblSMA.setBounds(10, 54, 92, 14);
		pnlOrbEle.add(lblSMA);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(112, 51, 86, 20);
		pnlOrbEle.add(textField);
		
		JLabel lblInclination = new JLabel("Inclination (i):");
		lblInclination.setBounds(218, 26, 66, 14);
		pnlOrbEle.add(lblInclination);
		
		textInclination = new JTextField();
		textInclination.setColumns(10);
		textInclination.setBounds(330, 23, 86, 20);
		pnlOrbEle.add(textInclination);
		
		JLabel lblAN = new JLabel("Ascending Node (AN):");
		lblAN.setBounds(218, 54, 106, 14);
		pnlOrbEle.add(lblAN);
		
		textField_1 = new JTextField();
		textField_1.setBounds(330, 51, 86, 20);
		pnlOrbEle.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPeriapsis = new JLabel("Periapsis Argument (w):");
		lblPeriapsis.setBounds(451, 26, 115, 14);
		pnlOrbEle.add(lblPeriapsis);
		
		JLabel lblMeanAnomaly = new JLabel("Mean Anomaly (M):");
		lblMeanAnomaly.setBounds(451, 54, 93, 14);
		pnlOrbEle.add(lblMeanAnomaly);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(578, 23, 86, 20);
		pnlOrbEle.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(578, 51, 86, 20);
		pnlOrbEle.add(textField_3);
		
		JPanel pnlGravBody = new JPanel();
		pnlGravBody.setBounds(10, 122, 674, 100);
		getContentPane().add(pnlGravBody);
		pnlGravBody.setLayout(null);
		
		JLabel lblGravBody = new JLabel("Enter Influencing Body's Elements");
		lblGravBody.setBounds(202, 6, 269, 18);
		lblGravBody.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlGravBody.add(lblGravBody);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(112, 26, 86, 20);
		pnlGravBody.add(textField_4);
		
		JLabel label = new JLabel("Eccentricity (e):");
		label.setBounds(10, 29, 79, 14);
		pnlGravBody.add(label);
	}

	public void initialise() {
		setVisible(true);
		OrbitalCalculator.getExecute().dispose();
	}
}
