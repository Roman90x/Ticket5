public class Main {
    public static void main(String[] args) {
        System.out.println("Билет 5");
        //Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку
        // вида: «Название книги» И.О. Автора.
        Book[] books = new Book[2];
        books[0] = new Book("Alexandr Pushkin", "Evgeniy Onegin");
        books[1] = new Book("Lev Tolstoy", "Voyna i mir");
        printBooks(books);
    }

    public static void printBooks(Book[] books) {
        for (Book book : books) {
            System.out.println("«" + book.getTitle() + "» " + book.getAuthor());
        }
    }

}