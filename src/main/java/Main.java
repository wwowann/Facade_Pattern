import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinOps bins = new BinOps();
        System.out.println("Введите первое число:");
        String value1 = scan.nextLine();
        System.out.println("Введите второе число:");
        String value2 = scan.nextLine();
        System.out.println("Сумма двоичных чисел равна: " + bins.sum(value1, value2));
        System.out.println("Произведение двоичных чисел равно: " + bins.mult(value1, value2));
    }
}