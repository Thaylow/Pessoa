package ba.gov.br.projetoPessoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ba.gov.br.projetoPessoa.entidade.PessoaModel;
import ba.gov.br.projetoPessoa.request.PessoaRequest;
import ba.gov.br.projetoPessoa.response.PessoaResponse;
import ba.gov.br.projetoPessoa.service.PessoaService;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	PessoaService pessoaService;

	@RequestMapping(path = "/salvarPessoa", method = RequestMethod.POST)
	public ResponseEntity<PessoaResponse> salvarPessoa(@RequestBody PessoaRequest request) {

		PessoaModel pessoaModel = new PessoaModel();

		PessoaResponse response = new PessoaResponse();

		if (request.getIdentificador() != null) {

			if (request.getIdentificador().length() == 11) {

				pessoaModel.setTipoIdentificador(1);
				pessoaModel.setIdentificador(request.getIdentificador());
				pessoaModel.setNome(request.getNome());
				pessoaService.salvar(pessoaModel);
				response.setMsg(" CPF Salvo com Sucesso ! ");

			} else if (request.getIdentificador().length() == 14) {

				pessoaModel.setTipoIdentificador(2);
				pessoaModel.setIdentificador(request.getIdentificador());
				pessoaModel.setNome(request.getNome());
				pessoaService.salvar(pessoaModel);
				response.setMsg(" CNPJ Salvo com Sucesso ! ");

			} else {
				response.setMsg(" Identificador Inválido! ");
			}

		} else {
			response.setMsg("Identificador é Obrigatório ! ");
		}

		return new ResponseEntity<>(response, HttpStatus.OK);

	}
}
