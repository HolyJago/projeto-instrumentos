package br.com.gustavo.restfull.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavo.restfull.model.InstrumentoModel;
import br.com.gustavo.restfull.service.InstrumentoService;

@RestController
@RequestMapping("/instrumento")
public class InstrumentoController {
	
	@Autowired
	private InstrumentoService instrumentoService;
	
	 @PostMapping("/cadastrar")
	    public InstrumentoModel cadastrar(@Valid @RequestBody InstrumentoModel model, BindingResult bindingResult) {
	    	
	    	if (!bindingResult.hasErrors()) {
	    		return new InstrumentoModel(instrumentoService.cadastrar(model));
	    	}
	    	throw new RuntimeException("Model com erros!");
	    }

	 @GetMapping("/mostrar-tudo")
	 public List<InstrumentoModel> mostrarTudo() {
	        return instrumentoService.mostrarTudo().stream().map(InstrumentoModel::new).collect(Collectors.toList());
	    }
	 
	 @DeleteMapping("/remover")
	 public InstrumentoModel remover(@RequestParam Long id) {
		 return new InstrumentoModel(instrumentoService.remover(id));
	 }
}
