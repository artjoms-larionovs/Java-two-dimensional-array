import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //two-dimensional array
        double a[][] = {{0.5, 0.5, 0.5, 0.5, 0.5},
                {0, 1, 0, 1, 1},
                {0.5, 1, 0.5, 0.5, 0},
                {0, 0.5, 0, 0.5, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0.5, 0.5},
                {0, 0.5, 0, 0, 1}};
        int i, j;
        int ch;
        int s=0;

        System.out.print("mode (1, 2 or 3): ");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        //randomize
        Random rnd = new Random();

        switch (ch) {
            //enter from the keyboard
            case 1: {
                double num;
                for(i = 0; i < 7; i++){
                    for(j = 0; j < 5; j++){
                        System.out.println("player: " + (i+1));
                        System.out.println("batch: " + (j+1));
                        System.out.println("record the result: ");
                        num = sc.nextDouble();
                        //if the user will write wrong number
                        if (num == 1 || num ==0.5 || num == 0) {
                            a[i][j] = num;
                        }
                        else {
                            System.out.println("write 1(win), 0.5(does not differ) or 0(lose)");
                            j--;
                        }
                    }
                    System.out.println();
                }
                break;
            }

            //randomize the array
            case 2: {
                int ran;
                for(i = 0; i < 7; i++){
                    for(j = 0; j < 5; j++){
                        ran=rnd.nextInt(3);
                        if (ran==0) {
                            a[i][j] = ran;
                        }
                        else if (ran==1) {
                            a[i][j] = 1;
                        }
                        else  {
                            a[i][j] = 0.5;
                        }
                    }
                }
                break;
            }
            //leave the array unchanged
            case 3: {
                break;
            }

            default: {
                System.out.println("mode error");
                sc.close();
                return;
            }
        }

        sc.close();

        // Display the elements of an array on the screen in the form of a table
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        // separated by a single space character (with one decimal place)

        System.out.println("result:");
        System.out.print("numbers: ");

        // Display the athletes numbers on the screen

        for (i = 0; i < 7; i++) {
            int win=0;
            for (j = 0; j < 5; j++) {
                if (a[i][j]==1 || a[i][j]==0.5) {
                    win++;
                }
                if (win==5) {
                    s=s+1;
                    System.out.print(i+1 + " ");
                }
            }
        }
        if (s==0) {
            System.out.print("");
        }
        // Display on the screen the number of athletes who have not lost a single match
        
        System.out.print("\ncount: ");
        if (s==0) {
            System.out.print(0);
        }
        else {
            System.out.print(s);
        }


    }
}