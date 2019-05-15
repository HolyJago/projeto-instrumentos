package br.com.gustavo.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gustavo.restfull.domain.Instrumento;

@Repository
public interface InstrumentoRepository extends JpaRepository<Instrumento, Long> {

}
