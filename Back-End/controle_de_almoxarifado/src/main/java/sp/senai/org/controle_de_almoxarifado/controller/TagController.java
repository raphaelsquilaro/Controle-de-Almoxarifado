package sp.senai.org.controle_de_almoxarifado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sp.senai.org.controle_de_almoxarifado.model.TagRFID;
import sp.senai.org.controle_de_almoxarifado.repository.ProdutoRepository;
import sp.senai.org.controle_de_almoxarifado.repository.TagRepository;

@Controller
@RequestMapping("/tag")
public class TagController {

    private final ProdutoRepository produtoRepository;
    private final TagRepository tagRepository;

    public TagController(ProdutoRepository produtoRepository, TagRepository tagRepository) {
        this.produtoRepository = produtoRepository;
        this.tagRepository = tagRepository;
    }

    @GetMapping("/form-cadastro")
    public String cadastro(Model model){

        model.addAttribute("tagRFID", new TagRFID());
        model.addAttribute("produtos", produtoRepository.findAll());

        return "tag/cadastro_tag";
    }

    @PostMapping("/salvar")
    public String salvar(TagRFID tagRFID) {
        tagRepository.save(tagRFID);
        return "redirect:/";
    }
}
