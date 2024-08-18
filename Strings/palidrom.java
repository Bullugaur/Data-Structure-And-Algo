public class palidrom {

    public static boolean find(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String name = "noone";
        Boolean ans = find(name);
        if (ans == true) {
            System.out.println("This is a palindrom String");
        } else {
            System.out.println("This is not a palindrom String");
        }
        
    }
}
