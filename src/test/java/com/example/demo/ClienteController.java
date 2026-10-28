package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    // RF4: Consultar todos los clientes
    @GetMapping
    public String listarClientes() {
        return "Lista de clientes de la agencia";
    }

    // RF4: Consultar un cliente por su teléfono (dato único)
    @GetMapping("/{telefono}")
    public String consultarCliente(@PathVariable String telefono) {
        return "Consultando el cliente con teléfono: " + telefono;
    }

    // RF6: Buscar clientes por nombre
    @GetMapping("/buscar")
    public String buscarCliente(@RequestParam String nombre) {
        return "Buscando clientes con el nombre: " + nombre;
    }

    // RF4: Registrar un cliente
    @PostMapping
    public String registrarCliente() {
        return "Cliente registrado";
    }

    // RF4: Editar un cliente
    @PutMapping("/{telefono}")
    public String editarCliente(@PathVariable String telefono) {
        return "Cliente con teléfono " + telefono + " actualizado";
    }
}