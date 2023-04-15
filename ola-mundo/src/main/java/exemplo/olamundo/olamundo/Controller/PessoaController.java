package exemplo.olamundo.olamundo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import exemplo.olamundo.olamundo.Model.Pessoa;
import exemplo.olamundo.olamundo.Repository.PessoaRepository;

@RestController
public class PessoaController {

    @PostMapping(value = "/pessoas")
    public Pessoa criarNovaPessoa(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);

   
    }
    
    @GetMapping(value = "/pessoa/{id}")
    public Optional<Pessoa> obterPessoaPeloId(@PathVariable(value = "id") int id){
        return pessoaRepository.findById(id);


        
    }

    @Autowired
    private PessoaRepository pessoaRepository;
}
