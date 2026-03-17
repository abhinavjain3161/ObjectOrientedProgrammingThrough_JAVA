class StringDemo {
    public static void main(String[] args) {
        String s = "Java Programming";

        System.out.println("Length: " + s.length());
        System.out.println("Upper: " + s.toUpperCase());
        System.out.println("Lower: " + s.toLowerCase());
        System.out.println("Char at 2: " + s.charAt(2));
        System.out.println("Substring: " + s.substring(5));
        System.out.println("Replace: " + s.replace("Java", "OOP"));
    }
}
