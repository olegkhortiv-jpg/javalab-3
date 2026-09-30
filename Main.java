public class Main {
    public static void main(String[] args) {
        Friend f1 = new Friend();
        f1.setLastName("Петренко");
        f1.setFirstName("Іван");
        f1.setBirthYear(2004);
        f1.setInterests("Футбол, музика");

        Friend f2 = new Friend("Коваль", "Олег", 2003, "Ігри, фільми");
        Friend f3 = new Friend("Шевченко", "Анна", 2005, "Книги");

        System.out.println("Тест неправильного року:");
        f1.setBirthYear(1800);
        System.out.println();

        Friend[] friends = {f1, f2, f3};

        System.out.println("Формат 1:");
        for (int i = 0; i < friends.length; i++) {
            System.out.println("Friend " + friends[i].getLastName() + " " + friends[i].getFirstName() +
                    ", age: " + friends[i].getBirthYear() + ", " + friends[i].getInterests());
        }

        System.out.println("\nФормат 2:");
        for (int i = 0; i < friends.length; i++) {
            String str = "FRIEND " + friends[i].getLastName() + " " + friends[i].getFirstName() +
                    ", AGE: " + friends[i].getBirthYear() + ", " + friends[i].getInterests();
            System.out.println(str.toUpperCase());
        }

        System.out.println("\nВиведення через масив з ID:");
        for (int i = 0; i < friends.length; i++) {
            System.out.println("Об'єкт #" + friends[i].getId() + ": " +
                    friends[i].getLastName() + " " +
                    friends[i].getFirstName() + " (" +
                    friends[i].getBirthYear() + " р.н.) - " +
                    friends[i].getInterests());
        }
    }
}