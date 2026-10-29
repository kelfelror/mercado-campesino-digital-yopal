package co.llanosoft.mercado.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
@RestController
public class EstadoController {
 @GetMapping("/api/estado")
 public Map<String,String> estado() {
  return Map.of("proyecto","Mercado Campesino Digital de Yopal","estado","API inicial en funcionamiento");
 }
}