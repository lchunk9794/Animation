import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawings extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int w = getWidth();
    int h = getHeight();
    
    g.setColor(Color.RED);
    g.drawRect(w/4, h/4, w/2, h/2);
    
    g.drawRect(50, 25, 100, 200);
    
    g.setColor(new Color(33,38,237));
    g.fillOval(100, 150, 50, 75);
    
    g.drawLine(0, 0, 200, 400);
    
    int[] xVals = {50,20,100};
    int[] yVals = {30,100,45};
    g.drawPolygon(xVals,yVals,3);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Drawings");
    window.setBounds(100, 100, 600, 400);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel canvas = new Drawings();
    canvas.setBackground(Color.WHITE);
    window.getContentPane().add(canvas);
    window.setVisible(true);
  }
}

