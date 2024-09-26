package br.com.ths.projeto.repository;

import br.com.ths.projeto.domain.DPPack.Departamento_Pessoal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoPessoalRepository extends JpaRepository<Departamento_Pessoal, Long> {
}