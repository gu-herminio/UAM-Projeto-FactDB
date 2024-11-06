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
}
