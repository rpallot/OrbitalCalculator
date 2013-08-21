package com.rpallot.orbitalcalculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;

public class OrbitalCalculator extends JWindow {

	private static final long serialVersionUID = 1L;
	static boolean isRegistered;
	private static JProgressBar progressBar = new JProgressBar();
	private static OrbitalCalculator execute;
	private static int count;
	private static Timer timer;

	public OrbitalCalculator() {

		Container container = getContentPane();
		container.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new javax.swing.border.EtchedBorder());
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 10, 348, 150);
		panel.setLayout(null);
		container.add(panel);

		JLabel label = new JLabel("Orbital Calculator");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Verdana", Font.BOLD, 14));
		label.setBounds(104, 25, 140, 30);
		panel.add(label);

		progressBar.setBounds(49, 110, 250, 15);
		panel.add(progressBar);
		progressBar.setMaximum(50);

		ImagePanel iPanel = new ImagePanel(Toolkit.getDefaultToolkit().getImage("res/img/splash.png"));
		iPanel.setBounds(0, 0, 348, 150);
		panel.add(iPanel);
		setSize(370, 215);
		setLocationRelativeTo(null);
		setVisible(true);
		
		loadProgressBar();
	}

	private void loadProgressBar() {
		ActionListener al = new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				count++;
				progressBar.setValue(count);
				System.out.println(count);
				if (count == 50) {
					createFrame();
					getExecute().setVisible(false);
					timer.stop();
					
				}
			}

			private void createFrame() throws HeadlessException {
				CalculatorWindow window = new CalculatorWindow();
				window.initialise();
			}
		};
		timer = new Timer(50, al);
		timer.start();

	}

	public static void main(String[] args) {
		setExecute(new OrbitalCalculator());
	}

	public static OrbitalCalculator getExecute() {
		return execute;
	}

	public static void setExecute(OrbitalCalculator execute) {
		OrbitalCalculator.execute = execute;
	};

}
