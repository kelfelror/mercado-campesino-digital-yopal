package co.llanosoft.mercado.service;
import org.springframework.stereotype.Service;
@Service
public class InventarioService {
 // RF-07: validación inicial. El descuento real debe hacerse en una transacción de base de datos.
 public void validarCantidad(int solicitada, int disponible) {
  if (solicitada <= 0) throw new IllegalArgumentException("La cantidad debe ser mayor que cero.");
  if (solicitada > disponible) throw new IllegalStateException("Disponibilidad insuficiente.");
 }
}