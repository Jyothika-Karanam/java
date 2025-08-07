public class ThreeDArrayExample {
    public static void main(String[] args) {
        // Define a 3D array with dimensions 2x3x4
        int[][][] cube = new int[2][3][4];

        // Fill the array with values
        int value = 1;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = value++;
                }
            }
        }

        // Print the 3D array
        for (int i = 0; i < cube.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}