import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Win extends JFrame {

  // Login window
	private JPanel rightPanelLoginWindow;
	private JPanel leftPanelLoginWindow;
	private JLabel passwordLabel;
	private JTextField passwordTextField;
	public boolean loginState = true;

	public Win(){
		setTitle("Password manager");
		setSize(1920, 1080);
		getContentPane().setBackground(Color.black);
		setLayout(new BorderLayout());
		if (loginState) 
		loginWindow();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void loginWindow(){
		rightPanelLoginWindow = new JPanel();
		rightPanelLoginWindow.setPreferredSize(new Dimension (this.getWidth() / 2, this.getHeight() / 2));
		rightPanelLoginWindow.setBackground(new Color(251,241,199));
		add(rightPanelLoginWindow, (loginState) ? BorderLayout.WEST : BorderLayout.EAST);

		leftPanelLoginWindow = new JPanel(); 
		leftPanelLoginWindow.setPreferredSize(new Dimension (this.getWidth() / 2, this.getHeight() / 2));
		leftPanelLoginWindow.setBackground(new Color(40,40,40));
		passwordTextField = new JTextField("", 10);
		passwordTextField.setForeground(new Color(251,241,199));
		passwordTextField.setBackground(new Color(40,40,40));
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setForeground(new Color (251,241,199));
		passwordLabel.setFont(new Font("CodeNewRoman NerdFont", Font.PLAIN, 20));
		leftPanelLoginWindow.add(passwordLabel);
		leftPanelLoginWindow.add(passwordTextField);
		add(leftPanelLoginWindow, (loginState) ? BorderLayout.EAST : BorderLayout.WEST);
	}
}
