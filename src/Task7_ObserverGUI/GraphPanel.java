package Task7_ObserverGUI;
import javax.swing.*;
import java.awt.*;
public class GraphPanel extends JPanel {
    private CollectionManager manager;
    public GraphPanel(CollectionManager manager){
        this.manager = manager;
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int x = 50;
        // вісь графіка
        g.setColor(Color.DARK_GRAY);
        g.drawLine(30,200,350,200);
        g.drawString("Values", 180,235);
        // рамка області графіка
        g.setColor(new Color(200,200,200));
        g.drawRect(30,20,360,180);
        for(int value : manager.getNumbers()){
            // пастельний колір
            Color pastel = new Color(
                    150 + (int)(Math.random()*100),
                    150 + (int)(Math.random()*100),
                    150 + (int)(Math.random()*100)
            );
            g.setColor(pastel);
            // малюємо стовпчик
            g.fillRect(x,200-value,40,value);
            // підпис значення
            g.setColor(Color.DARK_GRAY);
            g.drawString(String.valueOf(value), x+10, 220);
            x += 60;
        }
    }
}