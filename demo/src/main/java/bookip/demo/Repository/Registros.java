package bookip.demo.Repository ;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bookip.demo.models.registros;


@Repository
public interface Registros extends JpaRepository<registros, Integer> {

@Query (value = "SELECT * FROM registros WHERE NombreCliente like :nombreabuscar", nativeQuery = true)
List<registros> buscarpornombre(@Param("nombreabuscar") String nombreabuscar); 

@Query (value = "SELECT * FROM registros WHERE NumeroCliente like :numeroabuscar", nativeQuery = true)
List<registros> buscarpornumerocliente(@Param("numeroabuscar") String numeroabuscar);

@Query (value = "SELECT * FROM registros WHERE MacCpe like :macabuscar", nativeQuery = true)
List<registros> buscarpormac(@Param("macabuscar") String macabuscar); 

@Query (value = "SELECT * FROM registros WHERE DireccionIP like :ipabuscar", nativeQuery = true)
List<registros> buscarporip(@Param("ipabuscar") String ipabuscar) ;

@Transactional
@Modifying
@Query (value = "UPDATE FROM registros WHERE ID = :id set NombreCliente = 'PEpito'", nativeQuery = true)
List<registros> borrarregistro(@Param("id") String id);

}
