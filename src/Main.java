public class Main {

    public static void main(String[] args) {
        Author Dostoevsky = new Author("Фёдор", "Достоевский");
        Book CrimeAndPunishment = new Book("Преступление и Наказание", Dostoevsky, 1866);
        Author Gogol = new Author("Николай", "Гоголь");
        Book Auditor = new Book("Ревизор", Gogol, 1836);
        {
            System.out.println("Книга: " + CrimeAndPunishment.getNameBook() + ", автор " + CrimeAndPunishment.getAuthor().getAuthorName() + " " +
                    CrimeAndPunishment.getAuthor().getAuthorSurname() + ", выпущена в " + CrimeAndPunishment.getAgePublisher() + " году.");
        }
        {
            System.out.println("Книга: " + Auditor.getNameBook() + ", автор " + Auditor.getAuthor().getAuthorName() + " " +
                    Auditor.getAuthor().getAuthorSurname() + ", выпущена в " + Auditor.getAgePublisher() + " году.");
        }
        CrimeAndPunishment.setAgePublisher(2015);
        System.out.println("CrimeAndPunishment.getAgePublisher() = " + CrimeAndPunishment.getAgePublisher());
    }
}