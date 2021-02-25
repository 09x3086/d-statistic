package view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Window extends JFrame {
  public static void main(String[] args) {
    Window window = new Window();

    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    window.setBounds(10, 10, 500, 500);
    window.setTitle("グラフサンプル");
    window.setVisible(true);
  }
}
