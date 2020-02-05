import javax.swing.JFrame;
//import java.awt.Rectangle;

public class Graphics_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame window = new JFrame();
		graphics_sett rect = new graphics_sett();
		
		window.setSize(600, 400);
		window.setTitle("2D window");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		window.add(rect);
		
	}

}
