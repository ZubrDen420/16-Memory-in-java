public class Task6 {
    public class Person {
        public String name;
        public String surname;

        public Person(String name, String surname){
            this.name = name;
            this.surname = surname;
        }
        @Override
        public String toString(){
            return this.name + " " + this.surname;
        }
    }
}
 /** Пограмма выводит значение - person = Lev Tolstoy. Это происходит, потому что мы передали копию ссылки в методе
 *  public static void changePerson2(Person person) на объект Person person = new Person("Fedor", "Dostoevskiy").
 *  И мы в этом объекте меняем значение переменных на Lev Tolstoy.
 */