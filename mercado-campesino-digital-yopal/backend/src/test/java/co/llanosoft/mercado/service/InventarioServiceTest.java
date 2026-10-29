package co.llanosoft.mercado.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class InventarioServiceTest {
 private final InventarioService service = new InventarioService();
 @Test void aceptaCantidadDisponible() { assertDoesNotThrow(() -> service.validarCantidad(2,5)); }
 @Test void rechazaCantidadMayorAlStock() { assertThrows(IllegalStateException.class, () -> service.validarCantidad(6,5)); }
 @Test void rechazaCantidadCero() { assertThrows(IllegalArgumentException.class, () -> service.validarCantidad(0,5)); }
}