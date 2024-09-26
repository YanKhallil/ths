package br.com.ths.projeto.repository;

import br.com.ths.projeto.domain.SolicitaPack.Solicita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitaRepository extends JpaRepository<Solicita, Long> {
}
