package JavaBasics.ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grapeYard = Integer.parseInt(scanner.nextLine());
        double grapePerSquareMeter = Double.parseDouble(scanner.nextLine());
        int litersNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double grapeProduction = grapeYard*grapePerSquareMeter*0.4;
        double wineProduced = grapeProduction/2.5;
        double diff = Math.abs(litersNeeded-wineProduced);
        if (wineProduced >= litersNeeded) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n" +
                            "%.0f liters left -> %.0f liters per person.",
                    Math.floor(wineProduced), Math.ceil(diff), Math.ceil(diff/workers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(diff));
        }
    }
}
