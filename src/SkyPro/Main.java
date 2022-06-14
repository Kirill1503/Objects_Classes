package SkyPro;

public class Main {
    public static void main(String[] args) {
        String nameJohn = "John";
        int ageJohn = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя - " + names[i] + " Возраст - " + ages[i]);
        }
        Person sarah = new Person("Sarah" , 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John", 13 );
        System.out.println();
        Book warAndPeace = new Book("War And peace", 1867);
        Author Tolstoy = new Author("Lev", "Tolstoy");
        System.out.println("warAndPeace.getTitle() = " + warAndPeace.getTitle());
        System.out.println("warAndPeace.yearPublication() = " + warAndPeace.getYearPublication());
        System.out.println("Tolstoy.getNameAuthor() = " + Tolstoy.getNameAuthor());
        System.out.println("Tolstoy.getSurnameAuthor() = " + Tolstoy.getSurnameAuthor());
        warAndPeace.setYearPublication(1868);
        System.out.println("warAndPeace.getYearPublication() = " + warAndPeace.getYearPublication());
        System.out.println();
        Book historyOfTheWealthOfNations = new Book("history of the wealth of nations", 1776);
        Author Smith = new Author("Adam", "Smith");
        System.out.println("historyOfTheWealthOfNations.getTitle() = " + historyOfTheWealthOfNations.getTitle());
        System.out.println("historyOfTheWealthOfNations.getYearPublication() = " +
                historyOfTheWealthOfNations.getYearPublication());
        historyOfTheWealthOfNations.setYearPublication(1777);
        System.out.println("historyOfTheWealthOfNations.getYearPublication() = " +
                historyOfTheWealthOfNations.getYearPublication());
        System.out.println("Smith.getNameAuthor() = " + Smith.getNameAuthor());
        System.out.println("Smith.getSurnameAuthor() = " + Smith.getSurnameAuthor());
    }
}