package bookip.demo.controllers;

//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
  }


   