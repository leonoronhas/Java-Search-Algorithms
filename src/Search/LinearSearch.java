package Search;

public class LinearSearch {

    // Worse case is O(n)

    public static void main(String[] args) {
        int[] intArray = {20, 35, -35, 55, 80, -56, 1, 7, 18};

        System.out.println(linearSearch(intArray, 20));
        System.out.println(linearSearch(intArray, 800));
        System.out.println(linearSearch(intArray, 1));
        System.out.println(linearSearch(intArray, 18));
    }

    // Returns the index position of the values, -1 otherwise
    public static int linearSearch(int[] input, int value){
        for (int i = 0; i < input.length; i++) {
            if(input[i] == value){
                return i;
            }
        }
        return -1;
    }
}
