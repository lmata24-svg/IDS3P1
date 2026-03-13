import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	public Ventana() {

		this.setSize(1000, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(200, 200));
		this.setMaximumSize(new Dimension(900, 700));
		this.setLocationRelativeTo(null);
		this.setTitle("Hola");
		this.setLayout(null);
		this.getContentPane().setBackground(Color.black);

		try {
			Image iconImage = ImageIO.read(getClass().getResource("/buho/buho.png"));
			this.setIconImage(iconImage);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JMenuBar barra = new JMenuBar();
		JMenu menu1 = new JMenu("Archivo");
		barra.add(menu1);

		JMenuItem opt1 = new JMenuItem("Abrir");
		menu1.add(opt1);
		JMenuItem opt2 = new JMenuItem("Nuevo");
		menu1.add(opt2);
		JMenuItem opt3 = new JMenuItem("Cerrar");
		menu1.add(opt3);

		menu1.addSeparator();

		JMenu menu2 = new JMenu("Guardar");
		menu1.add(menu2);
		JMenuItem opt4 = new JMenuItem("Abrir");
		menu2.add(opt4);
		JMenuItem opt5 = new JMenuItem("Nuevo");
		menu2.add(opt5);

		this.setJMenuBar(barra);
		
		this.pintar();

		this.setVisible(true);
		this.repaint();
	}

	public void login() {
		JPanel login_container = new JPanel();
		login_container.setSize(400, 400);
		login_container.setLocation(50, 50);
		login_container.setBackground(Color.decode("#B979E8"));
		login_container.setLayout(null);
		this.add(login_container);

		JLabel tag_title = new JLabel();
		tag_title.setText("Bienvenido");
		tag_title.setSize(150, 30);
		tag_title.setLocation(125, 20);
		tag_title.setBackground(Color.white);
		tag_title.setOpaque(true);
		tag_title.setFont(new Font("Arial", Font.PLAIN, 22));
		tag_title.setVerticalAlignment(JLabel.CENTER);
		tag_title.setHorizontalAlignment(JLabel.CENTER);
		login_container.add(tag_title);

		JLabel tag_email = new JLabel("Correo electrónico");
		tag_email.setBounds(61, 120, 150, 30);
		tag_email.setBackground(Color.white);
		tag_email.setOpaque(true);
		login_container.add(tag_email);

		JTextField email_input = new JTextField();
		email_input.setSize(280, 40);
		email_input.setLocation(60, 150);
		login_container.add(email_input);

		JLabel tag_password = new JLabel("Contraseña");
		tag_password.setBounds(61, 200, 150, 30);
		tag_password.setBackground(Color.white);
		tag_password.setOpaque(true);
		login_container.add(tag_password);

		JPasswordField password = new JPasswordField();
		password.setSize(280, 40);
		password.setLocation(60, 230);
		login_container.add(password);

		JCheckBox rememberme = new JCheckBox("Hola");
		rememberme.setSize(140, 40);
		rememberme.setLocation(60, 300);
		login_container.add(rememberme);

		JButton access_btn = new JButton();
		access_btn.setText("Acceder");
		access_btn.setBounds(100, 350, 200, 40);
		access_btn.setFont(new Font("Arial", Font.ITALIC, 18));
		login_container.add(access_btn);
	}

	public void registro() {
		JPanel rgs_container = new JPanel();
		rgs_container.setBounds(500, 50, 400, 400);
		rgs_container.setOpaque(true);
		rgs_container.setBackground(Color.green);
		rgs_container.setLayout(null);
		this.add(rgs_container);

		JLabel bio_tag = new JLabel("BIO");
		bio_tag.setBounds(50, 50, 300, 40);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(true);
		rgs_container.add(bio_tag);

		JTextArea bio_text = new JTextArea();
		bio_text.setLocation(50, 100);
		bio_text.setSize(300, 80);
		rgs_container.add(bio_text);

		JCheckBox opt_sweet = new JCheckBox("Dulce");
		opt_sweet.setBounds(50, 200, 100, 40);
		opt_sweet.setOpaque(true);
		opt_sweet.setForeground(Color.red);
		rgs_container.add(opt_sweet);

		JCheckBox opt_salty = new JCheckBox("Salado");
		opt_salty.setBounds(150, 200, 100, 40);
		opt_salty.setOpaque(true);
		opt_salty.setForeground(Color.black);
		rgs_container.add(opt_salty);

		JCheckBox opt_healty = new JCheckBox("Saludable");
		opt_healty.setBounds(250, 200, 100, 40);
		opt_healty.setOpaque(true);
		rgs_container.add(opt_healty);

		JRadioButton accept_terms = new JRadioButton("Acepto los términos");
		accept_terms.setBounds(50, 260, 180, 40);
		rgs_container.add(accept_terms);

		JRadioButton reject_terms = new JRadioButton("Rechazo los términos");
		reject_terms.setBounds(220, 260, 200, 40);
		rgs_container.add(reject_terms);

		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_terms);
		terms.add(reject_terms);

		String[] colonias = { "Camino real", "Arcoiris", "Villas del encanto", "8 de octubre" };
		JComboBox colonias_combo = new JComboBox(colonias);
		colonias_combo.setBounds(50, 300, 300, 50);
		rgs_container.add(colonias_combo);

		JButton register_btn = new JButton("Crear cuenta");
		register_btn.setBounds(50, 340, 300, 60);
		rgs_container.add(register_btn);
	}

	public void users() {
		JPanel panel_users = new JPanel();
		panel_users.setSize(900, 500);
		panel_users.setLocation(50, 50);
		panel_users.setBackground(Color.decode("#DDDEA6"));
		panel_users.setLayout(null);
		this.add(panel_users);

		String[] table_head = { "No. Control", "Nombre", "Apellidos", "Correo electrónico", "Semestre", "Carrera", "Acciones" };
		Object[][] table_body = {
				{ "20231001", "Carlos", "Ramírez López", "carlos.ramirez@correo.com", "3", "Ingeniería en Sistemas", "Editar" },
				{ "20231002", "María", "González Pérez", "maria.gonzalez@correo.com", "5", "Ingeniería Industrial", "Editar" }
		};

		JTable studens = new JTable(table_body, table_head);
		JScrollPane final_table = new JScrollPane(studens);
		final_table.setSize(700, 150);
		final_table.setLocation(100, 100);

		panel_users.add(final_table);
		panel_users.repaint();
	}

	public void calculadora_layout() {

		JPanel panel_users = new JPanel();
		panel_users.setSize(500, 500);
		panel_users.setLocation(250, 50);
		panel_users.setBackground(Color.decode("#2C3E50"));

		BorderLayout mi_layout1 = new BorderLayout();
		mi_layout1.setVgap(10);
		mi_layout1.setHgap(10);

		panel_users.setLayout(mi_layout1);
		this.add(panel_users);

		JLabel field = new JLabel("180.00");
		field.setOpaque(true);
		field.setBackground(Color.white);
		field.setFont(new Font("Arial", Font.BOLD, 22));
		field.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
		panel_users.add(field, BorderLayout.NORTH);

		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#2D2D30"));
		centro.setLayout(new GridLayout(4, 3, 5, 5));
		panel_users.add(centro, BorderLayout.CENTER);

		String[] botones = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "C"};
		for (String texto : botones) {
			JButton btn = new JButton(texto);
			btn.setFont(new Font("Arial", Font.BOLD, 18));
			centro.add(btn);
		}

		JPanel sidebar = new JPanel();
		sidebar.setBackground(Color.decode("#2D2D30"));
		sidebar.setLayout(new GridLayout(6, 1, 5, 5));
		panel_users.add(sidebar, BorderLayout.EAST);

		String[] botones2 = {"+", "-", "x", "/", "=", "CE"};
		for (int i = 0; i < botones2.length; i++) {
			JButton ce = new JButton(botones2[i]);
			ce.setFont(new Font("Arial", Font.BOLD, 22));
			sidebar.add(ce);
		}
		
		this.repaint();
		this.revalidate();
	}
	
	public void intereses() {

		this.getContentPane().setLayout(new BorderLayout());

		JLabel titulo = new JLabel("Calcular interes");
		titulo.setHorizontalAlignment(JLabel.CENTER);
		this.add(titulo, BorderLayout.NORTH);

		JPanel datos = new JPanel();
		datos.setBackground(Color.decode("#A8E6A3"));
		datos.setLayout(new GridLayout(4,2));
		datos.setBorder(BorderFactory.createTitledBorder("Calcular interes"));

		JLabel capital = new JLabel("Capital:");
		JTextField txtCapital = new JTextField();

		JLabel tiempo = new JLabel("Tiempo:");
		JTextField txtTiempo = new JTextField();

		JLabel tasa = new JLabel("Tasa interes:");
		JTextField txtTasa = new JTextField();

		datos.add(capital);
		datos.add(txtCapital);
		datos.add(tiempo);
		datos.add(txtTiempo);
		datos.add(tasa);
		datos.add(txtTasa);

		JPanel botones = new JPanel();
		botones.setLayout(new FlowLayout());

		JButton calcular = new JButton("Calcular");
		JButton cancelar = new JButton("Cancelar");

		botones.add(calcular);
		botones.add(cancelar);

		datos.add(botones);

		this.add(datos, BorderLayout.CENTER);

		JPanel resultados = new JPanel();
		resultados.setBackground(new Color(255, 200, 200));
		resultados.setLayout(new GridLayout(2,2));
		resultados.setBorder(BorderFactory.createTitledBorder("Resultados"));

		JLabel interes = new JLabel("Interes:");
		JTextField txtInteres = new JTextField();
		txtInteres.setEditable(false);

		JLabel monto = new JLabel("Monto:");
		JTextField txtMonto = new JTextField();
		txtMonto.setEditable(false);

		resultados.add(interes);
		resultados.add(txtInteres);
		resultados.add(monto);
		resultados.add(txtMonto);

		this.add(resultados, BorderLayout.SOUTH);

		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double c = Double.parseDouble(txtCapital.getText());
				double t = Double.parseDouble(txtTiempo.getText());
				double r = Double.parseDouble(txtTasa.getText());

				double i = c * r * t;
				double m = c + i;

				txtInteres.setText("" + i);
				txtMonto.setText("" + m);
			}
		});

		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCapital.setText("");
				txtTiempo.setText("");
				txtTasa.setText("");
				txtInteres.setText("");
				txtMonto.setText("");
			}
		});
	}
	
	public void pintar() {
		JPanel pane = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            Graphics2D g2d = (Graphics2D) g;
            
            g.drawLine(0, 0, 1000, 600);
            
            g2d.setStroke(new BasicStroke(5));
            g2d.setColor(Color.MAGENTA);
            g2d.drawOval(100, 100, 150, 50);
            
            g2d.setStroke(new BasicStroke(7));
            g2d.setColor(Color.GREEN);
            g2d.drawPolygon(new int[] {300,100,400}, new int[] {100,300,200},3);
            
            g2d.setColor(Color.CYAN);
            g2d.drawRect(250, 270, 100, 100);
            
            g2d.setColor(Color.ORANGE);
            g2d.drawRoundRect(400, 150, 100, 100, 10, 10);
            
            g2d.setColor(Color.RED);
            g2d.drawArc(700, 300, 150, 150, 0, 360);
            
            g2d.setFont(new Font("Arial",Font.BOLD,22));
            g2d.drawString("hola", 100, 100);
            
            g2d.setColor(Color.BLUE);
            g2d.fillOval(500, 100, 150, 50);
            
            g2d.setColor(Color.PINK);
            g2d.fillPolygon(new int[] {500,300,700}, new int[] {300,400,500},3);
            
            g2d.setColor(Color.YELLOW);
            g2d.fillRoundRect(670, 85, 100, 100, 10, 10);
            
            g2d.fillArc(800, 400, 150, 150, 0, 180);
            
            BufferedImage image;
			try {
				image = ImageIO.read(new File("src/buho/espada.png"));

	            g2d.drawImage(image, 0, 0, null);
	            
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            }
            
	};
	pane.setSize(1000,700);
	pane.setLocation(0,0);
	this.add(pane);
	}
}