package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMarksSystem {

	private JFrame frame;
	private JTextField sub1;
	private JTextField sub2;
	private JTextField sub3;
	private JTextField totalmarks;
	private JTextField average;
	private JTextField grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarksSystem window = new StudentMarksSystem();
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
	public StudentMarksSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), new Color(255, 128, 64), new Color(0, 64, 128), new Color(64, 0, 64)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Marks Calculation");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.BOLD, 15));
		lblNewLabel.setBounds(79, 7, 274, 27);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Subject2:");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1.setBounds(26, 93, 71, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Subject1:");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(26, 56, 71, 27);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Subject3:");
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(26, 130, 71, 27);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Total Marks:");
		lblNewLabel_1_2_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1_2_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(26, 162, 71, 27);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Average:");
		lblNewLabel_1_2_1_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1_2_1_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1_2_1_1.setBounds(26, 189, 71, 27);
		panel.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Grade:");
		lblNewLabel_1_2_1_1_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1_2_1_1_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1_2_1_1_1.setBounds(26, 226, 71, 27);
		panel.add(lblNewLabel_1_2_1_1_1);
		
		sub1 = new JTextField();
		sub1.setBounds(98, 58, 96, 19);
		panel.add(sub1);
		sub1.setColumns(10);
		
		sub2 = new JTextField();
		sub2.setColumns(10);
		sub2.setBounds(98, 95, 96, 19);
		panel.add(sub2);
		
		sub3 = new JTextField();
		sub3.setColumns(10);
		sub3.setBounds(98, 132, 96, 19);
		panel.add(sub3);
		
		totalmarks = new JTextField();
		totalmarks.setColumns(10);
		totalmarks.setBounds(98, 164, 96, 19);
		panel.add(totalmarks);
		
		average = new JTextField();
		average.setColumns(10);
		average.setBounds(98, 191, 96, 19);
		panel.add(average);
		
		grade = new JTextField();
		grade.setColumns(10);
		grade.setBounds(98, 228, 96, 19);
		panel.add(grade);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1 = Integer.parseInt(sub1.getText());
				int s2 = Integer.parseInt(sub1.getText());
				int s3 = Integer.parseInt(sub1.getText());
				int total = s1 + s2 + s3;
				float avg = total/3;
				
				totalmarks.setText(String.valueOf(total));
				average.setText(String.valueOf(avg));

				if(avg>45) {
					grade.setText("Passed");
				}
				else {
					grade.setText("Failed");
				}
			}
		});
		btnAdd.setForeground(new Color(128, 255, 255));
		btnAdd.setBackground(new Color(0, 64, 128));
		btnAdd.setBounds(256, 73, 71, 27);
		panel.add(btnAdd);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sub1.setText("");
				sub2.setText("");
				sub3.setText("");
				totalmarks.setText("");
				average.setText("");
				grade.setText("");
				sub1.requestFocus();
			}
		});
		btnClear.setForeground(new Color(128, 255, 255));
		btnClear.setBackground(new Color(0, 64, 128));
		btnClear.setBounds(256, 113, 71, 27);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(128, 255, 255));
		btnExit.setBackground(new Color(0, 64, 128));
		btnExit.setBounds(256, 163, 71, 27);
		panel.add(btnExit);
	}
}
