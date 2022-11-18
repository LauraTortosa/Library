public class Author {
    private String name, email;
    private char gender;

    public Author(String name, char gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return getName() + " (" + getGender() + ") at " + getEmail();
    }
}
