package bookip.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class usuarios {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private int id ;
    private String nombreusuario ;
    private String password ;
    
    private boolean nivelacceso ;
    public int getId() {
        return id;
    }
    
    public String getNombreusuario() {
        return nombreusuario;
    }
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isNivelacceso() {
        return nivelacceso;
    }
    public void setNivelacceso(boolean nivelacceso) {
        this.nivelacceso = nivelacceso;
    }

}


