package storage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.List;

class StorageTest {

    static Storage storage;
    static Method[] methods;

    @BeforeEach
    void constructor() {
        storage = new Storage();
        methods = storage.getClass().getDeclaredMethods();
    }

    @DisplayName("Checking for not null constructor")
    @Test
    void constructorNotNull() {
        Assertions.assertNotNull(storage);
    }

    @DisplayName("Checking for not null methods")
    @Test
    void methodsNotNull() {
        for (Method method : methods) {
            Assertions.assertNotNull(method);
        }
    }
}