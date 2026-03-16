package Task7_ObserverGUI;
// цей Observer відповідає за оновлення графіка
public class GraphObserver implements Observer {
    private GraphPanel panel;
    public GraphObserver(GraphPanel panel){
        this.panel = panel;
    }
    // коли колекція змінюється — перемальовуємо графік
    @Override
    public void update(){
        panel.repaint();
    }
}