package vistas;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Monitoreo extends JFrame implements ActionListener{
	int fil=3,col=5,indice=0;
	int posy,posx;
	JLabel titulo;
	JToggleButton[][] Grid =new JToggleButton[fil][col];
	int[][] id=new int[fil][col];
	
	public Monitoreo(){
		setLayout(null);
		setTitle("Monitoreo de Mesas");
		setSize(1200,750);		
		setLocationRelativeTo(null);
		titulo=new JLabel("Atencion por MESAS");
		titulo.setSize(1200,50);
		titulo.setOpaque(true);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new java.awt.Font("Lucida Sans", 1, 18));
		titulo.setForeground(Color.black);
		titulo.setBackground(new Color(255,128,0));
		add(titulo);
	
		posy=150;
		for(int i=0;i<fil;i++){
			posx=10;
			for(int j=0;j<col;j++){
				indice++;
				id[i][j]=indice;
				Grid[i][j]=new JToggleButton("<html>Mesa "+id[i][j]+"<br>Libre</html>");
				Grid[i][j].setBounds(posx, posy, 150, 100);
				Grid[i][j].setOpaque(true);
				Grid[i][j].setBackground(Color.green);
				Grid[i][j].setIcon(new ImageIcon("imagenes/mesa.png"));
				Grid[i][j].setIconTextGap(2);
				Grid[i][j].addActionListener(this);
				add(Grid[i][j]);
				posx=posx+160;
			}
			posy=posy+110;
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
			
	private static final long serialVersionUID = 1L;
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<fil;i++){
			for(int j=0;j<col;j++){
				if (Grid[i][j].isSelected()){
					Grid[i][j].setBackground(Color.red);
					Grid[i][j].setText("<html>Mesa "+id[i][j]+"<br>Ocupada</html>");
				}
				else
				{
					Grid[i][j].setBackground(Color.green);
					Grid[i][j].setText("<html>Mesa "+id[i][j]+"<br>Libre</html>");
				}
			}
		
		}
		
	}
	
}
