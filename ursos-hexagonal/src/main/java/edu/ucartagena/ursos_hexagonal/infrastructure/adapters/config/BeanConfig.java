package edu.ucartagena.ursos_hexagonal.infrastructure.adapters.config;

import edu.ucartagena.ursos_hexagonal.application.CursoService;
import edu.ucartagena.ursos_hexagonal.domain.port.CursoRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public CursoService cursoService(CursoRepositoryPort cursoRepositoryPort) {
        return new CursoService(cursoRepositoryPort);
    }
}
