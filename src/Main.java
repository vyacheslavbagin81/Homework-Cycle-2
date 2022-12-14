public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
    }

    public static void task1() {
        System.out.println("Задача №1");
        int accumulation = 15_000;
        int totalAccumulation = 0;
        int i = 0;
        while (totalAccumulation <= 2_459_000) {
            i++;
            totalAccumulation = totalAccumulation + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalAccumulation + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача №2");
        int min = 1;
        int max = 10;
        while (min <= 10) {
            System.out.print(min + " ");
            min++;
        }
        System.out.println();
        while (max >= 1) {
            System.out.print(max + " ");
            max--;
        }
    }

    public static void task3() {
        System.out.println("Задача №3");
        int populationBeginning = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int i = 1;
        while (i <= 10) {
            populationBeginning = populationBeginning + birthRate - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + populationBeginning);
            i++;
        }
    }

    public static void task4() {
        System.out.println("Задача №4");
        double procent = 1.07;
        int initialAmount = 15_000;
        double totalAccumulation = 0;
        int i = 1;
        while (totalAccumulation <= 12_000_000) {
            totalAccumulation = totalAccumulation * procent + initialAmount;
            String result = String.format("%.2f", totalAccumulation);
            System.out.println("Месяц " + i + ", сумма накоплений составляет " + result);
            i++;
        }
    }

    public static void task5() {
        System.out.println("Задача №5");
        double procent = 1.07;
        int initialAmount = 15_000;
        double totalAccumulation = 0;
        int i = 1;
        while (totalAccumulation <= 12_000_000) {
            totalAccumulation = totalAccumulation * procent + initialAmount;
            String result = String.format("%.2f", totalAccumulation);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений составляет " + result);
            }
            i++;
        }
    }

    public static void task6() {
        System.out.println("Задача №6");
        double procent = 1.07;
        int initialAmount = 15_000;
        double totalAccumulation = 0;
        int i = 1;
        while (i <= 9 * 12) {
            totalAccumulation = totalAccumulation * procent + initialAmount;
            String result = String.format("%.2f", totalAccumulation);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений составляет " + result);
            }
            i++;
        }
    }

    public static void task7() {
        System.out.println("Задача №7");
        int dateOfTheFirstFriday = 3;
        int numberOfDaysInAMonth = 31;
        while (dateOfTheFirstFriday <= numberOfDaysInAMonth) {
            System.out.println("Сегодня пятница, " + dateOfTheFirstFriday + "-е число. Необходимо подготовить отчет");
            dateOfTheFirstFriday = dateOfTheFirstFriday + 7;
        }

    }

    public static void task8() {
        System.out.println("Задача №8");
        int firstTheLastYearOfThePeriod  = 1822;
        int lastYearOfThePeriod = 2122;
        for (int i=0;i<=lastYearOfThePeriod;i=i+79){
            if (i>=firstTheLastYearOfThePeriod){
                System.out.println(i);
            }
        }
    }
}