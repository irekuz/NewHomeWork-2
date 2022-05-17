public class Main {
    public static void main(String[] args) {
        byte oneExample = 127;
        System.out.println(oneExample);
        short TwoExample = 32767;
        System.out.println(TwoExample);
        int threeExample= 2147483647;
        System.out.println(threeExample);
        long fourExample = 9L;
        System.out.println(fourExample);
        float fiveExample = 4.8f;
        System.out.println(fiveExample);
        double sixExample = 3.145673456;
        System.out.println(sixExample);

        float BoxerWeight1 = 78.2f;
        float BoxerWeight2 = 82.7f;
        float GeneralWeight = BoxerWeight1 + BoxerWeight2;
        System.out.println("Общий вес боксеров " + GeneralWeight + " кг!");
        float DifferenceInWeight = - BoxerWeight1 + BoxerWeight2;
        System.out.println("Разница в весе " + DifferenceInWeight + " кг!");

        byte BananaWeight = 80;
        byte MilkWeight = 105;
        byte IceCreamWeight = 100;
        byte EggWeight = 70;

        byte Bananas = 5;
        byte Milk = 2;
        byte IceCream = 2;
        byte Eggs = 4;

        int TotalWeight = (Bananas * BananaWeight) + (Milk * MilkWeight) + (IceCream * IceCreamWeight) + (Eggs * EggWeight);
        System.out.println("Общее вес " + TotalWeight + " гр!");

        float TotalWeightInKg = TotalWeight/ 1000f;
        System.out.println("Общий вес " + TotalWeightInKg + " кг!");

        byte weight = 7;
        short weightInKg = 7 * 1000;
        short loseWeight = 250;
        short LoseWeight = 500;
        int needDays1 = weightInKg / loseWeight;
        int needDays2= weightInKg / LoseWeight;
        System.out.println("Дней понадобится " + needDays1);
        System.out.println("Дней понадобится " + needDays2);


        int Mariya = 67760;
        int Denis = 83960;
        int Kristina = 76230;
        int SalaryUpForMariya = Mariya / 100 * 110;
        int SalaryUpForDenis = Denis / 100 * 110;
        int SalaryUpForKristina = Kristina / 100 * 110;
        int OneYearSalaryMariya = Mariya * 12;
        int OneYearSalaryDenis = Denis * 12;
        int OneYearSalaryKristina = Kristina * 12;
        int OneYearSalaryAfterUpMariya = SalaryUpForMariya * 12;
        int OneYearSalaryAfterUpDenis = SalaryUpForDenis * 12;
        int OneYearSalaryAfterUpKristina = SalaryUpForKristina * 12;
        int AnnualDifferenceForMariya = OneYearSalaryAfterUpMariya - OneYearSalaryMariya;
        int AnnualDifferenceForDenis = OneYearSalaryAfterUpDenis- OneYearSalaryDenis;
        int AnnualDifferenceForKristina = OneYearSalaryAfterUpKristina - OneYearSalaryKristina;
        System.out.println("Зарплата Марии после повышения " + SalaryUpForMariya + " рублей!");
        System.out.println("Годовой доход вырос на " + AnnualDifferenceForMariya + " рублей!");

        System.out.println("Зарплата Кристины после повышения " + SalaryUpForKristina + " рублей!");
        System.out.println("Годовой доход вырос на " + AnnualDifferenceForKristina + " рублей!");

        System.out.println("Зарплата Дениса после повышения " + SalaryUpForDenis + " рублей!");
        System.out.println("Годовой доход вырос на " + AnnualDifferenceForDenis + " рублей!");
    }
}