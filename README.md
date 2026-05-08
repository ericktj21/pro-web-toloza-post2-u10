# U10 Post 2 - Pruebas E2E con Selenium, Postman y Newman

## Requisitos
- Java 17
- Maven 3.9+
- Google Chrome (estable)
- Postman Desktop o Postman Web
- Node.js 18+ (newman)

## Estructura
- src/test/java/com/proweb/tareas/e2e: Page Objects y tests Selenium
- src/main/resources/static: vistas HTML basicas
- postman/: coleccion y entornos
- .github/workflows/api-tests.yml: pipeline con Newman
- img/: capturas de evidencia

## Ejecutar Selenium
```bash
mvn -Dtest=TareasE2ETest test
```

## Ejecutar Newman
```bash
newman run postman/ColeccionToDo.json --environment postman/env-local.json
```

## Evidencias (colocar en img/)
- img/checkpoint1.png (tests Selenium en verde)
- img/checkpoint2.png (Postman Runner 0 failures)
- img/checkpoint3.png (GitHub Actions passing)
