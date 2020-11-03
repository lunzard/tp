package seedu.quotesify.rating;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.quotesify.author.Author;
import seedu.quotesify.book.Book;
import seedu.quotesify.book.BookList;
import seedu.quotesify.lists.ListManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RatingTest {

    private RatingList ratings;
    private Rating rating;
    private BookList books;
    private Book book;

    @BeforeEach
    void setUp() {
        ListManager.initialiseAllLists();
        books = (BookList) ListManager.getList(ListManager.BOOK_LIST);
        ratings = (RatingList) ListManager.getList(ListManager.RATING_LIST);
        String title = "Harry Potter";
        String name = "JK Rowling";
        Author author = new Author(name);
        book = new Book(author, title);
        books.add(book);
        rating = new Rating(book, 5);
    }

    @Test
    public void accessingAttributes_valid_success() {
        assertEquals(rating.getTitle(), "Harry Potter");
        assertEquals(rating.getAuthor(), "JK Rowling");
        assertEquals(rating.getRating(), 5);
        rating.setRating(1);
        assertEquals(rating.getRating(), 1);
    }
}
