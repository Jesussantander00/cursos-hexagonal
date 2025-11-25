package edu.ucartagena.ursos_hexagonal.infrastructure.adapters.persistence;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cursos")
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;
    private Integer horas;
    private String nivel;
    private String profesor;
    private String institucion;

    private LocalDate fechaInscripcionInicio;
    private LocalDate fechaInscripcionFin;
    private LocalDate fechaInicio;
    private LocalDate fechaCierre;

    private Integer numAlumnos;
    private String modalidad;

    @Column(length = 500)
    private String descripcion;

    public CursoEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public LocalDate getFechaInscripcionInicio() {
        return fechaInscripcionInicio;
    }

    public void setFechaInscripcionInicio(LocalDate fechaInscripcionInicio) {
        this.fechaInscripcionInicio = fechaInscripcionInicio;
    }

    public LocalDate getFechaInscripcionFin() {
        return fechaInscripcionFin;
    }

    public void setFechaInscripcionFin(LocalDate fechaInscripcionFin) {
        this.fechaInscripcionFin = fechaInscripcionFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Integer getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(Integer numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
