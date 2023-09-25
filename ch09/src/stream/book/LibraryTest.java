package stream.book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book {
	private String name;
	private int price;

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

public class LibraryTest {

	public static void main(String[] arg) {
		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));

		// 책 비용
		int total = bookList.stream()
				            .mapToInt(b -> b.getPrice()).sum();

		System.out.println("모든 책의 가격의 합은 " + total + "원 입니다.");

		System.out.println("=== 책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력 ===");

		bookList.stream().filter(b -> b.getPrice() >= 20000)
						 .map(b -> b.getName())
						 .forEach(s -> System.out.println(s));
	}

}
