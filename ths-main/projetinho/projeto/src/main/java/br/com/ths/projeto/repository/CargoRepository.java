package br.com.ths.projeto.repository;

import br.com.ths.projeto.domain.CargoPack.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
