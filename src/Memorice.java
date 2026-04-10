import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Memorice extends JFrame {

    public Memorice() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(117, 202, 251));
        getContentPane().add(panel, BorderLayout.NORTH);
        panel.setLayout(new GridLayout(0, 3, 0, 0));
        
        JLabel lblNewLabel = new JLabel("0");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("0");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("0");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel_2);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(237, 243, 125));
        getContentPane().add(panel_1, BorderLayout.SOUTH);
        
        JButton btnNewButton_1 = new JButton("Reiniciar");
        panel_1.add(btnNewButton_1);
        
        JButton btnNewButton = new JButton("Pausa");
        panel_1.add(btnNewButton);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(137, 246, 216));
        getContentPane().add(panel_2, BorderLayout.CENTER);
        panel_2.setLayout(new GridLayout(3, 4, 5, 5));
        
        JButton btnNewButton_2 = new JButton();
        panel_2.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton();
        panel_2.add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton();
        panel_2.add(btnNewButton_4);
        
        JButton btnNewButton_8 = new JButton();
        panel_2.add(btnNewButton_8);
        
        JButton btnNewButton_6 = new JButton();
        panel_2.add(btnNewButton_6);
        
        JButton btnNewButton_11 = new JButton();
        panel_2.add(btnNewButton_11);
        
        JButton btnNewButton_5 = new JButton();
        panel_2.add(btnNewButton_5);
        
        JButton btnNewButton_7 = new JButton();
        panel_2.add(btnNewButton_7);
        
        JButton btnNewButton_9 = new JButton();
        panel_2.add(btnNewButton_9);
        
        JButton btnNewButton_10 = new JButton();
        panel_2.add(btnNewButton_10);
        
        JButton btnNewButton_12 = new JButton();
        panel_2.add(btnNewButton_12);
        
        JButton btnNewButton_13 = new JButton();
        panel_2.add(btnNewButton_13);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Memorice();
    }
}