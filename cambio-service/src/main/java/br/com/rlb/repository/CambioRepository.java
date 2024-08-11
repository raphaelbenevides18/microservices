package br.com.rlb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rlb.entity.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{

	Cambio findByFromAndTo(String from, String to);
	
}
