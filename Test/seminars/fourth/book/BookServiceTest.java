package seminars.fourth.book;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class BookServiceTest {
@Test
    public void testBookRepository(){
    InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
    Book mockBook = new Book("1","А","London");
    List mockBooks = inMemoryBookRepository.findAll();

    BookRepository mockBookRepository = mock(BookRepository.class);
    when(mockBookRepository.findById("1")).thenReturn(mockBook);
    when(mockBookRepository.findAll()).thenReturn(mockBooks);
BookService bookService = new BookService(mockBookRepository);
bookService.findAllBooks();
bookService.findBookById("1");
    verify(mockBookRepository, times(1)).findAll();
    verify(mockBookRepository, times(1)).findById("1");

}
}