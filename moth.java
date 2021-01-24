package lesson13;

import java.util.Scanner;

public class moth {

    public static void month(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день");
                break;
            case 2:
                System.out.println("В феврале 28 дней");
            case 4:
            case 6:
            case 9:
            case 11:

                System.out.println("В этом месяце 30 дней");
                break;
            default:
                System.out.println("В году только 12 месяцев");
        }
    }

    public static void main(String[] args) {

        month(5);
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите номер месяца, чтобы узнать кол-во дней в нем: ");
        int m = Integer.parseInt(scanner.nextLine());
    month(m);
    }
}
