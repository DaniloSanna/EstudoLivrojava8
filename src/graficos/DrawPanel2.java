package graficos;

import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawPanel2 extends JPanel {

	
	// desenha um X a partir dos cantos do painel
	public void paintComponent(Graphics g){
		
		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);
		int width = getWidth(); // largura total 
		int height = getHeight(); // altura total
		
		int qtdlinhas = 15; // altura total
		int Limite1 = 0;
		int Limite2 = width/2;
		
		int Limite3 = 0;
		int Limite4 = height/2;
		
		
		int largura_perca = (height/2)/qtdlinhas;
		int altura_perca = (width/1)/qtdlinhas;

		int largura_perca2 = (height/1)/qtdlinhas;
		int altura_perca2 = (width/2)/qtdlinhas;

		
		// desenha uma linha a partir do canto superior esquerdo até o inferior direito
		//g.drawLine(0, 0, width/2, 0);
		
		for (int x = 1; x<=qtdlinhas; x++) {
			//largura -= perca;

			//g.drawLine(0, 0, Limite1, Limite2);
			//g.drawLine(width, 0, Limite2, Limite1);
			
			
			//g.drawLine(width, height, Limite1, Limite2);
			g.drawLine(0, height, width, Limite1);
			
			Limite1 += altura_perca;
			Limite2 -= largura_perca;
			
			Limite3 += altura_perca2;
			Limite4 -= largura_perca2;
			
			
			
		}
	}
	// fim da classe DrawPanel
	
	
}
