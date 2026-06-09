package Arrays;

public class buyandsellstock {
    public static void main(String[] args) {

        int arr[] = {9, 4, 2, 10, 11, 8};

        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        System.out.println(minPrice);
        System.out.println(maxPrice);

        int buyDay = -1;
        int sellDay = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minPrice) {
                minPrice = arr[i];
                buyDay = i;
            }

            if (arr[i] > maxPrice) {
                maxPrice = arr[i];
                sellDay = i;
            }
        }

        System.out.println("Buy Day  : " + buyDay);
        System.out.println("Buy Price: " + minPrice);

        System.out.println("Sell Day  : " + sellDay);
        System.out.println("Sell Price: " + maxPrice);

        System.out.println("Profit: " + (maxPrice - minPrice));
    }
}