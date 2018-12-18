public class Runner {

    public static void main(String[] args) {
        /* The example array */
        int[][] coolArray = {
                {10, 15, 13, 8},
                {12, 6, 9, 7},
                {17, 11, 16, 14}
        };

        Position partA = Successors.findPosition(7, coolArray);
        System.out.println("Row of 7: " + partA.r);
        System.out.println("Column of 7: " + partA.c);
    }
}
