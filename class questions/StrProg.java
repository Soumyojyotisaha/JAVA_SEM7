class StrProg {
    public static void main(String[] args) {
        String s1 = "Welcome to VIT";
        char ch[] = {'H', 'a', 'i', ' ', 'h', 'e', 'l', 'l', 'o'};
        String s2 = new String(ch, 1, 4);
        String s3 = new String(s1.substring(1, 5));
        System.out.println(s2);
        System.out.println(s3);
    }
}
