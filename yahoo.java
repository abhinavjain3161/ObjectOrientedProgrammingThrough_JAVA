class StringBufferDemos {
    public static void main(String[] args) {
        // 1. Create a StringBuffer with initial text
        StringBuffer sb = new StringBuffer("Java");
        System.out.println("Initial: " + sb);

        // 2. Append another string
        sb.append(" Programming");
        System.out.println("After Append: " + sb);

        // 3. Insert a word at a specific index
        sb.insert(5, "Language ");
        System.out.println("After Insert: " + sb);

        // 4. Delete a substring
        sb.delete(5, 14); // Removes "Language "
        System.out.println("After Delete: " + sb);

        // 5. Reverse the final string
        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}
