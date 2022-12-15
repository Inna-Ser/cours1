public class Main {
    // task 1
    public static void main(String[] args) {

        Human maksim = new Human(null, "Минск", -1988, "бренд-менеджер");
        maksim.hello();

        Human anna = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        anna.hello();

        Human katia = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        katia.hello();

        Human artem = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        artem.hello();

    }
}