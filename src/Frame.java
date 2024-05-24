import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.FontUIResource;

public class Frame {
    public Frame() {
        JFrame frame = new JFrame("Meu app");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JButton button = new JButton("Teste");
        button.setBounds(200, 200, 160, 60);
        button.setFont(new FontUIResource("Arial", Font.BOLD, 20));
        button.setForeground(new Color(240, 185, 235));
        button.setBackground(new Color(15, 15, 15));
        frame.add(button);
    }
}
