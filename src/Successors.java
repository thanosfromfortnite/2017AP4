public class Successors {

    /**
     * @param num The number that we are trying to find the position of
     * @param intArr Since this is a static method in a separate class, we will need to pass in the array we want
     *               to find the position of num from.
     * @return Position object initialized with the row and column that we found. If the position cannot be found,
     * return null.
     */
    public static Position findPosition(int num, int[][] intArr) {
        for (int i = 0; i < intArr.length; i ++) {
            for (int j = 0; j < intArr[i].length; j ++) {
                if (num == intArr[i][j]) {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    /**
     * @param intArr The array that we will be working with.
     * @return A 2D array containing Position objects of the successive positions of each cell in the 2D array.
     */
    public static Position[][] getSuccessorArray(int[][] intArr) {
        Position[][] output = new Position[intArr.length][intArr[0].length];
        for (int i = 0; i < intArr.length; i ++) {
            for (int j = 0; j < intArr[i].length; j ++) {
                output[i][j] = findPosition((intArr[i][j] + 1), intArr);
            }
        }
        return output;
    }
}
