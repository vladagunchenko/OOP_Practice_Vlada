package Task7_ObserverGUI;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class MainGUI {
    public static void main(String[] args) {
        // створюємо менеджер колекції
        CollectionManager manager = new CollectionManager();
        // створюємо головне вікно програми
        JFrame frame = new JFrame("Observer Graph");
        frame.setSize(500,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // панель для відображення графіка
        GraphPanel panel = new GraphPanel(manager);
        // створюємо спостерігачів
        ConsoleObserver console = new ConsoleObserver();
        GraphObserver graph = new GraphObserver(panel);
        // реєструємо observers
        manager.addObserver(console);
        manager.addObserver(graph);
        // кнопка для додавання нового числа
        JButton button = new JButton("Add value to graph");
        button.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Введіть число:");
            if(input != null){
                try{
                    int value = Integer.parseInt(input);
                    if(value > 180){
                        JOptionPane.showMessageDialog(frame,
                                "Число повинно бути менше 180");
                        return;
                    }
                    manager.addNumber(value);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(frame,
                            "Потрібно ввести число!");
                }
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(button);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        panel.setBackground(Color.WHITE); //білий фон
        frame.setVisible(true);
    }
}