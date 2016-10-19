package vistas;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tipo_Pedido extends JFrame implements ActionListener,ChangeListener{

	JButton iniciar,estado,ok,cancel,back;
	JLabel titulo,subtitulo,nombre,telefono;
	JCheckBox tel,lugar;
	JTextField nom,num;
	ImageIcon icono1,icono2,icono3,alerta=new ImageIcon("imagenes/alert.png");
	int posx=80,posy=300,espacio=20,ancho=150,alto=130;
	Pedidos ventana=new Pedidos();
	public Tipo_Pedido(){
		setLayout(null);
		setTitle("Principal Pedido");
		
		titulo=new JLabel(".::REGISTRO DE PEDIDO::.");
		titulo.setBounds(80, 20, 350, 25);
		titulo.setFont(new java.awt.Font("Arial", 1, 25));
		add(titulo);
		
		subtitulo=new JLabel("Tipo de Pedido");
		subtitulo.setBounds(posx+30, posy-150, ancho, 25);
		subtitulo.setFont(new java.awt.Font("Arial", 1, 20));
		add(subtitulo);
		
		//checkboxes
		tel=new JCheckBox("Telefónico");
		tel.setBounds(posx+30, posy-100, 100, 15);
		tel.setOpaque(false);
		tel.addChangeListener(this);
		add(tel);
		lugar=new JCheckBox("Lugar");
		lugar.setBounds(posx+30, posy-80, 70, 15);
		lugar.setOpaque(false);
		lugar.addChangeListener(this);
		add(lugar);
		
		//Para poner los datos del Cliente
		nombre=new JLabel("Nombre");
		nombre.setBounds(posx+30, posy-60, 100, 25);
		add(nombre);
		nom=new JTextField();
		nom.setBounds(posx+100+espacio, posy-60, ancho, 25);
		nom.setEnabled(false);
		add(nom);
		
		
		telefono=new JLabel("Telefono");
		telefono.setBounds(posx+30, posy-30, 100, 25);
		add(telefono);
		num=new JTextField();
		num.setBounds(posx+100+espacio, posy-30, ancho, 25);
		num.setEnabled(false);
		add(num);
		
		nom.setBackground(Color.gray);
		nom.setEnabled(false);
		num.setBackground(Color.GRAY);
		num.setEnabled(false);
		
		//botones
		iniciar=new JButton(new ImageIcon("imagenes/iniciar.png"));
		iniciar.setBounds(posx, posy+50, ancho, alto);
		iniciar.setEnabled(false);
		iniciar.addActionListener(this);
		add(iniciar);
		
		estado=new JButton(new ImageIcon("imagenes/estado.png"));
		estado.setBounds(posx+ancho+espacio, posy+50, ancho, alto);
		estado.setEnabled(false);
		estado.addActionListener(this);
		add(estado);
		
		posx=posx-30;
		ok=new JButton("Aceptar");
		ok.setBounds(posx, posy+300, 120, 40);
		icono1=new ImageIcon("imagenes/confirm.png");
		ok.setIcon(icono1);
		ok.setIconTextGap(2);
		ok.addActionListener(this);
		add(ok);
		
		posx=posx+120+espacio;
		cancel=new JButton("Cancelar");
		cancel.setBounds(posx, posy+300, 120,40);
		icono2=new ImageIcon("imagenes/cancelar.png");
		cancel.setIcon(icono2);
		cancel.setIconTextGap(2);
		cancel.addActionListener(this);
		add(cancel);
		
		posx=posx+120+espacio;
		back=new JButton("Volver");
		back.setBounds(posx, posy+300, 120,40);
		icono3=new ImageIcon("imagenes/volver.png");
		back.setIcon(icono3);
		back.setIconTextGap(2);
		back.addActionListener(this);
		add(back);
			
	}
	
	
	private static final long serialVersionUID = 1L;
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==iniciar){
			dispose();
			ventana.setSize(900,750);		
			ventana.setLocationRelativeTo(null);
			ventana.setVisible(true);
			ventana.setVisible(true);
		}
		if (e.getSource()==cancel){
			int resp=JOptionPane.showConfirmDialog(null, "¿Esta Seguro de Cancelar el Pedido?","Mensaje de Confirmacion",JOptionPane.YES_NO_OPTION);
			if (resp==0) {
				dispose();	
			}			
		}
		if (e.getSource()==back){
			dispose();
		}
	}

	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub	
		if (tel.isSelected()==true){
			lugar.setEnabled(false);
			num.setBackground(Color.white);
			num.setEnabled(true);
			nom.setBackground(Color.white);
			nom.setEnabled(true);
			iniciar.setEnabled(true);
			estado.setEnabled(true);
			
		}
		else{
			lugar.setEnabled(true);
			nom.setBackground(Color.GRAY);
			nom.setEnabled(false);
			num.setBackground(Color.GRAY);
			num.setEnabled(false);
			iniciar.setEnabled(false);
			estado.setEnabled(false);
		}
		if (lugar.isSelected()==true){
			tel.setEnabled(false);
			iniciar.setEnabled(true);
			estado.setEnabled(true);
		}
		else{
			tel.setEnabled(true);
		}
			
	}

}
