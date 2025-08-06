public class Main {
    public static void main(String[] args) {
        System.out.println("Memory in Java");

        // Задание 1

        int value = 33;
        changeValue(value);
        System.out.println("value = " + value);

        // Задание 5
        Task5_Person person = new Task5_Person("Fedor", "Dostoevskiy");
        changePerson(person);
        System.out.println("person = " + person);
        changePerson2(person);
        System.out.println("changePerson2 = " + person);
    }

    public static void changeValue(int value) {
        value = 22;
    }
    public static void changePerson(Task5_Person person){
        person = new Task5_Person("Lev", "Tolstoy");
    }

    // Задание 6
    public static void changePerson2(Task5_Person person) {
        person.name = "Lev";
        person.surname = "Tolstoy";
    }
}
/** Задание 1. Программа выводит значение value = 33. Это происходит, потому что в Java передача переменных происходит по значению.
 * Примитивы всегда передаются по значению
 */
