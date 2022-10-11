package ba.gov.br.projetoPessoa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ba.gov.br.projetoPessoa.entidade.PessoaModel;
import ba.gov.br.projetoPessoa.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;

	public PessoaModel salvar(PessoaModel pessoaModel) {

		this.repository.save(pessoaModel);

		return pessoaModel;
	}

}