public class Main {
    public static void main(String[] args) {
//      Первая задача
//        цельночисленные
        byte c= 2;
        short b=3;
        int f=5;
        long v=10L;
        long d = c+b+f+v;
        System.out.println(d);
//        с плавающей точкой
        float n=11.11f;
        double m=11.5;
//        символьные переменные
        char cc=35;
        char ch='#';
        System.out.println(cc+"="+ch);
//        логические переменные
        int age1=7;
        boolean isAdult=age1>=5;
        if (isAdult){
            System.out.println("Возраст больше 5");
        }


//        Вторая задача
        float weightOne=78.2f;
        float weightTwo=82.7f;
        float weightBoxers=weightOne+weightTwo;
        System.out.println("Общий вес боксеров"+"="+weightBoxers+"кг");

//        Третья задача
        byte bananas=5;
        byte weightBanana=80;
        int weightBananas=bananas*weightBanana;
        System.out.println("общий вес бананов"+"="+weightBananas+"грамм");

        int milkVolume=200;
        byte milkVolume1=100;
        byte milkWeight100=105;
        int milkWeight200=milkVolume/milkVolume1*milkWeight100;
        System.out.println("Общий вес молока"+"="+milkWeight200+"грамм");

        byte quantityBriquette=2;
        byte weightBriquette=100;
        int weightBriquettes=quantityBriquette*weightBriquette;
        System.out.println("Общий вес пломбира"+"="+weightBriquette+"грамм");

        byte quantityBollocks=4;
        byte weightEgg=70;
        int weightBollocks=quantityBollocks*weightEgg;
        System.out.println("Общий вес яиц"+"="+weightBollocks+"грамм");

        float breakfastGram=weightBanana+milkWeight200+weightBriquette+weightBollocks;
        System.out.println("завтрак в граммах"+"="+breakfastGram+"грамм");

        int kilogramGram=1000;
        float breakfastKilogram=breakfastGram/kilogramGram;
        System.out.println("завтрак в килограммах"+"="+breakfastKilogram+"кг");

//        Четвертая задача
        float loseWeightKilogram=7;
        float KilogramGram=1000;
        float loseWeightOneGram=250;
        float loseWeightTwoGram=500;
        float loseWeightOneKilogram=loseWeightOneGram/KilogramGram;
        float loseWeightTwoKilogram=loseWeightTwoGram/KilogramGram;
        float loseWeightDayOne=loseWeightKilogram/loseWeightOneKilogram;
        System.out.println("При потере 250 похудеет на 7 кг за"+loseWeightDayOne+"дней");
        float loseWeightDayTwo=loseWeightKilogram/loseWeightTwoKilogram;
        System.out.println("При потере 500 похудеет на 7 кг за"+loseWeightDayTwo+"дней");
        float loseWeightDayOneTwo=(loseWeightDayOne+loseWeightDayTwo)/2;
        System.out.println("В среднем похудеет на"+loseWeightDayOneTwo+"кг");

//        Пятая задача
        int salaryMashaMonth=67760;
        int salaryDenisMonth=83690;
        int salaryKristinaMonth=76230;
//       Почему double а не float?
        double salaryMashaMonthUp=salaryMashaMonth*0.1+salaryMashaMonth;
        System.out.println("Месячна зарплата Маши после повышения"+salaryMashaMonthUp +"рублей в месяц");
        double salaryDenisMonthUp=salaryDenisMonth*0.1+salaryDenisMonth;
        System.out.println("Месячная зарплата Дениса после повышения"+salaryDenisMonthUp+"рублей в месяц");
        double salaryKristinaMonthUp=salaryKristinaMonth*0.1+salaryKristinaMonth;
        System.out.println("Месячная зарплата кристины после повышения"+salaryKristinaMonthUp+"рублей в месяц");

        byte salaryYearMonth=12;

        int salaryMashaYear=salaryMashaMonth*salaryYearMonth;
        System.out.println("Зарплата Маши без повышения"+salaryMashaYear+"в год");
        int salaryDenisYear=salaryDenisMonth*salaryYearMonth;
        System.out.println("Зарплата Дениса без повышения"+salaryDenisYear+"в год");
        int salaryKristinaYear=salaryKristinaMonth*salaryYearMonth;
        System.out.println("Зарплата Кристины без повышения"+salaryKristinaYear+"рублей в год");

        double salaryDenisYearUp=salaryDenisYear*0.1+salaryDenisYear;
        System.out.println("Зарплата Дениса после повышения"+salaryDenisYearUp+"рублей в год");
        double salaryMashaYearUp=salaryMashaYear*0.1+salaryMashaYear;
        System.out.println("Зарплата Маши после повышения"+salaryMashaYearUp+"рублей в год");
        double salaryKristinaYearUp=salaryKristinaYear*0.1+salaryKristinaYear;
        System.out.println("Зарплата Маши после повышения"+salaryKristinaYearUp+"рублей в год");

        double salaryMashaDifferenceYear=salaryMashaYearUp-salaryMashaYear;
        System.out.println("Годовой доход Маши вырос на"+salaryMashaDifferenceYear+"рублей");
        double salaryDenisDifferenceYear=salaryDenisYearUp-salaryDenisYear;
        System.out.println("Годовой доход Дениса вырос на"+salaryDenisDifferenceYear+"рублей");
        double salaryKristinaDifferenceYear=salaryKristinaYearUp-salaryKristinaYear;
        System.out.println("Годовой доход Критины вырос на"+salaryKristinaDifferenceYear+"рублей");


    }
}