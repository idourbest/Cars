package entity;

import static factory.CarAssembly.logger;

public class Car {
    String carModel;
    long vin;

    public Car(CarModel carModel, long vin) {
        this.carModel = carModel.toString();
        logger.trace("Car assembled");

        this.vin = vin;
        logger.trace("vin " + vin + " marked");
        logger.info(carModel + " with VIN " + vin + " produced");
    }
    public void modelNameSupplier() {
        System.out.println("\n" + carModel + "\n" + vin + "\n");
    }
}