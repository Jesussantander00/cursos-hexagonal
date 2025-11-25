# 📚 API de Gestión de Cursos – Arquitectura Hexagonal  
Proyecto desarrollado para el curso de **Base de Datos 2** – Universidad de Cartagena.  
Implementado en **Spring Boot**, aplicando **Arquitectura Hexagonal (Ports & Adapters)**  
y persistencia en **MySQL**.

---

## 🚀 Tecnologías Usadas

- **Java 21**
- **Spring Boot 4**
- **Spring Web**
- **Spring Data JPA**
- **MySQL 8**
- **Gradle**
- **Arquitectura Hexagonal**
- **PowerShell / cURL** para pruebas

---

## 📁 Estructura del Proyecto (Arquitectura Hexagonal)

src/main/java/edu/ucartagena/ursos_hexagonal/
│
├── application/ → Lógica de aplicación (Servicios)
│ └── CursoService.java
│
├── domain/ → Núcleo del dominio (Reglas y modelos)
│ ├── model/
│ │ └── Curso.java
│ └── port/
│ └── CursoRepositoryPort.java
│
├── infrastructure/ → Adaptadores de entrada y salida
│ ├── adapters/
│ │ ├── rest/ → Controladores REST
│ │ │ └── CursoController.java
│ │ ├── persistence/ → Adaptadores JPA hacia la BD
│ │ │ ├── CursoEntity.java
│ │ │ ├── CursoJpaRepository.java
│ │ │ ├── CursoMapper.java
│ │ │ └── CursoRepositoryAdapter.java
│ │ └── config/
│ │ └── BeanConfig.java
│
└── UrsosHexagonalApplication.java


---

## 🗄 Configuración de Base de Datos

### Crear base de datos:

```sql
CREATE DATABASE cursos_hexagonal;

Configuración en application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/cursos_hexagonal?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=America/Bogota
spring.datasource.username=root
spring.datasource.password=TU_PASSWORD
spring.jpa.hibernate.ddl-auto=update
