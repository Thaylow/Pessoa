package ba.gov.br.projetoPessoa.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_PESSOA")
@SequenceGenerator(name = "PESSOA_SEQ", sequenceName = "PESSOA_SEQ", allocationSize = 1)
public class PessoaModel {
	
	@Id
	@Column(name="ID_PESSOA")
	@JsonInclude(value=Include.NON_NULL)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PESSOA_SEQ")
	private Long id;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="IDENTIFICADOR")
	private String identificador;
	
	@Column(name="TIPO_IDENTIFICADOR")
	private Integer tipoIdentificador;
	
	
}
