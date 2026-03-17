class StringMutabilityDemo {
    public static void main(String[] args) {
       
        System.out.println("--- Demonstrating String Immutability ---");
        
        String s = "Hello";
        System.out.println("Initial String value: \"" + s + "\"");
        System.out.println("Memory address (hash code) of s: " + System.identityHashCode(s));

        s = s + " World";
        System.out.println("Value of s after concatenation: \"" + s + "\"");
        // The hash code changes, proving a new object was created, not modified in place
        System.out.println("Memory address (hash code) after concatenation: " + System.identityHashCode(s)); 
        System.out.println("Conclusion: The original String object was not changed. A new String object was created in memory.");
        System.out.println();


        System.out.println("--- Demonstrating StringBuffer Mutability ---");

        StringBuffer sb = new StringBuffer("Java");
        System.out.println("Initial StringBuffer value: \"" + sb + "\"");
        System.out.println("Memory address (hash code) of sb: " + System.identityHashCode(sb));

        sb.append(" Programming");
        System.out.println("Value after append: \"" + sb + "\"");
        System.out.println("Memory address (hash code) after append: " + System.identityHashCode(sb));

        sb.insert(5, "is fun ");
        System.out.println("Value after insert: \"" + sb + "\"");
        System.out.println("Memory address (hash code) after insert: " + System.identityHashCode(sb));

        sb.replace(0, 4, "Coding");
        System.out.println("Value after replace: \"" + sb + "\"");
        System.out.println("Memory address (hash code) after replace: " + System.identityHashCode(sb));

        System.out.println("Conclusion: The StringBuffer object was modified in the same memory location (it is mutable).");
    }
}
