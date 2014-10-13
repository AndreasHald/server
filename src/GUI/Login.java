package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Login extends JPanel {
	private final JLabel lblWelcome = new JLabel("Welcome");
	private final JLabel lblUsername = new JLabel("Username");
	private final JTextField textFieldUsername = new JTextField();
	private final JLabel lblPassword = new JLabel("Password");
	private final JTextField textFieldPassword = new JTextField();
	private final JButton btnLogIn = new JButton("Log In");
	private final JButton btnForgotLogIn = new JButton("Forgot log in?");
	private final JLabel label = new JLabel("");

	/**
	 * Create the panel.
	 */
	public Login() {
		textFieldPassword.setBounds(174, 169, 86, 20);
		textFieldPassword.setColumns(10);
		textFieldUsername.setBounds(173, 116, 86, 20);
		textFieldUsername.setColumns(10);
		setLayout(null);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWelcome.setBounds(177, 11, 93, 25);
		
		add(lblWelcome);
		lblUsername.setBounds(187, 90, 59, 14);
		
		add(lblUsername);
		
		add(textFieldUsername);
		lblPassword.setBounds(196, 148, 63, 14);
		
		add(lblPassword);
		
		add(textFieldPassword);
		btnLogIn.setBounds(175, 206, 89, 23);
		
		add(btnLogIn);
		btnForgotLogIn.setBounds(173, 240, 97, 23);
		
		add(btnForgotLogIn);
		label.setIcon(new ImageIcon(Login.class.getResource("/GUI/background.jpg")));
		label.setBounds(0, 0, 453, 312);
		
		add(label);

	}

	public JTextField getTextField() {
		return textFieldUsername;
	}

	public JTextField getTextField_1() {
		return textFieldPassword;
	}

	public JButton getBtnLogIn() {
		return btnLogIn;
	}

	public JButton getBtnForgotLogIn() {
		return btnForgotLogIn;
	}
}
