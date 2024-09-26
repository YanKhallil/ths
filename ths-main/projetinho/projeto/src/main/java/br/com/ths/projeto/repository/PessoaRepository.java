package br.com.ths.projeto.repository;

import br.com.ths.projeto.domain.PessoaPack.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
