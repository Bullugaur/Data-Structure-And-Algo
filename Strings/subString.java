public class subString {

    public static String substring(String str, int sInx, int eInx) {
        String substr = "";
        for (int i = sInx; i < eInx; i++) {
            substr += str.charAt(i);
        }
        return substr;
}

    public static void main(String[] args) {
        String str = "Bulbul gaur";
        
        System.out.println(str.substring(0, 8));// inbuilt fuction 
        System.out.println(substring(str, 0, 8));// fuction created by us
    }
}
