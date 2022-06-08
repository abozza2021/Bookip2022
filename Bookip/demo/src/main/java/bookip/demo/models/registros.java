package bookip.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name ="registros")
public class registros {
    
    @Id
    @GeneratedValue
    
    
    private int id ;
    private int numerocliente ;
    private String nombrecliente ;
    private String maccpe ;
    private String direccionip ;





public int getId() {
    return id;
}

public int getnumerocliente() {
    return numerocliente;
}
public void setnumerocliente(int numerocliente) {
    this.numerocliente = numerocliente;
}
public String getnombrecliente() {
    return nombrecliente;
}
public void setnombrecliente(String nombrecliente) {
    this.nombrecliente = nombrecliente;
}
public String getmaccpe() {
    return maccpe;
}
public void setmaccpe(String maccpe) {
    this.maccpe = maccpe;
}
public String getdireccionip() {
    return direccionip;
}
public void setdireccionip(String direccionip) {
    this.direccionip = direccionip;
}




}
