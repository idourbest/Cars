package factory;

import entity.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class CarAssembly {

    public static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        Storage storage = new Storage();

        storage.engineStorage();
        storage.carriageStorage();
        storage.bodyStorage();

        while (true) {
            logger.debug("Production process started");
            try {
                cars.add(Factory.car(storage.getEngine(), storage.getCarriage(), storage.getBody()));
                logger.debug("Car recorded in list");
            } catch (RuntimeException e) {
                logger.error("No details left, production stopped");
                break;
            }
        }

        if (cars.isEmpty()) {
//            logger.info("Нет созданных автомобилей");
            System.out.println("No cars, try again");
        }

        for (Car carsList : cars) {
            carsList.modelNameSupplier();
        }
    }
}