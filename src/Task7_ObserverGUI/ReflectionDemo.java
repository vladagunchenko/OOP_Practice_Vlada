package Task7_ObserverGUI;
// демонстрація використання reflection
public class ReflectionDemo {
    public static void main(String[] args) {
        // отримуємо інформацію про клас
        Class<NumberData> clazz = NumberData.class;
        // перевіряємо чи є анотація
        if(clazz.isAnnotationPresent(Info.class)){
            Info info = clazz.getAnnotation(Info.class);
            // виводимо автора анотації
            System.out.println("Author: " + info.author());
        }
    }
}