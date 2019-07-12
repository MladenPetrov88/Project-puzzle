import java.util.Scanner;

public class ProjectPrize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int project = Integer.parseInt(scanner.nextLine());
        double pricePerPoint = Double.parseDouble(scanner.nextLine());
        int points = 0;
        for (int i = 1; i <= project ; i++) {
            int mark = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                points += mark * 2;
            } else {
                points += mark;
            }
        }

        double totalMoney = pricePerPoint * points;
        System.out.printf("The project prize was %.2f lv.", totalMoney);
    }
}
