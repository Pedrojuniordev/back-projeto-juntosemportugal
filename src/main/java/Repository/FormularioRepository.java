package Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import backapp.com.projeto.entity.formulario;

public interface FormularioRepository extends JpaRepository<formulario, Long> {
   
}