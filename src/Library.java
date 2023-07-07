import java.util.ArrayList;
import java.util.List;

//book
//        title
//        author
//
//        library
//        addBook(Book book)
//        boolen checkBook (Book book)
//        POJO
//aaaabbbcdddaaa
//        4a3bc3d3a
public class Library {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book.addBook("Думи", "Шевченко", bookList);
        Book.addBook("Онегин", "Пушкин", bookList);
        Book.addBook("Мастер и Маргарита", "Булгаков", bookList);
        Book.checkBook("Думи", bookList);
        Book.checkBook("Бойцовский клуб", bookList);
    }

    static class Book {
        private String title;
        private String autor;

        public Book(String title, String autor) {
            this.autor = autor;
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public static void addBook(String title, String autor, List<Book> listBook) {
            Book book = new Book(title, autor);
            listBook.add(book);
            System.out.println("Успешно добавлена книга:" + book.getTitle()+" " + book.getAutor());
        }

        public static boolean checkBook(String searchTitle, List<Book> bookList) {
            for (Book book : bookList) {
                if (book.getTitle().equals(searchTitle)) {
                    System.out.println("Книга " + searchTitle + " найдена");
                    return true;
                }
            }
            System.out.println("Трындец!" + searchTitle + " не нашел!");
            return false;
        }
    }
}