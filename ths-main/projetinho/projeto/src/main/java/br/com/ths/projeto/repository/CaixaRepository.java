package br.com.ths.projeto.repository;

import br.com.ths.projeto.domain.CaixaPack.Caixa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaixaRepository extends JpaRepository<Caixa, Long> {
}
