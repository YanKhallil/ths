package br.com.ths.projeto.repository;

import br.com.ths.projeto.domain.Venda_PPack.Venda_Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendasProdutosRepository extends JpaRepository<Venda_Produto, Long> {
}
