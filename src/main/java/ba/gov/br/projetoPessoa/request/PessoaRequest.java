package ba.gov.br.projetoPessoa.request;

import lombok.Data;

@Data
public class PessoaRequest {

	private String nome;
	private Integer tipoIdentificador;
	private String identificador;
	
}
