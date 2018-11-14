package controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.validateMockitoUsage;

class TollCollectorSystemTest {

    TollCollectorSystem tollCollectorSystem = new TollCollectorSystem();
    TollCollector tollCollector = mock(TollCollector.class);

    @Test
    @DisplayName("should invoke the menu method")
    void shouldInvokeMenuMethod() {
        tollCollectorSystem.menu();
    }

}