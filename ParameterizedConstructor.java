class Book{
	int bookId;
	String title;
	Book(int id, String t){
		bookId = id;
		title = t;
	}
	void display(){
		System.out.println("Book ID: " + bookId);
		System.out.println("Title: " + title);
	}
	public static void main(String[] args){
		Book b1 = new Book(101,"Java Programming");
		b1.display();
	}
}