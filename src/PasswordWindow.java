import javax.swing.*;
import java.awt.*;

public class PasswordWindow extends JFrame {
    public MainPanel mainPanel;
    public SidePanel sidePanel;

    public PasswordWindow() {
        setTitle("Password Manager Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        mainPanel = new MainPanel();
        sidePanel = new SidePanel(this);

        add(sidePanel, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
