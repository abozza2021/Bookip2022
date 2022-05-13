package bookip.demo;


public class administradores {
    boolean nivelacceso = true ;


    public void puedealtaregistro(){

    }
    public void puedebajaregistro(){

    }

    public void puedemodificarregistro(){

    }

    public void puedeconsultarregistro(){
    
    
    }

    public void puedelistarregistro(){
    // a completar en el sql:
    // use bookip ;
    // select * from registros ;
    // quit ;
    }

    public void puedealtausuario(){
    // a pasar por el sql:
    // use bookip ;
    // insert into registros (Numerocliente, NombreCliente, MacCpe, DireccionIP) values ($nrocli, $nombrecli, 
    // $maccpe, $dirip) where not exists ( select DireccionIP from registros where DireccionIP = $DireccionIP )
    // LIMIT 1 ;
    // quit ;

    }

    public void puedebajausuario(){

    }

    public void puedemodificarususario(){

    }

}

