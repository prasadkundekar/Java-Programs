class ReverseString {
    public static void main(String[] args) {
        String original = "Prasad Kundekar";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}