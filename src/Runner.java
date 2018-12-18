public class Runner {

    public static void main(String[] args) {
        /* The example array */
        int[][] coolArray = {
                {10, 15, 13, 8},
                {12, 6, 9, 7},
                {17, 11, 16, 14}
        };

        /*
        Position partA = Successors.findPosition(7, coolArray);
        System.out.println("Row of 7: " + partA.r);
        System.out.println("Column of 7: " + partA.c);
        */

        Position[][] partB = Successors.getSuccessorArray(coolArray);

        for (int i = 0; i < partB.length; i ++) {
            for (int j = 0; j < partB[i].length; j ++) {
                if (partB[i][j] != null) {
                    System.out.print(("(" + partB[i][j].r + ", " + partB[i][j].c + ")") + "; ");
                }
                else {
                    System.out.print("null" + "; ");
                }
            }
            System.out.println();
        }
    }
}
