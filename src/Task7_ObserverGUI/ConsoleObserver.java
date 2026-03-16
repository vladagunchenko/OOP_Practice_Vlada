package Task7_ObserverGUI;
// спостерігач який просто виводить повідомлення в консоль
public class ConsoleObserver implements Observer {
    @Override
    public void update() {
        System.out.println("Колекція змінилась!");
    }
}