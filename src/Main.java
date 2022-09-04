public class Main {
    public static void main (String[] args) {
        int[] sales = {22, 44, 66, 88};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("На сегодняя топ продаж " + salesManager.max());
        System.out.println(salesManager.averageSales());
    }
}
