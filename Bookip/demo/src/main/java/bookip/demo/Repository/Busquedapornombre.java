package bookip.demo.Repository;
import java.util.List ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import bookip.demo.models.registros;

public interface Busquedapornombre extends JpaRepository<registros, Long> {
@Query (value = "SELECT * FROM registros WHERE NombreCliente like :nombreabuscar", nativeQuery = true)
List<registros> buscarpornombre(@Param("nombreabuscar") String nombreabuscar); 

}
  


