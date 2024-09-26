package br.com.ths.projeto.repository;

import br.com.ths.projeto.domain.SACPack.SAC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SACRepository extends JpaRepository<SAC, Long> {
}
