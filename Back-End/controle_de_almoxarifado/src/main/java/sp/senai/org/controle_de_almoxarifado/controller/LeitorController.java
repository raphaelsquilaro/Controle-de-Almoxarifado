package sp.senai.org.controle_de_almoxarifado.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sp.senai.org.controle_de_almoxarifado.model.LeitorRFID;

public class LeitorController {
    @GetMapping("/leitor/cadastro")
    public String cadastro(Model model){

        model.addAttribute("leitor", new LeitorRFID());

        return "leitor/cadastro";
    }
}
