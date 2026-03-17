class StringBufferOperations {

    public static void main(String[] args) {

        // Create StringBuffer
        StringBuffer sb = new StringBuffer("Java");

        // Append operation
        sb.append(" Programming");
        System.out.println("After Append  : " + sb);

        // Insert operation
        sb.insert(5, "is ");
        System.out.println("After Insert  : " + sb);

        // Reverse operation
        sb.reverse();
        System.out.println("After Reverse : " + sb);
    }
}
