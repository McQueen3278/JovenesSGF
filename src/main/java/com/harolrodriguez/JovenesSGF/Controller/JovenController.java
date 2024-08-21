package com.harolrodriguez.JovenesSGF.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harolrodriguez.JovenesSGF.Bean.Joven;
import com.harolrodriguez.JovenesSGF.Service.IJovenService;

@RestController
//http://localhost:8085/joven/

@RequestMapping("joven")
@CrossOrigin(value = "http://localhost:3000")

public class JovenController {

    private static final Logger logger = LoggerFactory.getLogger(JovenController.class);

    @Autowired
    private IJovenService jovenService;

    //http://localhost:8085/joven/jovenes
    @GetMapping("/jovenes")
    public List<Joven> obtenerJovenes(){
        var jovenes = jovenService.listarJovenes();
        jovenes.forEach(joven -> logger.info(joven.toString()));

        return  jovenes;

    }

    //http://localhost:8085/joven/jovenesA
    @PostMapping("/jovenesA")
    public Joven agregarJoven (@RequestBody Joven joven){
        logger.info("Agregar Joven" + joven);

        return jovenService.guardarJoven(joven);
    }
}
