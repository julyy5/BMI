public class main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 75;
        int height = 180;
        int bmi = service.calculate(weight, height);
        System.out.println(" Индекс массы тела " + bmi);
    }
}
