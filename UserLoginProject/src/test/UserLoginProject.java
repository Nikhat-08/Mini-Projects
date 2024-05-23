package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class UserLoginProject {

	private JFrame frame;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLoginProject window = new UserLoginProject();
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
	public UserLoginProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 732, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Login Page");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.BOLD, 20));
		lblNewLabel.setBackground(new Color(128, 255, 255));
		lblNewLabel.setBounds(131, 10, 226, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setForeground(new Color(0, 255, 128));
		lblNewLabel_1.setBackground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_1.setBounds(36, 86, 80, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(0, 255, 128));
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_1_1.setBackground(Color.YELLOW);
		lblNewLabel_1_1.setBounds(36, 137, 80, 27);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		username = new JTextField();
		username.setBounds(131, 88, 168, 19);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname = username.getText();
				String pword = password.getText();
				
				if(pword.contains("hello@123") && uname.contains("hello")) {
					username.setText(null);
					password.setText(null);
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Login","ERROR",JOptionPane.ERROR_MESSAGE);
					username.setText(null);
					password.setText(null);
				}
				StudentMarksSystem.main(null);
			}
		});
		btnLogin.setFont(new Font("Calibri", Font.BOLD, 13));
		btnLogin.setForeground(new Color(255, 0, 0));
		btnLogin.setBackground(new Color(0, 64, 64));
		btnLogin.setBounds(51, 190, 85, 34);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username.setText(null);
				password.setText(null);
			}
		});
		btnReset.setForeground(Color.RED);
		btnReset.setFont(new Font("Calibri", Font.BOLD, 13));
		btnReset.setBackground(new Color(0, 64, 64));
		btnReset.setBounds(182, 190, 85, 34);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Calibri", Font.BOLD, 13));
		btnExit.setBackground(new Color(0, 64, 64));
		btnExit.setBounds(315, 190, 85, 34);
		frame.getContentPane().add(btnExit);
		
		password = new JPasswordField();
		password.setBounds(131, 139, 168, 19);
		frame.getContentPane().add(password);
	}
}
