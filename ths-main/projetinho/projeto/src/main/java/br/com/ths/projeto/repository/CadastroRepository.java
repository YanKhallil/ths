package br.com.ths.projeto.repository;

import br.com.ths.projeto.domain.CadastroPack.Cadastro_Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Cadastro_Produtos, Long> {
}
