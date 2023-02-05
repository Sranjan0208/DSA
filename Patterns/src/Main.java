public class Main {
    public static void main(String[] args) {
        pattern17(4);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }*/
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 0; row <  2*n; row++) {
            // for every row, run the col
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row = 1; row <= n; row++) {
            int spaces = row - 1;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            // for every row, run the col
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int row = 1; row <= n; row++) {
            int spaces = n-row;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            // for every row, run the col
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print("*");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern9(int n){
        int num = 0;
        for (int row = 1; row <= n; row++) {
            int totalColsInRow = 2 * n - row - num;
            int spaces = row-1;
            num = num + 1;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            // for every row, run the col
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("*");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        int temp = n;
        for (int row = 1; row <= n; row++) {
            int totalColsInRows = temp;
            int spaces = row - 1;
            temp--;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        int temp = n;
        for (int row = 1; row <= 2*n; row++) {
            int totalColsInRows = 0;
            int spaces = 0;
            if(row <= n){
                totalColsInRows = temp;
                spaces = row - 1;
                temp--;
            } else {
                ++temp;
                totalColsInRows = temp;
                spaces = 2 * n - row;
            }
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Imp:
    static void pattern13(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = row; spaces < n ; spaces++) {
                System.out.print(" ");
            }
            for (int col1 = 1; col1 <= (2*row -1) ;col1++) {
                if( col1==1 || row == n || col1==(2*row-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        int num = 0;
        for (int row = 1; row <= n; row++) {
            int totalColInRows = 2 * n - row - num;
            num++;
            for (int spaces = 0; spaces < row-1 ; spaces++) {
                System.out.print(" ");
            }
            for (int col1 = 1; col1 <= totalColInRows ;col1++) {
                if( col1==1 || row == 1 || col1==(totalColInRows)) {
                    System.out.print("*");

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        int num = 0;
        for (int row = 1; row < 2*n; row++) {
            int totalColsInRows = 0;
            if (row <= n){
                totalColsInRows = 2 * row - 1;
            } else {
                totalColsInRows = 2 * row - n - num;
                num = num + 4;
            }
            int spaces = row <= n ? n - row : row - n;
            for (int s = 0; s < spaces ; s++) {
                System.out.print(" ");
            }
            for (int col1 = 1; col1 <= totalColsInRows ;col1++) {
                if( col1==1 || col1==totalColsInRows) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        for (int row = 0; row < n; row++) {
            int number = 1;
            System.out.printf("%" + (n - row) * 2 + "s", "");
            for (int col = 0; col <= row; col++) {
                System.out.printf("%4d", number);
                // %4d adds the padding
                number = number * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row = 1; row <= 2*n; row++) {
            int c = row > n ? 2 * n - row : row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern18(int n){

    }



    static void pattern28(int n){
        for (int row = 0; row < 2*n; row++) {
            // for every row, run the col
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }



    static void pattern31(int n){
        int originalN = n;
        n = 2 * n ;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row , col ), Math.min(n-row , n - col )) ;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}