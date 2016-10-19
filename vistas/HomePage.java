package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HomePage extends JFrame implements ActionListener {
	/**
	 * 
	 */
	JButton monitor,ventas,productos, inventario,categorias,reportes,usuarios;
	JLabel enc_a,enc_b;
	Monitoreo ventana1=new Monitoreo();
	Tipo_Pedido ventana2=new Tipo_Pedido();
	Stock ventana3=new Stock();
	
	public HomePage(){
		setLayout(null);
		setTitle("Pagina de Inicio");
		
		enc_a=new JLabel(new ImageIcon("imagenes/man.png"));
		enc_a.setBounds(130, 30, 120, 50);
		add(enc_a);

		
		enc_b=new JLabel(new ImageIcon("imagenes/ger.png"));
		enc_b.setBounds(230, 30, 120, 60);
		add(enc_b);
		
		monitor=new JButton("Monitor");
		monitor.setBounds(150, 120, 200, 50);
		monitor.setIcon(new ImageIcon("imagenes/monitor.png"));
		monitor.setIconTextGap(2);
		monitor.addActionListener(this);
		add(monitor);
				
		ventas=new JButton("Ventas");
		ventas.setBounds(150, 200, 200, 50);
		ventas.setIcon(new ImageIcon("imagenes/ventas.png"));
		ventas.addActionListener(this);
		add(ventas);		
		
		productos=new JButton("Productos");
		productos.setBounds(150, 280, 200, 50);
		productos.setIcon(new ImageIcon("imagenes/productos.png"));
		productos.setIconTextGap(2);
		productos.addActionListener(this);
		add(productos);
				
		inventario=new JButton("Stock");
		inventario.setBounds(150, 360, 200, 50);
		inventario.setIcon(new ImageIcon("imagenes/inventario.png"));
		inventario.setIconTextGap(2);
		inventario.addActionListener(this);
		add(inventario);
				
		categorias=new JButton("Pedidos");
		categorias.setBounds(150, 440, 200, 50);
		categorias.setIcon(new ImageIcon("imagenes/categorias.png"));
		categorias.addActionListener(this);
		add(categorias);
		
		reportes=new JButton("Informes");
		reportes.setBounds(150, 520, 200, 50);
		reportes.setIcon(new ImageIcon("imagenes/informe.png"));
		reportes.setIconTextGap(2);
		reportes.addActionListener(this);
		add(reportes);
		
		usuarios=new JButton("Usuarios");
		usuarios.setBounds(150, 600, 200, 50);
		usuarios.setIcon(new ImageIcon("imagenes/usuarios.png"));
		usuarios.setIconTextGap(2);
		usuarios.addActionListener(this);
		add(usuarios);
	}

	private static final long serialVersionUID = 1L;
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==monitor){
				ventana1.setVisible(true);
		}
		if (e.getSource()==categorias){
				ventana2.setSize(500,700);
				ventana2.setLocationRelativeTo(null);
				ventana2.setVisible(true);;
		}
		if (e.getSource()==inventario){
			ventana3.setSize(500,200);		
			ventana3.setLocationRelativeTo(null);
			ventana3.setVisible(true);
	}
		
	}

}
