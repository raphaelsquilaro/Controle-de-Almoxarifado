package sp.senai.org.controle_de_almoxarifado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sp.senai.org.controle_de_almoxarifado.model.Produto;
import sp.senai.org.controle_de_almoxarifado.model.enums.StatusProduto;
import sp.senai.org.controle_de_almoxarifado.repository.ProdutoRepository;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping("/form-cadastro")
    public String cadastro(Model model){

        model.addAttribute("produto", new Produto());
        model.addAttribute("statusProduto", StatusProduto.values());

        return "produto/cadastro_produto";
    }

    @PostMapping("/salvar")
    public String salvar(Produto produto) {
        produtoRepository.save(produto);
        return "redirect:/";
    }
}