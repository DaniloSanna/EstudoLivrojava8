package graficos;
import javax.swing.JFrame;


public class DrawPanelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cria um painel que cont�m nosso desenho
		DrawPanel panel = new DrawPanel();

		//cria um novo quadro para armazenar o painel
		JFrame application = new JFrame();

		// configura o frame para ser encerrado quando ele � fechado
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.add(panel); // adiciona o painel ao frame 
		application.setSize(250, 250); // configura o tamanho do frame
		application.setVisible(true); // torna o frame vis�vel
		
	}

}
