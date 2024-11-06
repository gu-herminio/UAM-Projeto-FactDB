package br.com.uam.basefacts.facts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FactsRepository extends JpaRepository<Facts, Long> {


}
