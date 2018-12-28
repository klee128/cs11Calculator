import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//make sure that when the textfield are empty, equations don't run
public class Calculator extends JFrame {
	JTextField f1, f2;
	JLabel l1, l2, result, r1;
	JButton add, minus, multiply, divide, bee, c1, c2, quit;
	JOptionPane error;
	
	Calculator(){
		//sets up basics to the frame
		this.setSize(500,350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints con = new GridBagConstraints();
		this.setLayout(layout);
		
		//label for F1
		l1 = new JLabel("F1:");
		con.weightx = 0;
		con.weighty = 0;
		con.gridx = 0;
		con.gridy = 0;
		layout.setConstraints(l1, con);
		
		//label for F2
		l2 = new JLabel("F2:");
		con.weightx = 0;
		con.weighty = 0;
		con.gridx = 5;
		con.gridy = 0;
		layout.setConstraints(l2, con);
		
		//label for result
		r1 = new JLabel("result:");
		con.weightx = 0;
		con.weighty = 0;
		con.gridx = 10;
		con.gridy = 0;
		layout.setConstraints(r1, con);
		
		//text field for F1
		f1 = new JTextField(null, 14);
		con.weightx = 0;
		con.weighty = 0;
		con.gridx = 0;
		con.gridy = 1;
		layout.setConstraints(f1, con);
		
		//text field for F2
		f2 = new JTextField(null, 14);
		con.weightx = 0;
		con.weighty = 0;
		con.gridx = 5;
		con.gridy = 1;
		layout.setConstraints(f2, con);
		
		//label for end result
		result = new JLabel("0");
		con.weightx = 0;
		con.weighty = 0;
		con.gridx = 10;
		con.gridy = 1;
		layout.setConstraints(result, con);
		
		
		//this does add function
		add = new JButton("+");
		con.weighty = 1;
		con.weighty = 0;
		con.gridx = 0;
		con.gridy = 10;
		layout.setConstraints(add, con);
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (f1.getText().equals("") || f2.getText().equals("")) {
					error = new JOptionPane();
					JOptionPane.showMessageDialog(null, "ERROR! You are missing one or more inputs. Please Try Again!","Error Message", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String n1 = f1.getText();
					String n2 = f2.getText();
					double num1 = Double.parseDouble(n1);
					double num2 = Double.parseDouble(n2);
					double end = num1 + num2;
					String endres = String.valueOf(end);
					
					result.setText(endres);
				}
			}	
		});
		
		//this does minus function
		minus = new JButton("-");
		con.weightx = 1;
		con.weighty = 0;
		con.gridx = 5;
		con.gridy = 10;
		layout.setConstraints(minus, con);
		
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (f1.getText().equals("") || f2.getText().equals("")) {
					error = new JOptionPane();
					JOptionPane.showMessageDialog(null, "ERROR! You are missing one or more inputs. Please Try Again!","Error Message", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String n1 = f1.getText();
					String n2 = f2.getText();
					double num1 = Double.parseDouble(n1);
					double num2 = Double.parseDouble(n2);
					double end = num1 - num2;
					String endres = String.valueOf(end);
					
					result.setText(endres);
				}
			}	
		});
		
		//this does multiply function
		multiply = new JButton("*");
		con.weightx = 1;
		con.weighty = 1;
		con.gridx = 8;
		con.gridy = 10;
		layout.setConstraints(multiply, con);
		
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (f1.getText().equals("") || f2.getText().equals("")) {
					error = new JOptionPane();
					JOptionPane.showMessageDialog(null, "ERROR! You are missing one or more inputs. Please Try Again!","Error Message", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String n1 = f1.getText();
					String n2 = f2.getText();
					double num1 = Double.parseDouble(n1);
					double num2 = Double.parseDouble(n2);
					double end = num1 * num2;
					String endres = String.valueOf(end);
					
					result.setText(endres);
				}
			}	
		});
		
		//this does divide function
			divide = new JButton("/");
			con.weightx = 1;
			con.weighty = 1;
			con.gridx = 15;
			con.gridy = 10;
			layout.setConstraints(divide, con);
				
			divide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (f1.getText().equals("") || f2.getText().equals("")) {
						error = new JOptionPane();
						JOptionPane.showMessageDialog(null, "ERROR! You are missing one or more inputs. Please Try Again!","Error Message", JOptionPane.ERROR_MESSAGE);
					}
					else {
						String n1 = f1.getText();
						String n2 = f2.getText();
						double num1 = Double.parseDouble(n1);
						double num2 = Double.parseDouble(n2);
						double end = num1 / num2;
						String endres = String.valueOf(end);
						if (num2 != 0)
							result.setText(endres);
						else
							result.setText("Denominator is 0. Try again.");
						}
					}	
				});
		
				
		//copies down result to f1
		c1 = new JButton("copy to F1");
		con.gridx = 0;
		con.gridy = 20;
		layout.setConstraints(c1, con);
		
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String r1 = result.getText();
				double res = Double.parseDouble(r1);
				String resu = String.valueOf(res);
				f1.setText(resu);
				
			}
		});
		
		//copies down result to f2
			c2 = new JButton("copy to F2");
			con.gridx = 5;
			con.gridy = 20;
			layout.setConstraints(c2, con);
				
			c2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String r2 = result.getText();
					double resu = Double.parseDouble(r2);
					String resul = String.valueOf(resu);
					f2.setText(resul);		
				}
			});
		
				
		//creates a quit button
			quit = new JButton("Quit");
			con.gridx = 0;
			con.gridy = 30;
			layout.setConstraints(quit, con);
			
			quit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				}
			});
		
			
		//puts everything on screen
		this.add(l1);
		this.add(l2);
		this.add(r1);
		this.add(f1);
		this.add(f2);
		this.add(result);
		this.add(add);
		this.add(minus);
		this.add(multiply);
		this.add(divide);
		this.add(c1);
		this.add(c2);
		this.add(quit);

		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Calculator calculat = new Calculator();
	}
}