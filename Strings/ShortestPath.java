public class ShortestPath {

    public static float find(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            //South
            if (dir == 'S') {
                y--;
            }
            //nORTH
            else if (dir == 'N') {
                y++;
            }
            //west
            else if (dir == 'W') {
                x--;
            }
            // east 
            else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);

    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(find(str));
    }
}
