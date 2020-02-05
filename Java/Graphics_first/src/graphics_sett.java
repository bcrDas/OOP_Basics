import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Font;


public class graphics_sett extends JComponent {
	
	public void paintComponent(Graphics g)
	{
		
		Graphics2D g2  = (Graphics2D) g;
		Color blue = new Color(0, 0, 255);
		
		g2.setColor(blue);
		Rectangle rect1 = new Rectangle(100, 100, 50, 50);
		g2.draw(rect1);
		
		g2.setColor(new Color(255, 0, 0));
		Ellipse2D.Double ellipse_1 = new Ellipse2D.Double(300, 200, 100, 50);
		g2.fill(ellipse_1);
		
		Line2D.Double line_1 = new Line2D.Double(30, 200, 100, 50);
		g2.draw(line_1);
		
		g2.setColor(Color.GREEN);
		Point2D.Double point_1 = new Point2D.Double(200, 20);
		Point2D.Double point_2 = new Point2D.Double(20, 20);
		Line2D.Double line_2 = new Line2D.Double(point_1, point_2);
		g2.draw(line_2);
		
		g2.setColor(Color.BLACK);
		g2.setFont(new Font("Serief", Font.BOLD + Font.ITALIC, 15));
		g2.drawString("Hey! I am SUbhajit Das!!", 30,14);
		
	}

}
