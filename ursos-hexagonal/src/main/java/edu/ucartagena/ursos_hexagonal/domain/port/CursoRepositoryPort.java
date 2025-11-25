package edu.ucartagena.ursos_hexagonal.domain.port;

import edu.ucartagena.ursos_hexagonal.domain.model.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoRepositoryPort {

    Curso save(Curso curso);

    Optional<Curso> findById(Long id);

    List<Curso> findAll();

    void deleteById(Long id);
}
