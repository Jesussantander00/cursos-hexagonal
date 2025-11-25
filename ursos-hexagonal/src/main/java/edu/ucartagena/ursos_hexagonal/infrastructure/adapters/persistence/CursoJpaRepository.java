package edu.ucartagena.ursos_hexagonal.infrastructure.adapters.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoJpaRepository extends JpaRepository<CursoEntity, Long> {
}
