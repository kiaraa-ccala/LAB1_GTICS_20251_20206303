package com.example.l1_20206303.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ordenar")
public class controlador {

    @GetMapping("/formulario")
    public String formulario(Model model) {

        return "formulario"
    }

    @PostMapping("/guardar")
    public String guardar(@RequestParam("nombre") String nombreCliente,
                          @RequestParam("numeroMesa") String nombreMesa,
                          Model model){

    }
}



