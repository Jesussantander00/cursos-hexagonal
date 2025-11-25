package edu.ucartagena.ursos_hexagonal.application;

import edu.ucartagena.ursos_hexagonal.domain.model.Curso;
import edu.ucartagena.ursos_hexagonal.domain.port.CursoRepositoryPort;

import java.util.List;

public class CursoService {

    private final CursoRepositoryPort cursoRepositoryPort;

    public CursoService(CursoRepositoryPort cursoRepositoryPort) {
        this.cursoRepositoryPort = cursoRepositoryPort;
    }

    public Curso crearCurso(Curso curso) {
        return cursoRepositoryPort.save(curso);
    }

    public List<Curso> listarCursos() {
        return cursoRepositoryPort.findAll();
    }

    public Curso obtenerCurso(Long id) {
        return cursoRepositoryPort.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
    }

    public void eliminarCurso(Long id) {
        cursoRepositoryPort.deleteById(id);
    }
}
