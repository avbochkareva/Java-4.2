public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double data = service.calculate (50.3, 1.50);
        System.out.println(data);
    }

}