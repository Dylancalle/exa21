package com.example.example1;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IdentityService {

    // Lista en memoria para almacenar CIs de prueba
    private List<String> cis = new ArrayList<>();

    // Constructor con algunos CI predefinidos
    public IdentityService() {
        cis.add("1234567890");
        cis.add("0987654321");
    }

    // Verificar si un CI existe en la lista
    public boolean existeCI(String ci) {
        return cis.contains(ci);
    }
}
