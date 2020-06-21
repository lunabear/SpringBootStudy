package board;

import org.junit.jupiter.api.Test;

public class BookServiceTest {
	

	BookService defaultBookService = new DefaultBookService();
	BookService proxyBookService = new BookServiceProxy(new DefaultBookService());
	
	@Test
	public void di() {
		Book book = new Book();
		book.setTitle("spring");
		//defaultBookService.rent(book);
		proxyBookService.rent(book);
	}

}
