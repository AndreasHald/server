package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JPasswordField;

public class Login extends JPanel {
	private final JLabel lblWelcome = new JLabel("Welcome");
	private final JLabel lblUsername = new JLabel("Username");
	private final JLabel lblPassword = new JLabel("Password");
	private final JButton btnLogIn = new JButton("Log In");
	private final JButton btnForgotLogIn = new JButton("Forgot username or password?");
	private final JTextField textFieldUsername = new JTextField();
	private final JLabel lblCBSlogo = new JLabel("");
	private final JLabel lblBackground = new JLabel("");
	private final JPasswordField passwordField = new JPasswordField();
	


	/**
	 * Create the panel.
	 */
	public Login() {
		setSize(new Dimension(1366, 768));
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(105, 105, 105));
		setLayout(null);
		lblWelcome.setCursor(Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
		lblWelcome.setForeground(new Color(255, 255, 255));
		lblWelcome.setFont(new Font("Arial", Font.BOLD, 78));
		lblWelcome.setBounds(491, 182, 346, 107);
		
		add(lblWelcome);
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Arial", Font.BOLD, 26));
		lblUsername.setBounds(491, 334, 164, 31);
		
		add(lblUsername);
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Arial", Font.BOLD, 26));
		lblPassword.setBounds(491, 377, 164, 31);
		
		add(lblPassword);
		btnLogIn.setContentAreaFilled(false);
		btnLogIn.setFont(new Font("Arial", Font.BOLD, 30));
		btnLogIn.setForeground(new Color(255, 255, 255));
		btnLogIn.setBackground(Color.WHITE);
		btnLogIn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textFieldUsername.setOpaque(false);
		textFieldUsername.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUsername.setForeground(Color.BLACK);
		textFieldUsername.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		textFieldUsername.setColumns(10);
		textFieldUsername.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255)));
		textFieldUsername.setBounds(697, 333, 164, 37);
		
		add(textFieldUsername);
		btnLogIn.setBounds(553, 449, 222, 51);
		
		add(btnLogIn);
		btnForgotLogIn.setContentAreaFilled(false);
		btnForgotLogIn.setForeground(new Color(255, 255, 255));
		btnForgotLogIn.setBorderPainted(false);
		btnForgotLogIn.setBounds(546, 500, 236, 29);
		
		add(btnForgotLogIn);
		lblCBSlogo.setIcon(new ImageIcon(Login.class.getResource("/Images/CBSLogo3.png")));
		lblCBSlogo.setBounds(32, 703, 250, 59);
		
		add(lblCBSlogo);
		setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		passwordField.setOpaque(false);
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setColumns(10);
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255)));
		passwordField.setBounds(697, 371, 164, 37);
		
		add(passwordField);
		lblBackground.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackground.setIcon(new ImageIcon(Login.class.getResource("/Images/MetalBackground.jpg")));
		lblBackground.setSize(new Dimension(1366, 768));
		lblBackground.setBounds(0, 0, 1366, 768);
		
		add(lblBackground);

	}

	public JTextField getTextField() {
		return textFieldUsername;
	}


	public JButton getBtnLogIn() {
		return btnLogIn;
	}

	public JButton getBtnForgotLogIn() {
		return btnForgotLogIn;
	}
	public void addActionListener(ActionListener l) {
		btnLogIn.addActionListener(l);
		btnForgotLogIn.addActionListener(l);
}

	public JTextField getTextFieldUsername() {
		return textFieldUsername;
	}


	}