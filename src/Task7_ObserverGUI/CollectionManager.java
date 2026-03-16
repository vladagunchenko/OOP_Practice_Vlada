package Task7_ObserverGUI;
import java.util.ArrayList;
import java.util.List;
public class CollectionManager {
    // колекція чисел, які будемо відображати на графіку
    private List<Integer> numbers = new ArrayList<>();
    // список спостерігачів (Observer)
    private List<Observer> observers = new ArrayList<>();
    // додаємо нового спостерігача
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    // повідомляємо всіх спостерігачів про зміну даних
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
    // додаємо нове число в колекцію
    // після цього повідомляємо observers
    public void addNumber(int number){
        numbers.add(number);
        notifyObservers();
    }
    // повертаємо список чисел
    public List<Integer> getNumbers(){
        return numbers;
    }
}