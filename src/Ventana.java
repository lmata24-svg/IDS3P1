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
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame {

	public Ventana() {
		this.setSize(1000, 750);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(200, 200));
		this.setMaximumSize(new Dimension(1100, 800));
		this.setLocationRelativeTo(null);
		this.setTitle("Hola");
		this.setLayout(null);
		this.getContentPane().setBackground(Color.black);

		try {
			Image iconImage = ImageIO.read(getClass().getResource("/buho/buho.png"));
			this.setIconImage(iconImage);
		} catch (Exception e) {
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
		
		/*this.router("login")*/ 
		this.router("factura");
		this.setVisible(true);
	}
	
	public void router(String target) { 
		this.getContentPane().removeAll();
		
		if (target.equalsIgnoreCase("login"))
			this.login();
		
		if (target.equalsIgnoreCase("registro"))
			this.registro(); 
		
		if (target.equalsIgnoreCase("factura"))
			this.factura();
		
		this.repaint();
		this.revalidate();
	}

	public void login() {
		JPanel login_container = new JPanel();
		login_container.setSize(400, 500);
		login_container.setLocation(50, 20);
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
		
		JButton logBtn = new JButton();
		logBtn.setText("ir a registro");
		logBtn.setBounds(100,410,200,40);
		logBtn.setFont(new Font("Arial",Font.ITALIC,18));
		login_container.add(logBtn);

		logBtn.addActionListener(e ->{
			this.router("registro");
		});
	}

	public void registro() {
		JPanel rgs_container = new JPanel();
		rgs_container.setBounds(50, 20, 400, 500);
		rgs_container.setOpaque(true);
		rgs_container.setBackground(Color.green);
		rgs_container.setLayout(null);
		this.add(rgs_container);

		JLabel bio_tag = new JLabel("BIO");
		bio_tag.setBounds(50, 20, 300, 30);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(true);
		rgs_container.add(bio_tag);

		JTextArea bio_text = new JTextArea();
		bio_text.setLocation(50, 60);
		bio_text.setSize(300, 80);
		rgs_container.add(bio_text);

		JCheckBox opt_sweet = new JCheckBox("Dulce");
		opt_sweet.setBounds(50, 150, 100, 30);
		opt_sweet.setOpaque(true);
		opt_sweet.setForeground(Color.red);
		rgs_container.add(opt_sweet);

		JCheckBox opt_salty = new JCheckBox("Salado");
		opt_salty.setBounds(150, 150, 100, 30);
		opt_salty.setOpaque(true);
		opt_salty.setForeground(Color.black);
		rgs_container.add(opt_salty);

		JCheckBox opt_healty = new JCheckBox("Saludable");
		opt_healty.setBounds(250, 150, 100, 30);
		opt_healty.setOpaque(true);
		rgs_container.add(opt_healty);

		JRadioButton accept_terms = new JRadioButton("Acepto");
		accept_terms.setBounds(50, 190, 140, 30);
		rgs_container.add(accept_terms);

		JRadioButton reject_terms = new JRadioButton("Rechazo");
		reject_terms.setBounds(210, 190, 140, 30);
		rgs_container.add(reject_terms);

		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_terms);
		terms.add(reject_terms);

		String[] colonias = { "Camino real", "Arcoiris", "Villas del encanto", "8 de octubre" };
		JComboBox colonias_combo = new JComboBox(colonias);
		colonias_combo.setBounds(50, 230, 300, 40);
		rgs_container.add(colonias_combo);

		JButton register_btn = new JButton("Crear cuenta");
		register_btn.setBounds(50, 280, 300, 40);
		rgs_container.add(register_btn);
		
		JButton logBtn = new JButton();
		logBtn.setText("Ir a login");
		logBtn.setBounds(100, 340, 200, 40);
		logBtn.setFont(new Font("Arial", Font.ITALIC, 18));
		rgs_container.add(logBtn); 

		logBtn.addActionListener(e -> {
			this.router("login"); 
		});
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

	public void factura() {
		JPanel p1 = new JPanel();
		p1.setBounds(10, 10, 900, 650);
		p1.setLayout(null); 
		this.add(p1);

		JLabel tit = new JLabel("Factura en Java - POO y ArrayList");
		tit.setBounds(10, 5, 400, 20);
		p1.add(tit);

		
		JLabel sub1 = new JLabel("Datos del cliente");
		sub1.setBounds(15, 30, 150, 20);
		p1.add(sub1);

		p1.add(new JLabel("ID:")).setBounds(20, 55, 30, 20);
		p1.add(new JTextField("123456")).setBounds(50, 55, 90, 20);
		
		p1.add(new JLabel("Nombre:")).setBounds(160, 55, 60, 20);
		p1.add(new JTextField("Jhon Doe")).setBounds(220, 55, 180, 20);
		
		p1.add(new JLabel("Dir:")).setBounds(20, 85, 30, 20);
		p1.add(new JTextField("Calle 1 # 123")).setBounds(50, 85, 120, 20);
		
		p1.add(new JLabel("Tel:")).setBounds(185, 85, 40, 20);
		p1.add(new JTextField("5554433")).setBounds(220, 85, 120, 20);

		
		JLabel sub2 = new JLabel("Datos factura");
		sub2.setBounds(450, 30, 100, 20);
		p1.add(sub2);
		
		p1.add(new JLabel("N Fact:")).setBounds(460, 55, 50, 20);
		p1.add(new JLabel("1")).setBounds(520, 55, 50, 20);
		
		p1.add(new JLabel("Fecha:")).setBounds(460, 85, 50, 20);
		p1.add(new JLabel("2021/50/21")).setBounds(520, 85, 100, 20);

	
		JButton btn1 = new JButton("Ver lista");
		btn1.setBounds(15, 130, 100, 25);
		p1.add(btn1);
		
		JButton btn2 = new JButton("Añadir");
		btn2.setBounds(500, 130, 80, 25);
		p1.add(btn2);
		
		JButton btn3 = new JButton("Eliminar");
		btn3.setBounds(590, 130, 90, 25);
		p1.add(btn3);

		
		String[] c = {"Prod", "Cant", "Val", "Sub"};
		Object[][] d = {{"Agua", "2", "500", "1000.0"},{"Cereal", "5", "1000", "5000.0"},{"Leche", "2", "300", "600.0"}};
		JTable t1 = new JTable(new DefaultTableModel(d, c));
		JScrollPane sp1 = new JScrollPane(t1);
		sp1.setBounds(15, 165, 670, 150);
		p1.add(sp1);

		
		p1.add(new JLabel("SubTotal: 6600.0")).setBounds(20, 330, 150, 20);
		
		p1.add(new JLabel("% Desc:")).setBounds(20, 355, 60, 20);
		p1.add(new JTextField("5")).setBounds(80, 355, 30, 20);
		p1.add(new JCheckBox()).setBounds(115, 355, 25, 20);
		
		p1.add(new JLabel("IVA 19%: 1254.0")).setBounds(20, 380, 150, 20);
		p1.add(new JLabel("TOTAL: 7524.0")).setBounds(20, 410, 150, 20);

		
		JButton btn4 = new JButton("Finalizar");
		btn4.setBounds(500, 450, 90, 30);
		p1.add(btn4);
		
		JButton btn5 = new JButton("Limpiar");
		btn5.setBounds(600, 450, 80, 30);
		p1.add(btn5);
	}
}