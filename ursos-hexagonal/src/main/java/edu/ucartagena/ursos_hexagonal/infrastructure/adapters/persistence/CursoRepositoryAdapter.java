package edu.ucartagena.ursos_hexagonal.infrastructure.adapters.persistence;

import edu.ucartagena.ursos_hexagonal.domain.model.Curso;
import edu.ucartagena.ursos_hexagonal.domain.port.CursoRepositoryPort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CursoRepositoryAdapter implements CursoRepositoryPort {

    private final CursoJpaRepository repository;

    public CursoRepositoryAdapter(CursoJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Curso save(Curso curso) {
        CursoEntity entity = CursoMapper.toEntity(curso);
        return CursoMapper.toModel(repository.save(entity));
    }

    @Override
    public Optional<Curso> findById(Long id) {
        return repository.findById(id).map(CursoMapper::toModel);
    }

    @Override
    public List<Curso> findAll() {
        return repository.findAll()
                .stream()
                .map(CursoMapper::toModel)
                .toList();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
