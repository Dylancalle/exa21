package com.example.example1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/identity")
public class IdentityController {

    @Autowired
    private IdentityService identityService;

    // Endpoint para verificar si el CI existe
    @GetMapping("/verify/{ci}")
    public boolean verificarExistencia(@PathVariable String ci) {
        return identityService.existeCI(ci);
    }
}
