public class compairision {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
        
        if (s1 == s3) { 
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }


        if (s1.equals(s3)) {// equal fuction checks value
    System.out.println("Strings are same");
} else {
    System.out.println("Stringsare not same");
}


    }
}
