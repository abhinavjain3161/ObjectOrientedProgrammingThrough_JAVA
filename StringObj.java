class StringVsStringBufferDemo {

    public static void main(String[] args) {
        String s = "Java";
        System.out.println("Original String       : " + s);
        System.out.println("String HashCode       : " + s.hashCode());

        s = s.concat(" Programming");
        System.out.println("After Modification    : " + s);
        System.out.println("String HashCode After : " + s.hashCode());

        System.out.println();

              StringBuffer sb = new StringBuffer("Java");
        System.out.println("Original StringBuffer : " + sb);
        System.out.println("StringBuffer HashCode : " + sb.hashCode());

        sb.append(" Programming");
        System.out.println("After Modification    : " + sb);
        System.out.println("StringBuffer HashCode After : " + sb.hashCode());
    }
}
