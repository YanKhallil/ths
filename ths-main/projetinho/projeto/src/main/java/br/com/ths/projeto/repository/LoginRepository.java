package br.com.ths.projeto.repository;

import br.com.ths.projeto.domain.LoginPack.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {
}
