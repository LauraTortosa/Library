public class TestBook {
    public static void main(String[] args) {
        Author autor2 = new Author("Laura", 'f', "lau@email.com");
        Book book1 = new Book("El mejor libro", autor2, 15, 2);
        System.out.println(book1);

        Book book2 = new Book("Java for dummy", new Author("Pepa Garcia", 'f', "pepitag@email.com"), 29.95, 21);
        System.out.println(book2);

        System.out.println("Autor:" + book1.getAuthor().getName() + " Email:" + book1.getAuthor().getEmail());

        Book[] array = new Book[5];
        array[0] = new Book("libro guay 1",autor2, 5.5, 3);
        array[1] = new Book("libro guay 2",autor2, 3.5, 13);
        array[2] = new Book("libro guay 3",autor2, 10.5, 5);
        array[3] = new Book("libro guay 4",autor2, 15.5, 20);
        array[4] = new Book("libro guay 5",autor2, 7.5, 9);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
