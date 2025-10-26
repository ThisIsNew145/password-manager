import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SidePanel extends JPanel {
    private boolean toggled = false;

    public SidePanel(PasswordWindow parent) {
        setBackground(Color.BLACK);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton settingsButton = new JButton("Settings Demo");
        settingsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        settingsButton.addActionListener((ActionEvent e) -> {
            new SettingsPanel();
        });

        add(Box.createVerticalGlue());
        add(settingsButton);
        add(Box.createVerticalGlue());
    }
}
