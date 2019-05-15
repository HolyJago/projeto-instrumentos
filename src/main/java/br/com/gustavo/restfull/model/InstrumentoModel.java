package br.com.gustavo.restfull.model;

import br.com.gustavo.restfull.domain.Instrumento;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class InstrumentoModel {

	private Long id;
    private String nome;
    private String modelo;
    private String serie;
    
    public InstrumentoModel(Instrumento domain) {
    	this.id = domain.getId();
    	this.nome = domain.getNome();
    	this.modelo = domain.getModelo();
		this.serie = domain.getSerie();
    }
}
