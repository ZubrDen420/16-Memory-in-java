// Задание 2
public class Task2 {
    public static void main(String[] args){
        Integer value = 33;
        changeValue(value);
        System.out.println("value = " + value);
    }
    public static void changeValue(Integer value){
        value = 22;
    }
}
 /** Пограмма выводит значение value = 33. Это происходит, потому что, преобразуя примитивный тип данных в ссылочный
 * объект Integer),он тоже передается в метод по значению, а значение объекта - ссылка на адрес памяти, где он хранится.
 */
