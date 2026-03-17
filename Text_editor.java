// ✅ Exercise 12 — Text Editor Simulator

class TextEditor{
	public static void main(String[] args){
		StringBuffer text = new StringBuffer("Java Prgoramming");
		// Append
		text.append("Language");
		text.insert(5, "Basic");
		text.delete(5,11);
		text.reverse();
		System.out.println(text);
	}
}