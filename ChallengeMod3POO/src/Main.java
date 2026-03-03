import br.com.leodev.model.car.CarModel;

public class Main {
    public static void main(String[] args) {
        CarModel car = new CarModel();

        car.setModel("Argo");
        car.setYearPrice1(80000);
        car.setYearPrice2(90000);
        car.setYearPrice3(50000);

        car.calculatePrice();
    }
}
