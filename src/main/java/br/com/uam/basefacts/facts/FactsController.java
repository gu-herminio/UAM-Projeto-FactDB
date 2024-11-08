package br.com.uam.basefacts.facts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="ap1/v1/facts")

public class FactsController {

    private final FactsService factsService;

    @Autowired
    public FactsController(FactsService factsService) {
        this.factsService = factsService;
    }

    @GetMapping
    public List<Facts> getFacts() {
        return factsService.getFacts();
    }

    /*
    Mano, pra puxar esse caba, tu tem que iniciar o seu postgres no usuário postgres e com a senha que tu colocou.
    Depois, tu tem que criar um banco de dados chamado "facts" e um usuário chamado "facts" com a senha "facts".
    da pra fazer, por terminal. Se tu tiver instalado certinho o postgres e o bin dele estiver nas variáveis de ambiente,
    dá um:

    $> psql -U postgres
    $> \c facts

    Isso vai te conectar ao banco de dados "facts" com o usuário "postgres".:
     */

    // Se não der certo, dá um salve no zap que a gente tenta fazer essa bagaça ai funcionar no teu pc tbm.

}
