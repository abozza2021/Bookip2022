package bookip.demo;



public class basededatos {
  int id ;
  int numerocliente ;
  String nombrecliente ;
  String maccpe ;
  String direccionip ;
  String nombreusuario ;
  String password ;
  String nivelacceso ;   


  public void altaregistro()  {   
    /*Codigo de como agregar en mysql, debe tomar del frontend las variables $nrocli $nombrecli
    $maccpe $dirip 
    insert into registros (Numerocliente, NombreCliente, MacCpe, DireccionIP) values 
    ($nrocli, $nombrecli, $maccpe, $dirip) ; 
    */
    }

public static void bajaregistro(){
/*Debe pedir el id del registro a eliminar
delete from registros where ID = $id ;
}

public void modificaregistro(){
/*Debera pedir un campo del registro para saber cual se quiere modificar. Calculo que el ID sería lo ideal.
update registros set NumeroCliente = $nrocli , NombreCliente = $nombrecli , MacCpe = $maccpe , DireccionIP = 
$dirip where ID = $id ; 
*/
}

public static void consultaregistro(){
/*Codigo en sql para la consulta del apellido Bozz:
select * from registros where registros.NombreCliente  like 'Bozz%' ;
Se debe tomar una variable para realizar la busqueda de acuerdo al campo ingresado, en el caso de lo de arriba
sería:
select * from registros where registros.NombreCliente  like $nombrecli ;
Java debe pasar a mysql la variable cerrada en '' y con el % al final.
*/
}



}