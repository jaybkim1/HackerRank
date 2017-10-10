package Day11;
import java.util.Scanner;


public class Day11 { // 2D Arrays = Multidimensional arrays

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
		
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i=0; i<arr.length-2; i++){
            for (int j=0; j<arr[0].length - 2; j++){
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] 
                    + arr[i+1][j+1]
                    + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        in.close();
        System.out.println(maxSum);
	}

}
