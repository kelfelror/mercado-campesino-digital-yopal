# Mercado Campesino Digital de Yopal

Proyecto académico inicial para publicar ofertas de productores, reservar productos y consultar reportes.

## Tecnologías propuestas
- Java 21, Spring Boot y Maven
- HTML, CSS y JavaScript
- PostgreSQL (esquema de referencia en `database/schema.sql`)
- JUnit 5

## Estructura
- `backend/`: API y pruebas
- `frontend/`: prototipo web con datos ficticios
- `database/`: esquema SQL
- `docs/`: requisitos, arquitectura, diagramas y plan de pruebas

## Ejecutar backend
Requisitos: Java 21 y Maven. En la carpeta `backend`:
```bash
mvn spring-boot:run
```
Pruebas:
```bash
mvn test
```
API de estado: `http://localhost:8080/api/estado`

El frontend es solo un prototipo y aún no está conectado al backend. La reserva real, autenticación, persistencia y transacciones deben completarse y probarse antes de producción.

## Ramas
- `main`: versión estable
- `develop`: integración
- `feature/RF-03-ofertas`: publicación de ofertas
- `feature/RF-05-reservas`: reservas
- `feature/RF-10-reportes`: reportes

## Integrantes
- Integrante 1: [Nombre]
- Integrante 2: [Nombre]
- Integrante 3: [Nombre]
