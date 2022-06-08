package bookip.demo.controllers;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import bookip.demo.Services.*;
import bookip.demo.models.*;


@RestController

public class principal {

@Autowired
    
    
private RegistrosServices RegistrosRepo;
 @GetMapping(path="listarregistros")
 public List<registros> mostrarregistros(){
  return RegistrosRepo.findAll();
 }
 
 
@Autowired    
private UsuariosServices UsuariosRepo;
  @GetMapping(path="listarusuarios")
  public Iterable<usuarios> mostrarusuarios() {
  return UsuariosRepo.findAll();

 }

@Autowired
private RegistrosServices Registrosadd;
  @PostMapping(path="/agregarregistro") 
  public String addNewRegistro (@RequestParam int numerocliente , 
  @RequestParam String nombrecliente , @RequestParam String maccpe , @RequestParam String direccionip) {
  
 registros agregar = new registros();
 agregar.setdireccionip(direccionip);
 agregar.setmaccpe(maccpe);
 agregar.setnombrecliente(nombrecliente);
 agregar.setnumerocliente(numerocliente);
 
 
 
 Registrosadd.save(agregar);
 return "Registro guardado exitosamente";
  }

@Autowired
private UsuariosServices Usuariosadd;
 @PostMapping(path="/agregarusuario") 
 public String addNewUser (@RequestParam boolean nivelacceso , 
 @RequestParam String nombreusuario , @RequestParam String password) {
   
 usuarios agregar = new usuarios();
 agregar.setNombreusuario(nombreusuario);
 agregar.setPassword(password);
 agregar.setNivelacceso(nivelacceso);
 Usuariosadd.save(agregar);
 return "Usuario guardado exitosamente";
  }
  
@Autowired
private RegistrosServices BuscarNombreCliente ;
 @PostMapping(path="buscarpornombre")
 public List<registros> buscarpornombre(@RequestParam String nombreabuscartemp) 
 {
 String nombreabuscar = "%"+nombreabuscartemp+"%";
 return BuscarNombreCliente.buscarpornombre(nombreabuscar) ; 
 }

   
@Autowired
 private RegistrosServices BuscarNumeroCliente ;
 @PostMapping(path="buscarpornumerocli")
 public List<registros> buscarpornumerocliente(@RequestParam String numeroabuscartemp) 
 {
  String numeroabuscar = "%"+numeroabuscartemp+"%";
  return BuscarNumeroCliente.buscarpornumerocliente(numeroabuscar) ;
  }
      
@Autowired
private RegistrosServices BuscarIP ;
  @PostMapping(path="buscarporip")
  public List<registros> buscarporip(@RequestParam String ipabuscartemp) 
  {
  String ipabuscar = "%"+ipabuscartemp+"%";
  return BuscarIP.buscarporip(ipabuscar) ;         }
   
@Autowired   
private RegistrosServices BuscarMAC ;
  @PostMapping(path="/buscarpormac")
  public List<registros> buscarpormac(@RequestParam String macabuscartemp) 
  {
  String macabuscar = "%"+macabuscartemp+"%";
  return BuscarMAC.buscarpormac(macabuscar) ;
  }   
    
@Autowired    
private  UsuariosServices login;
  @PostMapping(path="login")
  public List<usuarios> login(@RequestParam String username , String password) 
  {
  return login.login(username,password) ;
  }  

  @Autowired
	private RegistrosServices borrar ;
	@DeleteMapping(path="borrarregistro")
	public ResponseEntity<Long> borrarregistro(@RequestParam Long id) 
	{
		if ( id instanceof Long){
    
		 borrar.borrarregistro(id);
	     return new ResponseEntity<>(HttpStatus.OK);
    }
    else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	} 

	} 

  @Autowired
	private UsuariosServices borraruser ;
	@DeleteMapping(path="borrarusuario")
	public ResponseEntity<Long> borrarusuario(@RequestParam Long id) 
	{
		if ( id instanceof Long){
    
    borraruser.borrarusuario(id);
	     return new ResponseEntity<>(HttpStatus.OK);
    }
    else {
     
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	} 
}

@Autowired
	private RegistrosServices modificarregistro ;
	@PostMapping(path="modificarregistro")
	public ResponseEntity<Long> modificarregistroo(@RequestParam Long id, int numerocliente, String nombrecliente, String maccpe, String direccionip) 
	{
		if ( id instanceof Long){
    
    modificarregistro.modificarregistro(id,numerocliente,nombrecliente,maccpe,direccionip);
	     return new ResponseEntity<>(HttpStatus.OK);
    }
    else {
     
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	} 
}

@Autowired
	private UsuariosServices modificarusuario ;
	@PostMapping(path="modificarusuario")
	public ResponseEntity<Long> modificarusuario(@RequestParam Long id, boolean nivelacceso, String nombreusuario, String password) 
	{
		if ( id instanceof Long){
    
    modificarusuario.modificarusuario(id,nivelacceso,nombreusuario,password);
	     return new ResponseEntity<>(HttpStatus.OK);
    }
    else {
     
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	} 
}
}
