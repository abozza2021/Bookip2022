package bookip.demo.Repository;
import java.util.List ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import bookip.demo.models.registros;

public interface Busquedapornrocli extends JpaRepository<registros, Long> {
    @Query (value = "SELECT * FROM registros WHERE NumeroCliente like :numeroabuscar", nativeQuery = true)
List<registros> buscarpornumerocliente(@Param("numeroabuscar") String numeroabuscar);
}