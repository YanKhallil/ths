package br.com.ths.projeto.repository;


import br.com.ths.projeto.domain.AtendimentoPack.Atendimento_Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<Atendimento_Cliente, Long> {
}
