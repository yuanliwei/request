package com.ylw.request;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RequestPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4001708755253791148L;

	public RequestPanel() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		JButton b1 = new JButton("BUTTON1");
		add(b1,1);
		JButton b2 = new JButton("BUTTON2");
		add(b2);
		JButton b3 = new JButton("BUTTON3");
		add(b3);
		JButton b4 = new JButton("BUTTON4");
		add(b4);
	}
}
