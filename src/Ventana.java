import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.BorderFactory; 
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {

    public Ventana() {
        // --- Configuración de la Ventana Principal ---
        this.setTitle("Sistema de Acceso");
        this.setSize(850, 550); // Aumenté el ancho para que quepan los dos paneles
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(240, 242, 245));

        // ================= PANEL DE LOGIN (IZQUIERDA) =================
        JPanel login_container = new JPanel();
        login_container.setSize(350, 420);
        login_container.setLocation(25, 40);
        login_container.setBackground(Color.WHITE);
        login_container.setLayout(null);
        login_container.setBorder(new LineBorder(new Color(200, 200, 200), 1));
        this.add(login_container);

        JLabel tag_tittle = new JLabel("BIENVENIDO");
        tag_tittle.setBounds(0, 20, 350, 60);
        tag_tittle.setForeground(new Color(44, 62, 80));
        tag_tittle.setFont(new Font("Segoe UI", Font.BOLD, 26));
        tag_tittle.setHorizontalAlignment(SwingConstants.CENTER);
        login_container.add(tag_tittle);

        JLabel usuario = new JLabel("Correo Electrónico");
        usuario.setBounds(40, 90, 270, 20);
        usuario.setFont(new Font("Segoe UI", Font.BOLD, 12));
        login_container.add(usuario);

        JTextField email_input = new JTextField();
        email_input.setBounds(40, 115, 270, 35);
        login_container.add(email_input);

        JLabel password = new JLabel("Contraseña");
        password.setBounds(40, 170, 270, 20);
        password.setFont(new Font("Segoe UI", Font.BOLD, 12));
        login_container.add(password);

        JPasswordField password_input = new JPasswordField();
        password_input.setBounds(40, 195, 270, 35);
        login_container.add(password_input);

        JCheckBox rememberme = new JCheckBox("Recordarme");
        rememberme.setBounds(40, 240, 150, 30);
        rememberme.setBackground(Color.WHITE);
        login_container.add(rememberme);

        JButton acces_btn = new JButton("ACCEDER");
        acces_btn.setBounds(40, 300, 270, 45);
        acces_btn.setBackground(new Color(52, 152, 219));
        acces_btn.setForeground(Color.WHITE);
        acces_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login_container.add(acces_btn);

       
        JPanel rgs_container = new JPanel(); 
        rgs_container.setBounds(410, 20, 380, 470);
        rgs_container.setBackground(new Color(25, 42, 86));
        rgs_container.setLayout(null);
        this.add(rgs_container);

        JLabel tituloRegistro = new JLabel("REGISTRO");
        tituloRegistro.setBounds(80, 15, 220, 40);
        tituloRegistro.setHorizontalAlignment(SwingConstants.CENTER);
        tituloRegistro.setOpaque(true);
        tituloRegistro.setBackground(new Color(30, 30, 30));
        tituloRegistro.setForeground(Color.WHITE);
        tituloRegistro.setFont(new Font("Arial", Font.BOLD, 22));
        rgs_container.add(tituloRegistro);

        JTextField txtNombreReg = new JTextField();
        txtNombreReg.setBounds(40, 80, 300, 30);
        txtNombreReg.setBorder(BorderFactory.createTitledBorder("Nombre de Usuario"));
        rgs_container.add(txtNombreReg);

        JTextArea bio_text = new JTextArea();
        bio_text.setBounds(40, 130, 300, 60);
        bio_text.setBorder(BorderFactory.createTitledBorder("Biografía"));
        
        this.setVisible(true);
        this.repaint();
    }
}