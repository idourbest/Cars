package factory;

import entity.Car;
import entity.CarModel;
import entity.Detail;

import java.util.List;
import java.util.Random;

import static factory.CarAssembly.logger;

public class Factory {
    public static Car car(List<Detail> engine, List<Detail> carriage, List<Detail> body) {

        CarModel model = carType(body.get(0));
        logger.trace("Took body " + model.toString());
        body.remove(0);

        Detail engineRequired;
        Detail carriageRequired;

        if (model.equals(CarModel.POLO)) {
            engineRequired = Detail.POLO_ENGINE;
        } else {
            engineRequired = Detail.JETTA_ENGINE;
        }

        if (model.equals(CarModel.POLO)) {
            carriageRequired = Detail.POLO_CARRIAGE;
        } else {
            carriageRequired = Detail.JETTA_CARRIAGE;
        }

        int carriageDefiner = carriage.indexOf(carriageRequired);
        if (carriageDefiner == -1) {
            logger.error("No carriage found");
            throw new RuntimeException("No carriage found");
        }
        logger.trace("Took carriage " + model.toString());
        carriage.remove(carriageDefiner);

        int engineDefiner = engine.indexOf(engineRequired);
        if (engineDefiner == -1) {
            logger.error("No engine found");
            throw new RuntimeException("No engine found");
        }
        logger.trace("Took engine " + model.toString());
        engine.remove(engineDefiner);

        Random vinGenerator = new Random();
        long vin = Math.abs(vinGenerator.nextLong());
        logger.trace("VIN generated");

        Car car = new Car(model, vin);
        return car;
    }

    public static CarModel carType(Detail detail) {
        if (detail.toString().startsWith(CarModel.JETTA.toString())) {
            return CarModel.JETTA;
        } else {
            return CarModel.POLO;
        }
    }
}