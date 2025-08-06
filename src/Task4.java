// Задание 4
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args){
        Integer[] value = {3,4};
        changeValue(value);
        System.out.println("value = " + Arrays.toString(value));
    }

    public static void changeValue(Integer[] value){
        value[0] = 99;
    }
}
/** Пограмма выводит значение ошибки - java: cannot find symbol, symbol: variable Arrays, location: class Task4.
 * Это происходит, потому что мы не можем вызвать статический метод класса Arrays. Нужно импортировать класс Arrays.
 * Пограмма выводит значение value = [99, 4]. Это происходит, потому что если это ссылочный тип как массив,
 * то локальные переменные и аргументы методов создаются в куче, а внутри метода на них образуется ссылка
 */

