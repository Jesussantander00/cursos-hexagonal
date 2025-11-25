package edu.ucartagena.ursos_hexagonal.infrastructure.adapters.rest;

import edu.ucartagena.ursos_hexagonal.application.CursoService;
import edu.ucartagena.ursos_hexagonal.domain.model.Curso;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping
    public Curso crear(@RequestBody Curso curso) {
        return cursoService.crearCurso(curso);
    }

    @GetMapping
    public List<Curso> listar() {
        return cursoService.listarCursos();
    }

    @GetMapping("/{id}")
    public Curso obtener(@PathVariable Long id) {
        return cursoService.obtenerCurso(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        cursoService.eliminarCurso(id);
    }
}
