public class z4 {
    public static void main(String[] args) {
        short a = 20;
        short b = 1440;
        int c = 43200;
        short machinePerformance= 16 / 2;
        int machine20min = machinePerformance * a;
        int machine24h = machinePerformance * b;
        int machine1m = machine24h * c;
        System.out.println("За 20 минут машина произвела " + machine20min + " штук бутылок");
        System.out.println("За сутки машина произвела " + machine24h + " штук бутылок");
        System.out.println("За месяц машина произвела " + machine1m + " штук бутылок");
    }
}
