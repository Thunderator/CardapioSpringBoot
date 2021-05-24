package br.edu.usj.ads.pw.iPhome;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CardapioController {

    @Autowired
    CardapioRepository cardapioRepository;

    @GetMapping(value = "/")
    public ModelAndView getIndex() {
        // criar um objeto lista
        List<Cardapio> lista = new ArrayList<>();

        // preencher esta lista com os dados do banco
        lista = cardapioRepository.findAll();

        // instanciar um template
        ModelAndView modelAndView = new ModelAndView("index");

        // preencher o template com a lista
        modelAndView.addObject("lista", lista);

        // retornar o template
        return modelAndView;
    }

    @GetMapping(value = "/cadastro")
    public ModelAndView getCadastro() {
        Cardapio cardapio = new Cardapio();

        ModelAndView modelAndView = new ModelAndView("cadastro");

        modelAndView.addObject("cardapio", cardapio);

        return modelAndView;
    }

    @PostMapping(value = "/adicionar")
    public String postAdicionar(Cardapio cardapio) {
        cardapioRepository.save(cardapio);
        return "redirect:/";
    }

    @GetMapping(value="/editar/{id}")
    public ModelAndView getEditar(@PathVariable Long id) {
        // selecionar contato do banco pelo id
        Cardapio cardapio = new Cardapio();
        cardapio = cardapioRepository.findById(id).get();

        // instanciar o template
        ModelAndView modelAndView = new ModelAndView("cadastro");

        // popular o template
        modelAndView.addObject("cardapio", cardapio);

        // retornar o template
        return modelAndView;
    }

    @GetMapping(value = "/deletar/{id}")
    public String getDeletar(@PathVariable Long id) {
        // deletar o objeto com o id passado pelo parametro
        cardapioRepository.deleteById(id);

        // retornar para / (raiz)
        return "redirect:/";
    }

}