public class Main {
    public static void main (String[] args) {
        int[] sales;
        SalesManager salesManager = new SalesManager();
        System.out.println("На сегодняя топ продаж" + salesManager.max());
    }
}
