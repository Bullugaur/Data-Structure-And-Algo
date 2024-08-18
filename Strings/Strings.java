import java.util.*;

public class Strings {
    
    public static void PrintLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        // char arr[] = { 'a', 'b', 'c', 'd' };

        //input
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();

        // length
        // System.out.println("Name = " + name + " and length is : " + name.length());
        
        // concatination
        String firstName = "Jyoti";
        String LastName = "Gaur";
        String fullname = firstName +" "+ LastName;
        // System.out.println(fullname);

        // charAt()
        // System.out.println(fullname.charAt(6));
        

        // fuction call
        PrintLetter(fullname);
    }
}