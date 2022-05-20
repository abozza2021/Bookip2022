package bookip.demo.Repository ;

import org.springframework.data.repository.CrudRepository;
import bookip.demo.models.usuarios;



public interface Usuarios extends CrudRepository<usuarios, Integer> {

}