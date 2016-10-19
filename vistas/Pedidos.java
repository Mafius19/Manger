package vistas;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Pedidos extends JFrame implements ActionListener{
	/**
	 * 
	 */
	int posy=150,posx=50,ancho=120,alto=60,espacio=40;
	int sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0,sum10=0,sum11=0,sum12=0,sum13=0,sum14=0,sum15=0,sum16=0,sum17=0,sum18=0,sum19=0,sum20=0;
	JLabel titulo;
	JButton ok, cancel, back,carne, pollo, queso, matambre, arabe,verdura_c,verdura_p,choclo,jamon_queso;
	JButton comun,especial,tres_quesos,doble_crema,fugazzeta,palmitos,napolitana,jamon,morron_aji,anchoas,calabresa;
	JLabel text1,text2;
	JLabel titcarne,titpollo,titqueso,titmatambre,titarabe,titverdura_c,titverdura_p,titchoclo,titjamon_queso;
	JLabel titcomun,titespecial,tittres_quesos,titdoble_crema,titfugazzeta,titpalmitos,titnapolitana,titjamon,titmorron_aji,titanchoas,titcalabresa;
	JLabel cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10,cont11,cont12,cont13,cont14,cont15,cont16,cont17,cont18,cont19,cont20,cantidad;
	JButton rmv1,rmv2,rmv3,rmv4,rmv5,rmv6,rmv7,rmv8,rmv9,rmv10,rmv11,rmv12,rmv13,rmv14,rmv15,rmv16,rmv17,rmv18,rmv19,rmv20;
	JLabel pizza,empanada;
	//icono1: icono para el botono ok
	//icono2: icono para el botono cancelar
	//icono3: icono para el botono volver
	ImageIcon icono1,icono2,icono3;
	JLabel prueba;
	Detalle_Pedido det= new Detalle_Pedido();
public Pedidos(){
		
		setLayout(null);
		setTitle("Pedidos");
		
		titulo=new JLabel(new ImageIcon("imagenes/pedidos.png"));
		titulo.setBounds(320,10, 200, 65);
		add(titulo);
		
		text1=new JLabel(new ImageIcon("imagenes/empanadastitulo.png"));
		text1.setBounds(50, 70, 250, 66);
		add(text1);
		/*Se definira el panel de tipos de empanadas*/
		/*Fila 1 Columna 1*/
		carne=new JButton(new ImageIcon("imagenes/empcarne.jpg"));
		carne.setBounds(posx, posy, ancho, alto);
		carne.addActionListener(this);
		add(carne);
		titcarne=new JLabel("Carne");
		titcarne.setBounds(posx+20,posy+alto,ancho,20);
		add(titcarne);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont1=new JLabel();
		cont1.setOpaque(true);
		cont1.setBackground(Color.ORANGE);
		cont1.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont1);
		rmv1=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv1.addActionListener(this);
		rmv1.setBounds(posx, posy-15, 15, 15);
		add(rmv1);
		posx=posx+ancho+espacio;
		
		/*Fila 1 Columna 2*/
		pollo=new JButton(new ImageIcon("imagenes/empollo.jpg"));
		pollo.setBounds(posx, posy, ancho, alto);
		pollo.addActionListener(this);
		add(pollo);
		titpollo=new JLabel("Pollo");
		titpollo.setBounds(posx+20,posy+alto,ancho,20);
		add(titpollo);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont2=new JLabel();
		cont2.setOpaque(true);
		cont2.setBackground(Color.ORANGE);
		cont2.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont2);
		rmv2=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv2.addActionListener(this);
		rmv2.setBounds(posx, posy-15, 15, 15);
		add(rmv2);
		posx=posx+ancho+espacio;
		
		/*Fila 1 Columna 3*/
		queso=new JButton(new ImageIcon("imagenes/empqueso.jpg"));
		queso.setBounds(posx, posy, ancho, alto);
		queso.addActionListener(this);
		add(queso);
		titqueso=new JLabel("Queso");
		titqueso.setBounds(posx+20,posy+alto,ancho,20);
		add(titqueso);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont3=new JLabel();
		cont3.setOpaque(true);
		cont3.setBackground(Color.ORANGE);
		cont3.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont3);
		rmv3=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv3.addActionListener(this);
		rmv3.setBounds(posx, posy-15, 15, 15);
		add(rmv3);
		posx=posx+ancho+espacio;
		
		/*Fila 1 Columna 4*/
		matambre=new JButton(new ImageIcon("imagenes/empmatambre.jpg"));
		matambre.setBounds(posx, posy, ancho, alto);
		matambre.addActionListener(this);
		add(matambre);
		titmatambre=new JLabel("Matambre");
		titmatambre.setBounds(posx+20,posy+alto,ancho,20);
		add(titmatambre);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont4=new JLabel();
		cont4.setOpaque(true);
		cont4.setBackground(Color.ORANGE);
		cont4.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont4);
		rmv4=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv4.addActionListener(this);
		rmv4.setBounds(posx, posy-15, 15, 15);
		add(rmv4);
		posx=posx+ancho+espacio;
		
		/*Fila 1 Columna 5*/
		arabe=new JButton(new ImageIcon("imagenes/emparabes.jpg"));
		arabe.setBounds(posx, posy, ancho, alto);
		arabe.addActionListener(this);
		add(arabe);
		titarabe=new JLabel("Arabe");
		titarabe.setBounds(posx+20,posy+alto,ancho,20);
		add(titarabe);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont5=new JLabel();
		cont5.setOpaque(true);
		cont5.setBackground(Color.ORANGE);
		cont5.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont5);
		rmv5=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv5.addActionListener(this);
		rmv5.setBounds(posx, posy-15, 15, 15);
		add(rmv5);
		posy=posy+alto+espacio;
		posx=50;
		
		/*Fila 2 Columna 1*/
		verdura_c=new JButton(new ImageIcon("imagenes/empverduracarne.jpg"));
		verdura_c.setBounds(posx, posy, ancho, alto);
		verdura_c.addActionListener(this);
		add(verdura_c);
		titverdura_c=new JLabel("Verdura y Carne");
		titverdura_c.setBounds(posx+10,posy+alto,ancho,20);
		add(titverdura_c);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont6=new JLabel();
		cont6.setOpaque(true);
		cont6.setBackground(Color.ORANGE);
		cont6.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont6);
		rmv6=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv6.addActionListener(this);
		rmv6.setBounds(posx, posy-15, 15, 15);
		add(rmv6);
		posx=posx+ancho+espacio;
		
		/*Fila 2 Columna 2*/
		verdura_p=new JButton(new ImageIcon("imagenes/empverdurapollo.png"));
		verdura_p.setBounds(posx, posy,ancho,alto);
		verdura_p.addActionListener(this);
		add(verdura_p);
		titverdura_p=new JLabel("Verdura y Pollo");
		titverdura_p.setBounds(posx+10,posy+alto,ancho,20);
		add(titverdura_p);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont7=new JLabel();
		cont7.setOpaque(true);
		cont7.setBackground(Color.ORANGE);
		cont7.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont7);
		rmv7=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv7.addActionListener(this);
		rmv7.setBounds(posx, posy-15, 15, 15);
		add(rmv7);
		posx=posx+ancho+espacio;
		
		/*Fila 2 Columna 3*/
		choclo=new JButton(new ImageIcon("imagenes/empchoclo.jpg"));
		choclo.setBounds(posx, posy, ancho, alto);
		choclo.addActionListener(this);
		add(choclo);
		titchoclo=new JLabel("Choclo");
		titchoclo.setBounds(posx+20,posy+alto,ancho,20);
		add(titchoclo);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont8=new JLabel();
		cont8.setOpaque(true);
		cont8.setBackground(Color.ORANGE);
		cont8.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont8);
		rmv8=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv8.addActionListener(this);
		rmv8.setBounds(posx, posy-15, 15, 15);
		add(rmv8);
		posx=posx+ancho+espacio;
		
		/*Fila 2 Columna 4*/
		jamon_queso=new JButton(new ImageIcon("imagenes/empjamonqueso.jpg"));
		jamon_queso.setBounds(posx, posy, ancho, alto);
		jamon_queso.addActionListener(this);
		add(jamon_queso);
		titjamon_queso=new JLabel("Jamon y Queso");
		titjamon_queso.setBounds(posx+10,posy+alto,ancho,20);
		add(titjamon_queso);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont9=new JLabel();
		cont9.setOpaque(true);
		cont9.setBackground(Color.ORANGE);
		cont9.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont9);
		rmv9=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv9.addActionListener(this);
		rmv9.setBounds(posx, posy-15, 15, 15);
		add(rmv9);
		
		text2=new JLabel(new ImageIcon("imagenes/pizzatitulo.png"));
		text2.setBounds(50, 350, 150, 56);
		add(text2);
		
		posx=50;
		posy=420;
		
		/*Fila 1 Columna 1*/
		comun=new JButton(new ImageIcon("imagenes/pizzacomun.jpg"));
		comun.setBounds(posx, posy, ancho, alto);
		comun.addActionListener(this);
		add(comun);
		titcomun=new JLabel("Comun");
		titcomun.setBounds(posx+20,posy+alto,ancho,20);
		add(titcomun);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont10=new JLabel();
		cont10.setOpaque(true);
		cont10.setBackground(Color.ORANGE);
		cont10.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont10);
		rmv10=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv10.addActionListener(this);
		rmv10.setBounds(posx, posy-15, 15, 15);
		add(rmv10);
		posx=posx+ancho+espacio;
		
		/*Fila 1 Columna 2*/
		especial=new JButton(new ImageIcon("imagenes/pizzaespecial.jpg"));
		especial.setBounds(posx, posy, ancho, alto);
		especial.addActionListener(this);
		add(especial);
		titespecial=new JLabel("Especial");
		titespecial.setBounds(posx+20,posy+alto,ancho,20);
		add(titespecial);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont11=new JLabel();
		cont11.setOpaque(true);
		cont11.setBackground(Color.ORANGE);
		cont11.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont11);
		rmv11=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv11.addActionListener(this);
		rmv11.setBounds(posx, posy-15, 15, 15);
		add(rmv11);
		posx=posx+ancho+espacio;
		
		/*Fila 1 Columna 3*/
		tres_quesos=new JButton(new ImageIcon("imagenes/pizzatresquesos.jpg"));
		tres_quesos.setBounds(posx, posy, ancho, alto);
		tres_quesos.addActionListener(this);
		add(tres_quesos);
		tittres_quesos=new JLabel("Tres Quesos");
		tittres_quesos.setBounds(posx+20,posy+alto,ancho,20);
		add(tittres_quesos);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont12=new JLabel();
		cont12.setOpaque(true);
		cont12.setBackground(Color.ORANGE);
		cont12.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont12);
		rmv12=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv12.addActionListener(this);
		rmv12.setBounds(posx, posy-15, 15, 15);
		add(rmv12);
		posx=posx+ancho+espacio;
		
		/*Fila 1 Columna 4*/
		doble_crema=new JButton(new ImageIcon("imagenes/pizzadoblecrema.jpg"));
		doble_crema.setBounds(posx, posy, ancho, alto);
		doble_crema.addActionListener(this);
		add(doble_crema);
		titdoble_crema=new JLabel("Doble Crema");
		titdoble_crema.setBounds(posx+20,posy+alto,ancho,20);
		add(titdoble_crema);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont13=new JLabel();
		cont13.setOpaque(true);
		cont13.setBackground(Color.ORANGE);
		cont13.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont13);
		rmv13=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv13.addActionListener(this);
		rmv13.setBounds(posx, posy-15, 15, 15);
		add(rmv13);
		posx=posx+ancho+espacio;
		
		/*Fila 1 Columna 5*/
		fugazzeta=new JButton(new ImageIcon("imagenes/pizzafugazzeta.jpg"));
		fugazzeta.setBounds(posx, posy, ancho, alto);
		fugazzeta.addActionListener(this);
		add(fugazzeta);
		titfugazzeta=new JLabel("Fugazzeta");
		titfugazzeta.setBounds(posx+20,posy+alto,ancho,20);
		add(titfugazzeta);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont14=new JLabel();
		cont14.setOpaque(true);
		cont14.setBackground(Color.ORANGE);
		cont14.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont14);
		rmv14=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv14.addActionListener(this);
		rmv14.setBounds(posx, posy-15, 15, 15);
		add(rmv14);
		posx=posx+ancho+espacio;
		
		posx=50;
		posy=posy+alto+espacio;
		/*Fila 2 Columna 1*/
		palmitos=new JButton(new ImageIcon("imagenes/pizzapalmitos.jpg"));
		palmitos.setBounds(posx, posy, ancho, alto);
		palmitos.addActionListener(this);
		add(palmitos);
		titpalmitos=new JLabel("Palmitos y Salsa Golf");
		titpalmitos.setBounds(posx,posy+alto,ancho,20);
		add(titpalmitos);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont15=new JLabel();
		cont15.setOpaque(true);
		cont15.setBackground(Color.ORANGE);
		cont15.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont15);
		rmv15=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv15.addActionListener(this);
		rmv15.setBounds(posx, posy-15, 15, 15);
		add(rmv15);
		posx=posx+ancho+espacio;
		
		/*Fila 2 Columna 2*/
		napolitana=new JButton(new ImageIcon("imagenes/pizzanapolitana.jpg"));
		napolitana.setBounds(posx, posy, ancho, alto);
		napolitana.addActionListener(this);
		add(napolitana);
		titnapolitana=new JLabel("Napolitana");
		titnapolitana.setBounds(posx+10,posy+alto,ancho,20);
		add(titnapolitana);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont16=new JLabel();
		cont16.setOpaque(true);
		cont16.setBackground(Color.ORANGE);
		cont16.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont16);
		rmv16=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv16.addActionListener(this);
		rmv16.setBounds(posx, posy-15, 15, 15);
		add(rmv16);
		posx=posx+ancho+espacio;
		
		/*Fila 2 Columna 3*/
		jamon=new JButton(new ImageIcon("imagenes/pizzajamon.jpg"));
		jamon.setBounds(posx, posy, ancho, alto);
		jamon.addActionListener(this);
		add(jamon);
		titjamon=new JLabel("Jamon");
		titjamon.setBounds(posx+10,posy+alto,ancho,20);
		add(titjamon);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont17=new JLabel();
		cont17.setOpaque(true);
		cont17.setBackground(Color.ORANGE);
		cont17.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont17);
		rmv17=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv17.addActionListener(this);
		rmv17.setBounds(posx, posy-15, 15, 15);
		add(rmv17);
		posx=posx+ancho+espacio;
		
		/*Fila 2 Columna 4*/
		morron_aji=new JButton(new ImageIcon("imagenes/pizzamorronesyaji.jpg"));
		morron_aji.setBounds(posx, posy, ancho, alto);
		morron_aji.addActionListener(this);
		add(morron_aji);
		titmorron_aji=new JLabel("Morron y Aji");
		titmorron_aji.setBounds(posx+10,posy+alto,ancho,20);
		add(titmorron_aji);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont18=new JLabel();
		cont18.setOpaque(true);
		cont18.setBackground(Color.ORANGE);
		cont18.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont18);
		rmv18=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv18.addActionListener(this);
		rmv18.setBounds(posx, posy-15, 15, 15);
		add(rmv18);
		posx=posx+ancho+espacio;
		
		/*Fila 2 Columna 5*/
		anchoas=new JButton(new ImageIcon("imagenes/pizzanchoas.jpg"));
		anchoas.setBounds(posx, posy, ancho, alto);
		anchoas.addActionListener(this);
		add(anchoas);
		titanchoas=new JLabel("Anchoas");
		titanchoas.setBounds(posx+10,posy+alto,ancho,20);
		add(titanchoas);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont19=new JLabel();
		cont19.setOpaque(true);
		cont19.setBackground(Color.ORANGE);
		cont19.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont19);
		rmv19=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv19.addActionListener(this);
		rmv19.setBounds(posx, posy-15, 15, 15);
		add(rmv19);
		posx=posx+ancho+espacio;
		
		posx=50;
		posy=posy+alto+espacio+10;
		/*Fila 3 Columna 1*/
		calabresa=new JButton(new ImageIcon("imagenes/pizzacalabresa.jpg"));
		calabresa.setBounds(posx, posy, ancho, alto);
		calabresa.addActionListener(this);
		add(calabresa);
		titcalabresa=new JLabel("Calabresa");
		titcalabresa.setBounds(posx+10,posy+alto,ancho,20);
		add(titcalabresa);
		cantidad=new JLabel("Cantidad: ");
		cantidad.setFont(new java.awt.Font("Lucida Sans", 0, 10));
		cantidad.setBounds(posx+ancho-80,posy-15, 65, 15);
		add(cantidad);
		cont20=new JLabel();
		cont20.setOpaque(true);
		cont20.setBackground(Color.ORANGE);
		cont20.setBounds(posx+ancho-20,posy-15, 20, 15);
		add(cont20);
		rmv20=new JButton(new ImageIcon("imagenes/menos.png"));
		rmv20.addActionListener(this);
		rmv20.setBounds(posx, posy-15, 15, 15);
		add(rmv20);
		
		ok=new JButton("Aceptar");
		ok.setBounds(300, 650, 120, 40);
		icono1=new ImageIcon("imagenes/confirm.png");
		ok.setIcon(icono1);
		ok.setIconTextGap(2);
		ok.addActionListener(this);
		add(ok);
		
		cancel=new JButton("Cancelar");
		cancel.setBounds(450, 650, 120, 40);
		icono2=new ImageIcon("imagenes/cancelar.png");
		cancel.setIcon(icono2);
		cancel.setIconTextGap(2);
		cancel.addActionListener(this);
		add(cancel);
		
		back=new JButton("Volver");
		back.setBounds(600, 650, 120, 40);
		icono3=new ImageIcon("imagenes/volver.png");
		back.setIcon(icono3);
		back.setIconTextGap(2);
		back.addActionListener(this);
		add(back);
		
		/*empanada=new JLabel(new ImageIcon("imagenes/empanadafondo.jpg"));
		empanada.setBounds(0, 0, 900, 350);
		add(empanada);
		
		pizza=new JLabel(new ImageIcon("imagenes/pizzafondo.jpg"));
		pizza.setBounds(0, 350, 900, 400);
		add(pizza);*/
		
	}

		
	private static final long serialVersionUID = 1L;
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*BOTONES EMPANADAS*/
		if (e.getSource()==carne){
			sum1++;
			cont1.setText(String.valueOf(sum1));
		}
		if (e.getSource()==pollo){
			sum2++;
			cont2.setText(String.valueOf(sum2));
		}
		if (e.getSource()==queso){
			sum3++;
			cont3.setText(String.valueOf(sum3));
		}
		if (e.getSource()==matambre){
			sum4++;
			cont4.setText(String.valueOf(sum4));
		}
		if (e.getSource()==arabe){
			sum5++;
			cont5.setText(String.valueOf(sum5));
		}
		if (e.getSource()==verdura_c){
			sum6++;
			cont6.setText(String.valueOf(sum6));
		}
		if (e.getSource()==verdura_p){
			sum7++;
			cont7.setText(String.valueOf(sum7));
		}
		if (e.getSource()==choclo){
			sum8++;
			cont8.setText(String.valueOf(sum8));
		}
		if (e.getSource()==jamon_queso){
			sum9++;
			cont9.setText(String.valueOf(sum9));
		}
		
		/*BOTONES PIZZAS*/
		
		if (e.getSource()==comun){
			sum10++;
			cont10.setText(String.valueOf(sum10));
		}
		if (e.getSource()==especial){
			sum11++;
			cont11.setText(String.valueOf(sum11));
		}
		if (e.getSource()==tres_quesos){
			sum12++;
			cont12.setText(String.valueOf(sum12));
		}
		if (e.getSource()==doble_crema){
			sum13++;
			cont13.setText(String.valueOf(sum13));
		}
		if (e.getSource()==fugazzeta){
			sum14++;
			cont14.setText(String.valueOf(sum14));
		}
		if (e.getSource()==palmitos){
			sum15++;
			cont15.setText(String.valueOf(sum15));
		}
		if (e.getSource()==napolitana){
			sum16++;
			cont16.setText(String.valueOf(sum16));
		}
		if (e.getSource()==jamon){
			sum17++;
			cont17.setText(String.valueOf(sum17));
		}
		if (e.getSource()==morron_aji){
			sum18++;
			cont18.setText(String.valueOf(sum18));
		}
		if (e.getSource()==anchoas){
			sum19++;
			cont19.setText(String.valueOf(sum19));
		}
		if (e.getSource()==calabresa){
			sum20++;
			cont20.setText(String.valueOf(sum20));
		}
		/*BOTONES RESTAR PEDIDOS*/
		
		/*BOTONES EMPANADAS*/
		if (e.getSource()==rmv1){
			sum1--;
			cont1.setText(String.valueOf(sum1));
		}
		if (e.getSource()==rmv2){
			sum2--;
			cont2.setText(String.valueOf(sum2));
		}
		if (e.getSource()==rmv3){
			sum3--;
			cont3.setText(String.valueOf(sum3));
		}
		if (e.getSource()==rmv4){
			sum4--;
			cont4.setText(String.valueOf(sum4));
		}
		if (e.getSource()==rmv5){
			sum5--;
			cont5.setText(String.valueOf(sum5));
		}
		if (e.getSource()==rmv6){
			sum6--;
			cont6.setText(String.valueOf(sum6));
		}
		if (e.getSource()==rmv7){
			sum7--;
			cont7.setText(String.valueOf(sum7));
		}
		if (e.getSource()==rmv8){
			sum8--;
			cont8.setText(String.valueOf(sum8));
		}
		if (e.getSource()==rmv9){
			sum9--;
			cont9.setText(String.valueOf(sum9));
		}
		/*BOTONES PIZZAS*/
		
		if (e.getSource()==rmv10){
			sum10--;
			cont10.setText(String.valueOf(sum10));
		}
		if (e.getSource()==rmv11){
			sum11--;
			cont11.setText(String.valueOf(sum11));
		}
		if (e.getSource()==rmv12){
			sum12--;
			cont12.setText(String.valueOf(sum12));
		}
		if (e.getSource()==rmv13){
			sum13--;
			cont13.setText(String.valueOf(sum13));
		}
		if (e.getSource()==rmv14){
			sum14--;
			cont14.setText(String.valueOf(sum14));
		}
		if (e.getSource()==rmv15){
			sum15--;
			cont15.setText(String.valueOf(sum15));
		}
		if (e.getSource()==rmv16){
			sum16--;
			cont16.setText(String.valueOf(sum16));
		}
		if (e.getSource()==rmv17){
			sum17--;
			cont17.setText(String.valueOf(sum17));
		}
		if (e.getSource()==rmv18){
			sum18--;
			cont18.setText(String.valueOf(sum18));
		}
		if (e.getSource()==rmv19){
			sum19--;
			cont19.setText(String.valueOf(sum19));
		}
		if (e.getSource()==rmv20){
			sum20--;
			cont20.setText(String.valueOf(sum20));
		}
		
		
		if (e.getSource()==ok){
			dispose();
			det.setSize(500, 750);
			det.setLocationRelativeTo(null);
			det.setVisible(true);		
		}
		if (e.getSource()==cancel){
			
		}
		if (e.getSource()==back){
			dispose();
		}
	}	
}