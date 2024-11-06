package br.com.uam.basefacts.facts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactsService {

    private final FactsRepository factsRepository;

    @Autowired
    public FactsService(FactsRepository factsRepository) {
        this.factsRepository = factsRepository;
    }

    public List<Facts> getFacts() {
        return factsRepository.findAll();
    }
}
