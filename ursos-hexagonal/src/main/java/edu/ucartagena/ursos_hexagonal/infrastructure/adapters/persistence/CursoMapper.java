package edu.ucartagena.ursos_hexagonal.infrastructure.adapters.persistence;

import edu.ucartagena.ursos_hexagonal.domain.model.Curso;

public class CursoMapper {

    public static CursoEntity toEntity(Curso curso) {
        if (curso == null) return null;

        CursoEntity entity = new CursoEntity();
        entity.setId(curso.getId());
        entity.setNombre(curso.getNombre());
        entity.setPrecio(curso.getPrecio());
        entity.setHoras(curso.getHoras());
        entity.setNivel(curso.getNivel());
        entity.setProfesor(curso.getProfesor());
        entity.setInstitucion(curso.getInstitucion());
        entity.setFechaInscripcionInicio(curso.getFechaInscripcionInicio());
        entity.setFechaInscripcionFin(curso.getFechaInscripcionFin());
        entity.setFechaInicio(curso.getFechaInicio());
        entity.setFechaCierre(curso.getFechaCierre());
        entity.setNumAlumnos(curso.getNumAlumnos());
        entity.setModalidad(curso.getModalidad());
        entity.setDescripcion(curso.getDescripcion());
        return entity;
    }

    public static Curso toModel(CursoEntity entity) {
        if (entity == null) return null;

        return new Curso(
                entity.getId(),
                entity.getNombre(),
                entity.getPrecio(),
                entity.getHoras(),
                entity.getNivel(),
                entity.getProfesor(),
                entity.getInstitucion(),
                entity.getFechaInscripcionInicio(),
                entity.getFechaInscripcionFin(),
                entity.getFechaInicio(),
                entity.getFechaCierre(),
                entity.getNumAlumnos(),
                entity.getModalidad(),
                entity.getDescripcion()
        );
    }
}
