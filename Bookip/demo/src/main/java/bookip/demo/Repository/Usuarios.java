package bookip.demo.Repository ;



import org.springframework.data.jpa.repository.JpaRepository;


import bookip.demo.models.usuarios;



public interface Usuarios extends JpaRepository<usuarios, Long> {
    
}