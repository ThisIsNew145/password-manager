import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Win extends JFrame {

  // Login window
  private JPanel rightPanelLoginWindow;
  private JPanel leftPanelLoginWindow;
  private JLabel passwordLabel;
  private JTextField passwordTextField;
  private GridBagConstraints gc;
  public boolean loginState = true;
  private JLabel messageLabel;

  public Win() {
    setTitle("Password manager");
    setSize(1920, 1080);
    getContentPane().setBackground(Color.black);
    setLayout(new BorderLayout());
    if (loginState) loginWindow();

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
  }

  public void loginWindow() {
    rightPanelLoginWindow = new JPanel();
    rightPanelLoginWindow.setPreferredSize(
        new Dimension(this.getWidth() / 2, this.getHeight() / 2));
    rightPanelLoginWindow.setBackground(new Color(251, 241, 199));
    add(rightPanelLoginWindow, (loginState) ? BorderLayout.WEST : BorderLayout.EAST);

		// Left panel stuff
    leftPanelLoginWindow = new JPanel();
    leftPanelLoginWindow.setPreferredSize(new Dimension(this.getWidth() / 2, this.getHeight() / 2));
    leftPanelLoginWindow.setBackground(new Color(40, 40, 40));
    leftPanelLoginWindow.setLayout(new GridBagLayout());
   
    messageLabel =
        new JLabel(
            "You don't need a user name just a password because all of this is done locally so a password is just only needed as I want to/planning to encrypt he login password in hidden file that the program checks the password to let you in (I will learn how to encrypt just me whoever is actually reading this thanks)");
		messageLabel.setForeground(Color.WHITE);

		gc = new GridBagConstraints();
    gc.gridx = 0;
    gc.gridy = 10;
    gc.anchor = GridBagConstraints.CENTER;
		leftPanelLoginWindow.add(messageLabel, gc);

 
    gc.gridx = 0;
    gc.gridy = 0;
	
		// Password text field and label
		passwordTextField = new JTextField("", 10);
    passwordTextField.setForeground(new Color(251, 241, 199));
    passwordTextField.setBackground(new Color(40, 40, 40));
    passwordLabel = new JLabel("Password: ");
    passwordLabel.setForeground(new Color(251, 241, 199));
    passwordLabel.setFont(new Font("CodeNewRoman NerdFont", Font.PLAIN, 90));

    leftPanelLoginWindow.add(passwordLabel, gc);
		gc.gridx = 1;
		gc.gridy = 0;
    leftPanelLoginWindow.add(passwordTextField, gc);
   add(leftPanelLoginWindow, (loginState) ? BorderLayout.EAST : BorderLayout.WEST);
  }
}
