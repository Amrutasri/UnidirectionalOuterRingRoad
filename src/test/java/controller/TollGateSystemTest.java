package controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class TollGateSystemTest {

    TollGateSystem tollCollectorSystem = new TollGateSystem();
    TollCollector tollCollector = mock(TollCollector.class);

    @Test
    @DisplayName("should invoke the menu method")
    void shouldInvokeMenuMethod() {
        tollCollectorSystem.menu();
    }

}