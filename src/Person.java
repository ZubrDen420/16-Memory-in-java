// Задание 5
public class Person {
    public String name;
    String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString(){
        return this.name + " " + this.surname;
    }
}
 /** Задание 5. Программа выводит значение person = Fedor Dostoevskiy. Это происходит, потому что мы передали в метод Fedor Dostoevskiy
 * и переназначаем этой ссылке новый объект (person = new Person("Lev", "Tolstoy")) и это не отразится на исходном
 * объекте (Person person = new Person("Fedor","Dostoevskiy"), потому что мы создали для локальной переменной новый объект
*/