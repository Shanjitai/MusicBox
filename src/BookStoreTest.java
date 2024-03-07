import java.time.LocalDate;

enum BookDetails {
    BOOK1("001", "Book1", "Author1", 300, "Genre1", 4.5, 2010, "Publisher1", 25.0),
    BOOK2("002", "Book2", "Author2", 400, "Genre2", 4.0, 2015, "Publisher2", 30.0),
    BOOK3("003", "Book3", "Author3", 350, "Genre3", 4.2, 2012, "Publisher3", 28.0),
    BOOK4("004", "Book4", "Author4", 500, "Genre4", 4.8, 2018, "Publisher4", 35.0),
    BOOK5("005", "Book5", "Author5", 450, "Genre5", 4.7, 2016, "Publisher5", 33.0);

    private String bookID;
    private String bookName;
    private String bookAuthor;
    private int bookPages;
    private String bookGenre;
    private double bookRating;
    private int bookPublishedYear;
    private String bookPublisher;
    private double bookPrice;
    private final double bookRent = 5.0;

    BookDetails(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre, double bookRating, int bookPublishedYear, String bookPublisher, double bookPrice) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPages = bookPages;
        this.bookGenre = bookGenre;
        this.bookRating = bookRating;
        this.bookPublishedYear = bookPublishedYear;
        this.bookPublisher = bookPublisher;
        this.bookPrice = bookPrice;
    }

    public String getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookPages() {
        return bookPages;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public double getBookRating() {
        return bookRating;
    }

    public int getBookPublishedYear() {
        return bookPublishedYear;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public double getBookRent() {
        return bookRent;
    }
}

class BookStore {
    private String orderedBook;
    private LocalDate orderDate;
    private String orderID;
    private double transactionAmount;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String userID;
    private String orderType;

    public BookStore(String orderedBook, LocalDate orderDate, double transactionAmount, String firstName, String lastName, String emailAddress, String orderType) {
        this.orderedBook = orderedBook;
        this.orderDate = orderDate;
        this.orderID = "TANLOD" + orderDate + orderedBook.substring(0, 3).toUpperCase();
        this.transactionAmount = transactionAmount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.userID = "TANLUS" + (firstName + lastName).substring(0, 5).toUpperCase();
        this.orderType = orderType;
    }

    public String getOrderedBook() {
        return orderedBook;
    }

    public void setOrderedBook(String orderedBook) {
        this.orderedBook = orderedBook;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}