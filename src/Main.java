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
        boolean noAdult=age1<=5;


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

        int kilogram=1000;
        float breakfastKilogram=breakfastGram/kilogram;
        System.out.println("завтрак в килограммах"+"="+breakfastKilogram+"кг");

//        Четвертая задача


    }
}