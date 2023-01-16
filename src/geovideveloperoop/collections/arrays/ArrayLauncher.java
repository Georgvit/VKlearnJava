package geovideveloperoop.collections.arrays;

public class ArrayLauncher {

    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 0;
        myArray[1] = 100;
        myArray[2] = 200;
        myArray[3] = 300;
        myArray[4] = 400;

        int[] myArray2 = {0, 300, 200, 1000, 400};
        System.out.println(myArray[0]);
//        System.out.println(myArray2[2]);
        for (Integer i : myArray2) {
            System.out.print(i + " ");
        }
        System.out.println();

        sort(myArray2);

        for (Integer i : myArray2) {
            System.out.print(i + " ");
        }

    }

    private static int[] sort(int[] array) {
//        int[] myNewArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
