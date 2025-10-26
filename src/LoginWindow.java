import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.Insets;

public class LoginWindow extends JFrame {
    public LoginWindow() {
        setTitle("Login Demo");
        setPreferredSize(new Dimension(300, 150));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(5, 5, 5, 5);
        gc.fill = GridBagConstraints.HORIZONTAL;

        JLabel userLabel = new JLabel("User: ");
        gc.gridx = 0;
        gc.gridy = 0;
        pane.add(userLabel, gc);
        JTextField userField = new JTextField();
        gc.gridx = 1;
        gc.gridy = 0;
        pane.add(userField, gc);

        JLabel passwordLabel = new JLabel("Password: ");
        gc.gridx = 0;
        gc.gridy = 1;
        pane.add(passwordLabel, gc);
        JTextField passwordField = new JTextField();
        gc.gridx = 1;
        gc.gridy = 1;
        pane.add(passwordField, gc);

        JButton loginButton = new JButton("Login (Demo)");
        gc.gridx = 0;
        gc.gridy = 2;
        gc.gridwidth = 2;
        gc.anchor = GridBagConstraints.CENTER;

        loginButton.addActionListener((ActionEvent e) -> {
            new PasswordWindow();
            dispose(); // close login window
        });
        pane.add(loginButton, gc);
        add(pane);

        pack();
        setVisible(true);
    }
}
