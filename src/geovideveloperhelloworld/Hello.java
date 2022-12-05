package geovideveloperhelloworld;

public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello World");
        int[] values = {9, 2, 10, 5, 6, 4, 1, 4};
        sumElement(values);
    }

    public static int findMinIndex(int[] values) {
        int minIndex = 0;
        int minValues = values[minIndex];
        for (int i = 0; i < values.length; i++) {
            if (minValues > values[i]) {
                minValues = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] values) {
        int maxIndex = 0;
        int maxValues = values[maxIndex];
        for (int i = 0; i < values.length; i++) {
            if (maxValues < values[i]) {
                maxValues = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void sumElement(int[] valees) {
        int result = 0;
        int minIndex = findMinIndex(valees);
        int maxIndex = findMaxIndex(valees);
        int start = 0;
        int finish = 2;
        if (minIndex < maxIndex){
            start = minIndex;
            finish = maxIndex;
        } else {
            start = maxIndex;
            finish = minIndex;
        }
        while (start + 1 < finish) {
            result = result + valees[start + 1];
            start++;
        }
        System.out.println(result);
    }


}
