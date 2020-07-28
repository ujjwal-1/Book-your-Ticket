import java.util.*;
public class bookYourTickets {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows, in which the cinema hall's seats are divided : ");
            int n = sc.nextInt();
            System.out.println("Enter the number of column, in which the cinema hall's seats are divided : ");
            int m = sc.nextInt();
            System.out.println("Assign the number of seats(if booked input 1, else input 0) in each rows( if there are 3 rows and 3 columns: there are 9 values to be entered) ");
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the number of sets you want in same rows");
            int k = sc.nextInt();
            int counter = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == 0) {
                        counter = counter + 1;
                        if (counter == k) {
                            System.out.println("The desired seat can be booked in following rows : ");
                            System.out.print(i + 1);
                            i = n + 1;
                            break;
                        }
                        if (j == m - 1 && counter < k) {
                            counter = 0;
                        }
                    } else {
                        counter = 0;
                    }

                }

            }
            if (counter < k) {
                System.out.println("Sorry the booking is unsuccessful because the number of consecutive seat available is:  ");
                System.out.print(0);
            }
        }
    }
