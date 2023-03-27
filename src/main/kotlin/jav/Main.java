package jav;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            //   System.out.println(i);
        }

        int[] array = new int[101];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            //  System.out.println(array[i]);
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
