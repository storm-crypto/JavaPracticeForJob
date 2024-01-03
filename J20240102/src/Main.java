public class Main {
    public static void main(String[] args) {
        String s1 = "23";
        int num = 10;
        // int变string
        String str1 = num + "";
        String str2 = String.valueOf(str1);
        // string变int
        int num2 = Integer.parseInt(s1);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(s1);
        System.out.println(num2);
    }
}