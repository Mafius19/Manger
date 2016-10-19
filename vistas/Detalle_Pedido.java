package vistas;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
public class Detalle_Pedido extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Detalle_Pedido() {
	super("Detalle del Pedido");
	JLabel titulo=new JLabel("PEDIDO");
	
	JButton quitar=new JButton("Quitar");
	JButton arriba=new JButton("UP");
	JButton abajo=new JButton("DOWN");
	
	//array bidimensional de objetos con los datos de la tabla
	Object[][] data = {
						{"1/2 D. Empanada de Pollo", "2", "$40", "$80"},
						{"1 L. Coca Cola", "2", "40", "$80"},
						{"1/2 L. Fanta Naranja", "5", "$20", "$100"},
						{"Pizza 3 Quesos", "1", "$55", "$55"},
	};
	//array de String's con los títulos de las columnas
	String[] columnNames = {"Descripcion", "Cantidad", "PU",
							"Importe"};
	//se crea la Tabla final
	JTable table = new JTable(data, columnNames);
	table.setPreferredScrollableViewportSize(new Dimension(500, 70));
	//Creamos un JscrollPane y le agregamos la JTable
	JScrollPane scrollPane = new JScrollPane(table);
	JPanel botones=new JPanel();
	botones.setLayout(new FlowLayout(FlowLayout.LEADING,9,50));
	botones.add(quitar);
	botones.add(arriba);
	botones.add(abajo);
	//Agregamos el JScrollPane al contenedor
	getContentPane().add(titulo, BorderLayout.NORTH);
	getContentPane().add(scrollPane, BorderLayout.CENTER);
	getContentPane().add(botones, BorderLayout.EAST);
	
	//manejamos la salida
	
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
}
	
public static void main(String[] args) {
Detalle_Pedido frame = new Detalle_Pedido();
frame.pack();
frame.setVisible(true);
}
}