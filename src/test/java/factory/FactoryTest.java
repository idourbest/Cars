package factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

class FactoryTest {

    static Factory factory;
    static Method[] methods;

    @BeforeEach
    void constructor() {
        factory = new Factory();
        methods = factory.getClass().getDeclaredMethods();
    }

    @DisplayName("Checking for not null constructor")
    @Test
    void constructorNotNull() {
        Assertions.assertNotNull(factory);
    }

    @DisplayName("Checking for not null methods")
    @Test
    void methodsNotNull() {
        for (Method method : methods) {
            Assertions.assertNotNull(method);
        }
    }
}