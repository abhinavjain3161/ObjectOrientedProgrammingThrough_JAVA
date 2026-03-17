import issued.IssuedBook;

class TestLibrary{
	public static void main(String[] args){
		IssuedBook b = new IssuedBook(
			"Java Programming",
			"Herbert Schildt",
			550,
			"Abhinav"
		);
		b.displayIssuedBook();
	}
}