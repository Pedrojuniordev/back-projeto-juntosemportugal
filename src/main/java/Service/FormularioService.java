package Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.FormularioRepository;
import backapp.com.projeto.entity.formulario;
import lombok.Builder;


@Service
@Builder
public class FormularioService {

    private final FormularioRepository formularioRepository;

    @Autowired
    public FormularioService(FormularioRepository formularioRepository) {
        this.formularioRepository = formularioRepository;
    }

    public formulario criarFormulario(formulario novoFormulario) {
        return formularioRepository.save(novoFormulario);
    }

    public formulario buscarFormularioPorId(Long id) {
        return formularioRepository.findById(id).orElse(null);
    }
}