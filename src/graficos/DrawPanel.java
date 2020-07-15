package graficos;

import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawPanel extends JPanel {

	
	// desenha um X a partir dos cantos do painel
	public void paintComponent(Graphics g){
		
		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);
		int width = getWidth(); // largura total 
		int height = getHeight(); // altura total
		int meio1 = (width/2);
		int meio2 = (height/2);
		// desenha uma linha a partir do canto superior esquerdo até o inferior direito
		g.drawLine(0, 0, width, height);

		// desenha uma linha a partir do canto inferior esquerdo até o superior direito
		g.drawLine(0, height, width, 0);
		
		// A parte, cria uma linha Horizontal
		g.drawLine(0, meio2, width, meio2);
		// A parte, cria uma linha Vertical
		g.drawLine(meio1, 0, meio1, height);
		
	}
	// fim da classe DrawPanel
	
	
}
