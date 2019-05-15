package br.com.gustavo.restfull.service;

import java.util.List;

import br.com.gustavo.restfull.domain.Instrumento;
import br.com.gustavo.restfull.model.InstrumentoModel;

public interface InstrumentoService {

	Instrumento consultar(Long id);
	Instrumento cadastrar (InstrumentoModel model);
	List<Instrumento> mostrarTudo();
	Instrumento remover(Long id);
}
