package main.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Iterable<Book>{

	
//配列でBookshelfクラスを実装した場合
/*
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	@Override
	public Iterator<Book> iterator(){
		return new BookShelfIterator(this);
	}
*/	

//ArrayListでBookShelfクラスを実装した場合
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public BookShelf(int initialSize) {
		this.books = new ArrayList<Book>(initialSize);
	}
	
	public Book getBookAt(int index) {
		return books.get(index);
	}
	
	public void appendBook(Book book) {
		books.add(book);
	}
	
	public int getLength() {
		return books.size();
	}
	
	@Override
	public Iterator<Book> iterator(){
		return new BookShelfIterator(this);
	}
	
	
}