package bookip.demo.Repository ;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import bookip.demo.models.usuarios;


@Repository
public interface Usuarios extends JpaRepository<usuarios, Integer> {
    @Query (value = "SELECT * FROM usuarios WHERE nombreusuario like :username AND password like :password", nativeQuery = true)
    List<usuarios> login(@Param("username") String username , @Param("password") String password);
}