package vistas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{

	/**
	 * 
	 */
	JButton aceptar,cerrar;
	JTextField texto1;
	JLabel usuario,pass,imagen,pieimagen;
	JLabel fondo;
	JPasswordField texto2;
	ImageIcon icono1,icono2;
	HomePage hp=new HomePage();
		
	public Login(){
		setLayout(null);
		setTitle("Iniciar Sesión");
			
		aceptar=new JButton("Aceptar");
		aceptar.setBounds(50,380 , 120, 40);
		icono1=new ImageIcon("imagenes/confirm.png");
		aceptar.setIcon(icono1);
		aceptar.setIconTextGap(2);
		aceptar.addActionListener(this);
		add(aceptar);

		cerrar=new JButton("Cerrar");
		cerrar.setBounds(300,380 , 120, 40);
		icono2=new ImageIcon("imagenes/close.png");
		cerrar.setIcon(icono2);
		cerrar.setIconTextGap(2);
		cerrar.addActionListener(this);
		add(cerrar);
		
		texto1=new JTextField();
		texto1.setBounds(200, 220, 150, 20);
		add(texto1);
		
		texto2=new JPasswordField();
		texto2.setBounds(200, 250, 150, 20);
		add(texto2);
		
		usuario=new JLabel("Usuario");
		usuario.setBounds(100, 220, 60, 20);
		usuario.setFont(new java.awt.Font("Lucida Sans", 1, 14));
		usuario.setForeground(Color.black);
		add(usuario);
		
		pass=new JLabel("Contraseña");
		pass.setBounds(100, 250, 100, 20);
		pass.setFont(new java.awt.Font("Lucida Sans", 1, 14));
		pass.setForeground(Color.black);
		add(pass);
				
		pieimagen=new JLabel(new ImageIcon("imagenes/pibe.png"));
		pieimagen.setBounds(120, 50, 250, 60);
		add(pieimagen);
		
		imagen=new JLabel(new ImageIcon("imagenes/rubro.png"));
		imagen.setBounds(50, 100, 400, 60);
		add(imagen);

		fondo=new JLabel(new ImageIcon("imagenes/pizza_y_empanadas.jpg"));
		fondo.setSize(500, 450);
		add(fondo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()== cerrar)
			System.exit(0);	
		if (e.getSource()==aceptar){
			dispose();
			hp.setSize(500, 750);
			hp.setUndecorated(false);
			hp.setLocationRelativeTo(null);
			hp.setVisible(true);
			hp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	}
	
}
