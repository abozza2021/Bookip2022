package bookip.demo.Repository;
import java.util.List ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import bookip.demo.models.usuarios;

public interface Login extends JpaRepository<usuarios, Long> {
    @Query (value = "SELECT * FROM usuarios WHERE nombreusuario like :username AND password like :password", nativeQuery = true)
    List<usuarios> login(@Param("username") String username , @Param("password") String password);
}