// Задание 3
import java.util.Arrays;
public class Task3 {
    public static void main(String[] args){
        Integer[] value = {3,4};
        changeValue(value);
        System.out.println("value = " + Arrays.toString(value));
    }

    public static void changeValue(Integer[] value){
        value = new Integer[]{1, 2};
    }
}
/** Пограмма выводит значение ошибки - java: cannot find symbol, symbol:   variable Arrays, location: class Task3.
 * Это происходит, потому что мы не можем вызвать статический метод класса Arrays. Нужно импортировать класс Arrays.
 * После этого значение value = [3, 4]. Это происходит, потому что некоторые объектные типы в Java, такие как String,
 * Integer и др. являются неизменяемыми. Они не содержат методов, которые меняют значение объекта. Все методы класса
 * String, создают новую строку и возвращают ее, поэтому оригинальный объект не меняется.
 */