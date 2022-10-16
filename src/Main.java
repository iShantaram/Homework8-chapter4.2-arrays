public class Main {
    public static void main(String[] args) {
        // HW8

        // HW1
        // Task1
        System.out.println("\nTask 1:");
        double vklad = 15000;
        double summaryVklad = 0;
        double needSummary = 2459000;
        int monthCount = 0;
        while (summaryVklad < needSummary) {
            monthCount++;
            summaryVklad += vklad;
        }
        System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + summaryVklad + " рублей");

        // Task2
        System.out.println("\nTask 2:");
        int j = 1;
        while (j <= 10) {
            System.out.printf(j++ + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.printf(i + " ");
        }
        System.out.println();

        // Task3
        System.out.println("\nTask 3:");
        int populationY = 12000000;
        int increasePopulationYFor1000People = 17;
        int decreasePopulationYFor1000People = 8;

        int increasePopulationForY;
        int decreasePopulationForY;
        int changePopulationY;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Год " + i + ", численность населения составляет - " + populationY + " человек");
            increasePopulationForY = populationY / 1000 * increasePopulationYFor1000People;
            decreasePopulationForY = populationY / 1000 * decreasePopulationYFor1000People;
            changePopulationY = increasePopulationForY - decreasePopulationForY;
            populationY += changePopulationY;
        }


        // HW2
        // Каждый месяц 7%!!! Это просто х2.25 за год!!! 125% годовых!!!
        // Task1
        System.out.println("\nTask 1:");
        double vkladVasilij = 15000;
        needSummary = 12000000;
        double percent = 0.07;

        monthCount = 0;

        while (vkladVasilij < needSummary) {
            monthCount++;
            vkladVasilij = vkladVasilij*(1+percent);
            System.out.println("Месяц " + monthCount + ", сумма вклада составляет " + vkladVasilij);
        }

        // Task2
        System.out.println("\nTask 2:");
        monthCount = 0;
        vkladVasilij = 15000;

        while (vkladVasilij < needSummary) {
            monthCount++;
            vkladVasilij = vkladVasilij*(1+percent);
            if (monthCount%6 == 0) {
                System.out.println("Месяц " + monthCount + ", сумма вклада составляет " + vkladVasilij);
            }
        }

        // Task3
        System.out.println("\nTask 3:");
        monthCount = 0;
        vkladVasilij = 15000;

        while (monthCount <= 9*12) {
            monthCount++;
            vkladVasilij = vkladVasilij*(1+percent);
            if (monthCount%6 == 0) {
                System.out.println("Месяц " + monthCount + ", сумма вклада составляет " + vkladVasilij);
            }
        }

        // Task4
        System.out.println("\nTask 4:");
        int firstFriday = 6; // от 1 до 7
        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число, необходимо подготовить отчет.");
        }

        // HW3
        // Task1
        System.out.println("\nTask 1:");
        int currentYear = 2022;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int i = startYear; i <= endYear; i++) {
            if (i%79 == 0) {
                System.out.println(i);
            }
        }

        // Task2
        System.out.println("\nTask 2:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2*i);
        }

    }
}