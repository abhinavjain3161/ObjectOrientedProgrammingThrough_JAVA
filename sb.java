class StringVsStringBuffer {
    public static void main(String[] args) {

        // --------- String (Immutable) ---------
        String str = "Java";
        System.out.println("Original String: " + str);
        System.out.println("String HashCode before modification: " + str.hashCode());

        str = str.concat(" Programming");
        System.out.println("Modified String: " + str);
        System.out.println("String HashCode after modification: " + str.hashCode());

        System.out.println("----------------------------------");

        // --------- StringBuffer (Mutable) ---------
        StringBuffer sb = new StringBuffer("Java");
        System.out.println("Original StringBuffer: " + sb);
        System.out.println("StringBuffer HashCode before modification: " + sb.hashCode());

        sb.append(" Programming");
        System.out.println("Modified StringBuffer: " + sb);
        System.out.println("StringBuffer HashCode after modification: " + sb.hashCode());
    }
}
