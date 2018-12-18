public class Successors {

    /**
     * @param num The number that we are trying to find the position of
     * @param intArr Since this is a static method in a separate class, we will need to pass in the array we want
     *               to find the position of num from.
     * @return Position object initialized with the row and column that we found.
     */
    public static Position findPosition(int num, int[][] intArr) {
        int row = 0, column = 0;
        for (int i = 0; i < intArr.length; i ++) {
            for (int j = 0; j < intArr[i].length; j ++) {
                if (num == intArr[i][j]) {
                    row = i; column = j;
                }
            }
        }
        return new Position(row, column);
    }
}
