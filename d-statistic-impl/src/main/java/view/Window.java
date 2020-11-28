package view;

import javax.swing.JFrame;

public class Window extends JFrame {
  public static void main(String[] args) {
    Window window = new Window();

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(10, 10, 500, 500);
    window.setTitle("グラフサンプル");
    window.setVisible(true);
  }
}
