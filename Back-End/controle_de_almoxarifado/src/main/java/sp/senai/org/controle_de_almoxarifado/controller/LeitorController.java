package sp.senai.org.controle_de_almoxarifado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sp.senai.org.controle_de_almoxarifado.model.LeitorRFID;
import sp.senai.org.controle_de_almoxarifado.repository.LeitorRepository;

@Controller
@RequestMapping("/leitor")
public class LeitorController {

    private final LeitorRepository leitorRepository;

    public LeitorController(LeitorRepository leitorRepository) {
        this.leitorRepository = leitorRepository;
    }

    @GetMapping("/form-cadastro")
    public String cadastro(Model model){

        model.addAttribute("leitor", new LeitorRFID());

        return "leitor/cadastro_leitor";
    }

    @PostMapping("/salvar")
    public String salvar(LeitorRFID leitorRFID) {
        leitorRepository.save(leitorRFID);
        return "redirect:/";
    }
}
