public class TestAuthor {
    public static void main(String[] args) {
        Author autor1 = new Author("Tan Ah Teck", 'm', "ahTeck@email.com");
        System.out.println(autor1);

        autor1.setEmail("paul@nowhere.com");
        System.out.println(autor1);
    }
}
