class pattern
{
	public static void main(String[] args){
		int rows = 5;
		for(int i=1; i<= rows; i++){
		for(int space = 1; space <= rows - i; space++){
			System.out.print(" ");
		}
		for(int star = 1; star <= (2 * i -1); star++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}