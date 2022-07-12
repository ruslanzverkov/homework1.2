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
        boolean age =10>=7;
        boolean age2=10<=5;
        System.out.println(age);
        System.out.println(age2);

//        Вторая задача
        float weightOne=78.2f;
        float weightTwo=82.7f;
        float weightBoxers=weightOne+weightTwo;
        System.out.println("Общий вес боксеров"+weightBoxers);



    }
}