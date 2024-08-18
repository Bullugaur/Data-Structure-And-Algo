// using dexicographic 
// String fuction compaireTo()  // in this fuction a and A not equally treated
// String function compaireToIgnoreCAse() in this a ans A both are equaly treated

// if return value is 0 it means Strings are equal
// <0 it means string1 < string2
// >0 it means string1 > string2

public class largestStr {

    public static void main(String[] args) {

        String fruits[] = { "Apple", "mango", "banana" };

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
