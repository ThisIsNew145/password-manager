import java.awt.Color;
import javax.swing.JPanel;

public class SettingsPanel extends JPanel {
  public SettingsPanel() {}
 
  public void toggleColors(boolean blackBackground) {
    setBackground(blackBackground ? Color.BLACK : Color.WHITE);
    setForeground(blackBackground ? Color.WHITE : Color.BLACK);
    repaint();
  }
}
