package reflection;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {

		Class<Book> bookClass = Book.class;
		//value = instance

		Book book = new Book();

		Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);
		Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
			f.setAccessible(true);
			try {
				System.out.println(f.get(book));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

	}
}
