import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.FontUIResource;

public class Frame {
    public Frame() {
        JFrame frame = new JFrame("Meu app");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JButton button = new JButton("java é melhor linguagem do mundo!!");
        button.setBounds(100, 200, 460, 60);
        button.setFont(new FontUIResource("Arial", Font.BOLD, 20));
        button.setForeground(new Color(240, 185, 235));
        button.setBackground(new Color(15, 15, 15));
        button.addActionListener(new teste());
        frame.add(button);


    }
    public class teste implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "java é melhor linguagem do mundo!!");
        }
    }

}
