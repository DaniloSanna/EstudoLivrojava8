package graficos;
import javax.swing.JFrame;


public class DrawTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cria um painel que contém nosso desenho
		DrawPanel2 panel = new DrawPanel2();

		//cria um novo quadro para armazenar o painel
		JFrame application = new JFrame();

		// configura o frame para ser encerrado quando ele é fechado
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.add(panel); // adiciona o painel ao frame 
		application.setSize(250, 250); // configura o tamanho do frame
		application.setVisible(true); // torna o frame visível
		
	}

}
