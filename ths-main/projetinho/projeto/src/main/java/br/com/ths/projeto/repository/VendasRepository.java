package br.com.ths.projeto.repository;

import br.com.ths.projeto.domain.VendasPack.Vendas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendasRepository extends JpaRepository<Vendas, Long> {
}
