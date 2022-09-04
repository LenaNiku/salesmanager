public class Main {
    public static void main (String[] args) {
        long[] sales = {22, 44, 66, 88};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("На сегодня топ продаж " + salesManager.max());
    }
}
