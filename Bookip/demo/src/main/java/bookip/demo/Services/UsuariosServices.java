package bookip.demo.Services;

import java.util.List;

//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import bookip.demo.Repository.Usuarios;
import bookip.demo.models.usuarios;

@Service
public interface UsuariosServices extends Usuarios {
    @Query (value = "SELECT * FROM usuarios WHERE nombreusuario like :username AND password like :password", nativeQuery = true)
    List<usuarios> login(@Param("username") String username , @Param("password") String password);
}