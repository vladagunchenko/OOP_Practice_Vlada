package Task7_ObserverGUI;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
// вказуємо що анотація буде доступна під час виконання програми
@Retention(RetentionPolicy.RUNTIME)
public @interface Info {
    String author();
}