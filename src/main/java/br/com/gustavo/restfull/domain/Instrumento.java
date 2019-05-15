package br.com.gustavo.restfull.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.gustavo.restfull.model.InstrumentoModel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

@Entity
@Table(name="instrumento")
public class Instrumento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name="nome", length = 128)
    private String nome;
	
	@NotNull
	@Column(name="modelo", length = 128)
    private String modelo;
	
	@NotNull
	@Column(name="serie", length = 128)
    private String serie;

	public Instrumento(InstrumentoModel model) {
		this.nome = model.getNome();
		this.modelo = model.getModelo();
		this.serie = model.getSerie();
	}
}
