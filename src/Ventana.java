
	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.Font;

	import javax.swing.JFrame;
	import javax.swing.JLabel;

	public class Ventana extends JFrame{

	    public Ventana(){

	       

	        this.setVisible(true);
	        this.setBounds(200, 200, 500, 500);
	        this.setLocationRelativeTo(null);
	        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	        this.setMinimumSize(new Dimension(200, 200));
	        this.setMaximumSize(new Dimension(800, 800));
	        this.setTitle("hola");
	        this.setLayout(null);
	        this.getContentPane().setBackground(Color.black);

	       

	        JLabel tag_tittle = new JLabel();
	        tag_tittle.setText("Bien");
	        tag_tittle.setSize(100, 40);
	        tag_tittle.setLocation(175, 50);
	        tag_tittle.setBackground(Color.white);
	        tag_tittle.setOpaque(true);
	        tag_tittle.setFont(new Font("Arial", Font.PLAIN, 22));
	        tag_tittle.setHorizontalAlignment(JLabel.CENTER);
	        this.add(tag_tittle);

	    }

	}

