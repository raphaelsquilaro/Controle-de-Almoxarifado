package sp.senai.org.controle_de_almoxarifado.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sp.senai.org.controle_de_almoxarifado.model.Produto;
import sp.senai.org.controle_de_almoxarifado.model.enums.StatusProduto;

public class ProdutoController {
    @GetMapping("/produto/cadastro")
    public String cadastro(Model model){

        model.addAttribute("produto", new Produto());
        model.addAttribute("statusProduto", StatusProduto.values());

        return "produto/cadastro";
    }
}
