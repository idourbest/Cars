package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Random;

class CarTest {

    static Car car;
    static Method[] methods;

    @BeforeEach
    void constructor() {
        Random vinGenerator = new Random();
        long vin = Math.abs(vinGenerator.nextLong());
        car = new Car(CarModel.JETTA, vin);
        methods = car.getClass().getDeclaredMethods();
    }

    @DisplayName("Checking for not null constructor")
    @Test
    void constructorNotNull() {
        Assertions.assertNotNull(car);
    }

    @DisplayName("Checking for not null methods")
    @Test
    void methodsNotNull() {
        for (Method method : methods) {
            Assertions.assertNotNull(method);
        }
    }
}