import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice a picture:");
        System.out.println("1.rectangle");
        System.out.println("2.Tam giac bottom left");
        System.out.println("3.Tam giac top left");
        System.out.println("4.Tam giac can");
        choice = scanner.nextInt();
        while (choice !=0) {
            switch (choice) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*" + " ");
                        }
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(" ");
                        for (int j = 1; j < i; j++) {
                            System.out.print("*" + " ");
                        }
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        System.out.println(" ");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*" + " ");
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < 9; i++) {
                        System.out.println(" ");
                        for (int j = 0;j<19;j++){
                            if (j<10-i | j>(10-i)+2*i) System.out.print(" ");
                            else System.out.print("*");
                        }
                    }
                    break;
            }
            choice = scanner.nextInt();
        }
    }
}
