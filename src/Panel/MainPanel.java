import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    public MainPanel() {
        setBackground(Color.WHITE);
    }

    public void toggleColors(boolean blackBackground) {
        setBackground(blackBackground ? Color.BLACK : Color.WHITE);
        setForeground(blackBackground ? Color.WHITE : Color.BLACK);
        repaint();
    }
}
