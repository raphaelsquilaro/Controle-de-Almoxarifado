package sp.senai.org.controle_de_almoxarifado.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sp.senai.org.controle_de_almoxarifado.model.TagRFID;
import sp.senai.org.controle_de_almoxarifado.repository.ProdutoRepository;

public class TagController {
    @GetMapping("/tag/cadastro")
    public String cadastro(Model model){

        model.addAttribute("tagRFID", new TagRFID());
        model.addAttribute("produtos", ProdutoRepository.findAll());

        return "tag/cadastro";
    }
}
