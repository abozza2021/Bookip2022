package bookip.demo.controllers;




import java.util.List;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import bookip.demo.Repository.*;
import bookip.demo.models.*;


@RestController

public class principal {


    
    @Autowired
    private Registros RegistrosRepo;
    @GetMapping(path="listarregistros")
    public @ResponseBody Iterable<registros> mostrarregistros() {
      return RegistrosRepo.findAll();
    }
      @Autowired  
      private Usuarios UsuariosRepo;
      @GetMapping(path="listarusuarios")
      public @ResponseBody Iterable<usuarios> mostrarusuarios() {
        return UsuariosRepo.findAll();

    }
    
    @Autowired
    private Registros Registrosadd;
    @PostMapping(path="/agregarregistro") 
    public @ResponseBody String addNewRegistro (@RequestParam int numerocliente , 
    @RequestParam String nombrecliente , @RequestParam String maccpe , @RequestParam String direccionip) {
   
    registros agregar = new registros();
    agregar.setnumerocliente(numerocliente);
    agregar.setnombrecliente(nombrecliente);
    agregar.setmaccpe(maccpe);
    agregar.setdireccionip(direccionip);
    Registrosadd.save(agregar);
    return "Registro guardado exitosamente";
  }

  @Autowired
    private Usuarios Usuariosadd;
    @PostMapping(path="/agregarusuario") 
    public @ResponseBody String addNewUser (@RequestParam boolean nivelacceso , 
    @RequestParam String nombreusuario , @RequestParam String password) {
   
    usuarios agregar = new usuarios();
    agregar.setNombreusuario(nombreusuario);
    agregar.setPassword(password);
    agregar.setNivelacceso(nivelacceso);
    Usuariosadd.save(agregar);
    return "Usuario guardado exitosamente";
  }
  
  @Autowired
  private Busqueda BuscarNombreCliente ;
    @PostMapping(path="buscarpornombre")
    public @ResponseBody List<registros> buscarpornombre(@RequestParam String nombreabuscartemp) 
    {
      String nombreabuscar = "%"+nombreabuscartemp+"%";
      return BuscarNombreCliente.buscarpornombre(nombreabuscar) ;
    }
   
    @Autowired
    private Busqueda BuscarNumeroCliente ;
      @PostMapping(path="buscarpornumerocli")
      public @ResponseBody List<registros> buscarpornumerocliente(@RequestParam String numeroabuscartemp) 
      {
        String numeroabuscar = "%"+numeroabuscartemp+"%";
        return BuscarNumeroCliente.buscarpornumerocliente(numeroabuscar) ;
       }
      
       @Autowired
       private Busqueda BuscarIP ;
         @PostMapping(path="buscarporip")
         public @ResponseBody List<registros> buscarporip(@RequestParam String ipabuscartemp) 
         {
           String ipabuscar = "%"+ipabuscartemp+"%";
           return BuscarIP.buscarporip(ipabuscar) ;
           }
   
        @Autowired
           private Busqueda BuscarMAC ;
             @PostMapping(path="buscarpormac")
             public @ResponseBody List<registros> buscarpormac(@RequestParam String macabuscartemp) 
             {
               String macabuscar = "%"+macabuscartemp+"%";
               return BuscarMAC.buscarpormac(macabuscar) ;
               }   
               @Autowired
           private Login login;
             @PostMapping(path="login")
             public @ResponseBody List<usuarios> login(@RequestParam String username , String password) 
             {
               return login.login(username,password) ;
               }  
       
      }

  
   