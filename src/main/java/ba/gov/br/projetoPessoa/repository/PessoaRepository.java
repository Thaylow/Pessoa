package ba.gov.br.projetoPessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ba.gov.br.projetoPessoa.entidade.PessoaModel;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {

}
