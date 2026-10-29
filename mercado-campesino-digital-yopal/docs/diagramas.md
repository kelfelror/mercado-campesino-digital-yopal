# Diagramas esquemáticos
## Entidad-relación
USUARIO 1 -- 0..1 PRODUCTOR; VEREDA 1 -- N PRODUCTOR; PRODUCTOR 1 -- N OFERTA; PRODUCTO 1 -- N OFERTA; CLIENTE/USUARIO 1 -- N RESERVA; RESERVA 1 -- N DETALLE_RESERVA; OFERTA 1 -- N DETALLE_RESERVA.

## Casos de uso
Productor: gestionar perfil, publicar oferta, consultar reservas propias.
Cliente: consultar catálogo, reservar, consultar confirmación.
Secretaría: consultar reportes.
Administrador: administrar usuarios.

## Secuencia de reserva
Cliente selecciona oferta -> interfaz envía solicitud -> API valida plazo -> servicio verifica inventario -> guarda reserva y descuenta stock en transacción -> devuelve confirmación. Si falla una validación, rechaza sin confirmar.
