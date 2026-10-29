# Plan de pruebas inicial
| Caso | Entrada | Resultado esperado | Tipo |
|---|---|---|---|
| CP-01 | Solicitar 2 unidades con stock 5 | Acepta | Unitario |
| CP-02 | Solicitar 6 unidades con stock 5 | Rechaza por falta de stock | Unitario |
| CP-03 | Solicitar cantidad 0 | Rechaza cantidad inválida | Unitario |
| CP-04 | GET /api/estado | Devuelve JSON de estado | Integración |
| CP-05 | Dos reservas concurrentes sobre la última unidad | Solo una se confirma | Concurrencia, pendiente |

Ejecuta `mvn test` dentro de `backend` y adjunta evidencia real. No afirmes que las pruebas fueron aprobadas hasta ejecutarlas.
