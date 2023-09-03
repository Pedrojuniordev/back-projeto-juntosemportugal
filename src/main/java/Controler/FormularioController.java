package Controler;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Service.FormularioService;
import backapp.com.projeto.entity.formulario;


@RestController
@RequestMapping("/formulario")
public class FormularioController {

    private final FormularioService formularioService;

    @Autowired
    public FormularioController(FormularioService formularioService) {
        this.formularioService = formularioService;
    }

    @PostMapping
    
    public formulario criarFormulario(@RequestBody formulario novoFormulario) {
        return formularioService.criarFormulario(novoFormulario);
    }

    @GetMapping("/{id}")
    public formulario buscarFormularioPorId(@PathVariable Long id) {
        return formularioService.buscarFormularioPorId(id);
    }

}