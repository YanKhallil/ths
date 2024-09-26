package br.com.ths.projeto.repository;

import br.com.ths.projeto.domain.EstoquistaPack.Estoquista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoquistaRepository extends JpaRepository<Estoquista, Long> {
}
