import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter The Numebr Of Elements ! ");
        int rows = input.nextInt();
        int nums[] = new int[rows];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
    }
}