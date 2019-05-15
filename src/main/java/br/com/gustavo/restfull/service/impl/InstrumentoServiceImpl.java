package br.com.gustavo.restfull.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.gustavo.restfull.domain.Instrumento;
import br.com.gustavo.restfull.model.InstrumentoModel;
import br.com.gustavo.restfull.repository.InstrumentoRepository;
import br.com.gustavo.restfull.service.InstrumentoService;

@Transactional
@Service
public class InstrumentoServiceImpl implements InstrumentoService {

	@Autowired
	private InstrumentoRepository instrumentoRepository;
	
	@Override
	public Instrumento consultar(Long id) {
		return instrumentoRepository.findById(id).orElse(null);
	}

	@Override
	public Instrumento cadastrar(InstrumentoModel model) {
		return instrumentoRepository.save(new Instrumento(model));
	}

	@Override
	public List<Instrumento> mostrarTudo() {
		return instrumentoRepository.findAll();
	}

	@Override
	public Instrumento remover(Long id) {
		Instrumento instrumento = this.consultar(id);
		if (Objects.nonNull(instrumento)) {
			instrumentoRepository.delete(instrumento);
		}
		return instrumento;
	}

}
