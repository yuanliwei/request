package com.ylw.request;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			private JFrame frame;

			public void run() {
				frame = new JFrame("Request");
				frame.setBounds(100, 100, 500, 400);
				frame.setExtendedState( JFrame.NORMAL);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLayout(new BorderLayout());
				RequestPanel panel = new RequestPanel();
				frame.add(panel, BorderLayout.CENTER);
				frame.setVisible(true);
			}
		});
	}
}
