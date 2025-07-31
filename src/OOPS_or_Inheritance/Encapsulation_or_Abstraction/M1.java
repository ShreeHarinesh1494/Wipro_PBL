package OOPS_or_Inheritance.Encapsulation_or_Abstraction;

public class M1 {

    // Author class
    static class Author {
        private String name;
        private String email;
        private char gender;

        // Parameterized Constructor
        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        // Getters
        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public char getGender() {
            return gender;
        }

        // toString method
        public String toString() {
            return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
        }
    }

    // Book class
    static class Book {
        private String name;
        private Author author;
        private double price;
        private int qtyInStock;

        // Parameterized Constructor
        public Book(String name, Author author, double price, int qtyInStock) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.qtyInStock = qtyInStock;
        }

        // Getters
        public String getName() {
            return name;
        }

        public Author getAuthor() {
            return author;
        }

        public double getPrice() {
            return price;
        }

        public int getQtyInStock() {
            return qtyInStock;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQtyInStock(int qtyInStock) {
            this.qtyInStock = qtyInStock;
        }

        // toString method
        public String toString() {
            return "Book Name: " + name +
                    "\nPrice: ₹" + price +
                    "\nQuantity in Stock: " + qtyInStock +
                    "\n" + author.toString();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creating Author object
        Author author = new Author("Chetan Bhagat", "chetan@example.com", 'M');

        // Creating Book object
        Book book = new Book("Half Girlfriend", author, 299.99, 50);

        // Displaying book details
        System.out.println(book.toString());
    }
}

