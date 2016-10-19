package vistas;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stock extends JFrame implements ActionListener{
	JProgressBar barra;
	Border borde,etched,raisedbevel,loweredbevel,empty;
	JButton ok;
	JLabel alerta,fondo;
	
	public Stock(){
		setLayout(null);
		setTitle("¡STOCK BAJO!");
		
		alerta=new JLabel(new ImageIcon("imagenes/alert.png"));
		alerta.setBounds(30, 30, 48, 48);
		add(alerta);
		
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder();
		
		barra=new JProgressBar();
		barra.setBounds(100, 20, 300, 70);
		barra.setOpaque(false);
		barra.setValue(10);
		barra.setStringPainted(true);
		barra.setForeground(Color.red);
		barra.setFont(new java.awt.Font("Lucida Sans", 1, 12));
		etched = BorderFactory.createEtchedBorder();
		borde=BorderFactory.createTitledBorder(loweredbevel,"Estado del Stock",1,2,new java.awt.Font("Arial", 1, 14),Color.white);
		barra.setBorder(borde);
		add(barra);
		
		
		ok =new JButton("Aceptar");
		ok.setBounds(180, 110, 120, 40);
		ok.setIcon(new ImageIcon("imagenes/confirm.png"));
		ok.addActionListener(this);
		add(ok);
			
		fondo=new JLabel(new ImageIcon("imagenes/fondo.jpg"));
		fondo.setSize(500,200);
		add(fondo);
	}
	
	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
